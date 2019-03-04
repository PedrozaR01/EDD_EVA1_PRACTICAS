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
        int [][] aiArray = new int [100][100];
        
        System.out.println("Matriz Identidad: ");
        Identidad(aiArray);
        Imprimir(aiArray);
     }
    
    public static void Identidad(int[][] aiArreglo){
        /*
        En este método para hacer la matriz identidad se busca la condición de 
        que el valor de la columna y la fila sean el mismo. De esa forma la
        diagonal de 1 se irá haciendo a lo largo de la matriz
        */
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiArreglo[i].length; j++) {
                if(i==j){
                    aiArreglo[i][j] = 1;
                }else{
                    aiArreglo[i][j] = 0;
                }
            }
        }
    }
    
    public static void Imprimir(int [][] aiArreglo){
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiArreglo[i].length; j++) {
                System.out.print("[" + aiArreglo[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
