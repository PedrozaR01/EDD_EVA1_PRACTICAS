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
        int[] aiDatos = new int [1000000];
        //System.out.println(Integer.MAX_VALUE);
        for (int i = 0; i < aiDatos.length; i++) {
            for (int j = 0; j < aiDatos.length; j++) {
                aiDatos[j] = (int)(Math.random() * 100 + 1);
            }
            
        }
    }
    
}
