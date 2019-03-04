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
        int[][] aiMatriz = new int [3][];
        aiMatriz[0] = new int[15];
        aiMatriz[1] = new int[3];
        aiMatriz[2] = new int[100];
        System.out.println(aiMatriz);
        System.out.println(aiMatriz[0]);
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[2]);
        System.out.println(aiMatriz[0][0]);
        
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1);
            }
        }
        
        for (int[] aiMatriz1 : aiMatriz) {
            for (int b : aiMatriz1) {
                System.out.print("[" + b + "]");
            }
            System.out.println("");
        }
    }
    
}
