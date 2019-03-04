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
        int[] iArray;//Referencia --> 1 BYTE
        iArray = new int[100];//int --> 4 bytes = 400 bytes
        
        for(int i = 0; i < iArray.length; i++){
            iArray[i] = (int)((Math.random()*100)+1);
        }
        for (int i : iArray) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
        
        for (int i = 0; i < iArray.length; i++) {
            System.out.println("[" + iArray[i] + "]");
        }
    }
    
}
