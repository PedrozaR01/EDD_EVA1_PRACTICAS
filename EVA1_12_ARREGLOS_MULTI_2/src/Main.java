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
        int [][][][][] aiArreX = new int [5][5][5][5][5];
        
        for (int i = 0; i < aiArreX.length; i++) {
            for (int j = 0; j < aiArreX[i].length; j++) {
                for (int k = 0; k < aiArreX[i][j].length; k++) {
                    for (int l = 0; l < aiArreX[i][j][k].length; l++) {
                        for (int m = 0; m < aiArreX[i][j][k][l].length; m++) {
                            aiArreX[i][j][k][l][m] = (int)((Math.random() * 100) + 1);
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < aiArreX.length; i++) {
            for (int j = 0; j < aiArreX[i].length; j++) {
                for (int k = 0; k < aiArreX[i][j].length; k++) {
                    for (int l = 0; l < aiArreX[i][j][k].length; l++) {
                        for (int m = 0; m < aiArreX[i][j][k][l].length; m++) {
                            System.out.print("[" + aiArreX[i][j][k][l][m] + "]"); 
                        }
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
