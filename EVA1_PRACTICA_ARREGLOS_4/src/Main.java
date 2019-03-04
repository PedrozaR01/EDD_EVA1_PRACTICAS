/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] aiArray1 = new double[5][5];
        double [][] aiArray2 = new double[5][5];
        double [][] aiResults = new double[5][5];
        
        llenar(aiArray1);
        llenar(aiArray2);
        
        System.out.println("Matrices: ");
        System.out.println("1: ");
        imprimir(aiArray1);
        System.out.println("2: ");
        imprimir(aiArray2);
        
        for (int i = 0; i < aiResults.length; i++) {
            for (int j = 0; j < aiResults[i].length; j++) {
                aiResults[i][j] = aiArray1[i][j] * aiArray2[i][j];
            }
        }
        
        System.out.println("Matriz con el producto de cada posición de las"
                + " primeras matrices");
        imprimir(aiResults);
    }
    
    public static void llenar(double aiArreglo[][]){
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiArreglo[i].length; j++) {
                aiArreglo[i][j] = (Math.random() * 10 + 1);
            }
        }
 
    }
    
    public static void imprimir(double aiArreglo[][]){
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiArreglo[i].length; j++) {
                System.out.println("[" + aiArreglo[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
