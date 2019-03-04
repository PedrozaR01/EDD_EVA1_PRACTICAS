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
        //Stack --> LIFO
        //LIFO --> Last in First out
        //FIFO --> First in First out
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A"); 
    }
    public static void B(){
         System.out.println("Inicia B");
         C();
         //int iResu = 1/0;
        System.out.println("Termina B");
    }
    public static void C(){
         System.out.println("Inicia C");
        System.out.println("Termina C");
    }
    
}
