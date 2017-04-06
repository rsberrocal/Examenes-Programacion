/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author infot
 */
public class Targeta extends Compte implements Serializable {

    private static int max = 500;
    private double saldo;
    private String pin;
    private int estat;//1:tancada 2:oberta 3:bloquejada;

    public Targeta() {
    }

    public Targeta(int numCompte, double money, Client cli, String pin, int estat) {
        super(numCompte, money, cli);
        this.saldo = money;
        this.pin = pin;
        this.estat = estat;
    }

    public void extraureDinersTarg() {
        String path = "fitxers/historial.txt";
        String historial;
        double dinersExt;
        double dinersTotals;
        if (getMoney() < 0) {
            System.err.println("No es poden extraure diners, només pots ingresar");
        } else {
            dinersExt = preguntaExtraure();
            if (dinersExt >= 500) {
                System.err.println("No pot retirar aquesta quantitat");
            } else {
                dinersTotals = getMoney() - dinersExt;
                setMoney(dinersTotals);
                setSaldo(dinersTotals);
                historial = "L'usuari " + this.cli.getNomCli() + " amb el dni " + this.cli.getDniCli() + " ha retirat " + dinersExt + "€\n";
                Escribir(path, historial);
            }
        }
    }

    private static void Escribir(String path, String text) {
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter(path, true))) {
            out.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public static int getMax() {
        return max;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getEstat() {
        return estat;
    }

    public void setEstat(int estat) {
        this.estat = estat;
    }

    // </editor-fold>
}
