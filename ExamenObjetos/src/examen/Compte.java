/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author infot
 */
public class Compte implements Serializable {

    static Scanner in = new Scanner(System.in);
    private int numCompte;
    private double money;
    public Client cli;

    public Compte() {
    }

    public Compte(int numCompte, double money, Client cli) {
        this.numCompte = numCompte;
        this.money = money;
        this.cli = cli;
    }    
    
    public double preguntaIntroduir() {
        double dinersInt;
        System.out.println("Dona'm la quantitat que vols introduir");
        dinersInt = in.nextDouble();       
        return dinersInt;
    }
    
    public void introduirDinersCom(){
        double dinersInt;
        dinersInt=preguntaIntroduir();
        setMoney(getMoney() + dinersInt);
    }

    public double preguntaExtraure() {
        double dinersExt;        
        System.out.println("Dona'm la quantitat que vols extraure");
        dinersExt = in.nextDouble();
        return dinersExt;
    }
    
    public void extraureDinersCom(){        
        double dinersExt;
        double dinersTotals;        
        dinersExt=preguntaExtraure();
        dinersTotals = getMoney() - dinersExt;
        if (dinersTotals > -5000) {
            setMoney(dinersExt);
        }else{
            System.out.println("No pots extraure aquesta quantitat");
        }        
    }

// <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }
    // </editor-fold>
}
