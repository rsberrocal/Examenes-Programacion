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
public class Client implements Serializable {
    static Scanner in = new Scanner(System.in);
    
    private String nomCli;
    private String dniCli;

    public Client() {
    }

    public Client(String nomCli, String dniCli) {
        this.nomCli = nomCli;
        this.dniCli = dniCli;
    }
    
    public void nouClient(){
        System.out.println("Introdueix el nom del nou client");
        this.nomCli=in.nextLine();
        System.out.println("Introdueix el DNi de"+this.getNomCli());
        this.dniCli=in.nextLine();                
    }    
    public void mostraClient(){
        System.out.println("Nom\tDNI");
        System.out.println(this.getNomCli()+"\t"+this.getDniCli());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    // </editor-fold>
    
}
