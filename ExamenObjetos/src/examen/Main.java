/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author infot
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Client cli = new Client("Richard", "341321D");
        Targeta targ = new Targeta(15454872, 500, cli, "holahola123", 1);
        Compte com = new Compte(15454872,340, cli);
//        com.introduirDinersCom();
//        com.extraureDinersCom();
//        System.out.println(com.getMoney());        
        targ.extraureDinersTarg();
        System.out.println(targ.getSaldo());
        System.out.println(targ.getMoney());
    }

}
