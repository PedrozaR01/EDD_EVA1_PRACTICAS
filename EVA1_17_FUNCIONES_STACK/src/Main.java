/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Antonio 18550354
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicia Main");
        String sCade = "Hola " + cadena();
        System.out.println(sCade);
        System.out.println("Termnina Main");
    }
    
    public static String cadena(){
        System.out.println("Inicia Cadena");
        System.out.println("Termina Cadena");
        return "Mundo";
    }
 
}
