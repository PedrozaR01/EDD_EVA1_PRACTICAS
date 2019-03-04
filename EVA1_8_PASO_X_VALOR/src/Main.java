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
        int[] aiArreglo = new int[100];
        llenar(aiArreglo);
        imprimir(aiArreglo);
        int iVal = 10;
        System.out.println("\niVal = " + iVal);
        incrementa(iVal);
        System.out.println("iVal = " + iVal);
    }
    
    public static void llenar(int []aiArre){//Método para llenar cualquier array
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int)((Math.random()*100)+1);
        }
    }
    public static void imprimir(int []aiArre){//Método para imprimir cualquier array
        for (int i : aiArre) {
            System.out.print("[" + i + "]");
        }
    }
    
    public static void incrementa (int i){
        i++;
    }
    
}
//Paso por valor --> se manda una copia del valor
//Paso por referencia --> se manda una dirección de memoria
