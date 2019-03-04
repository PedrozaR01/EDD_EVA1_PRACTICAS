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
        Main pObj = new Main();
        Main pObj2 = new Main();
        System.out.println(pObj);
        System.out.println(pObj2);
        
        Main pCopia = pObj;
        System.out.println(pCopia);
        
        pObj = null;
        pObj2 = null;
        
        System.out.println(pObj);
        System.out.println(pObj2);
        System.out.println(pCopia);
        //Garbage Collector --> Se encarga 
        //De liberar memoria de objetos no
        //referenciados
    }
    
}
