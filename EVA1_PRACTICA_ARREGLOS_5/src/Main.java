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
        int [] aiArray = new int [50];//Arreglo de 50 elementos
        
        llenar(aiArray);//Llama la función para llenar el arreglo
        System.out.println("Arreglo completo: ");
        imprimir(aiArray);//Llama la función que imprime el arreglo
        
        System.out.println("\n");
        
        System.out.println("Imprimiendo los pares solamente: ");
        imprimirpares(aiArray);//Llama a la funcón que imprime los valores pares
    }
    
    public static void llenar(int aiArre[]){//Función para llenar con números 
        for (int i = 0; i < aiArre.length; i++) {//aleatorios un arreglo
            aiArre [i] = (int)(Math.random() * 100 + 1);
        }
    }
    
    public static void imprimir(int aiArre[]){//Imprime el arreglo completo
        for (int b : aiArre) {
            System.out.print("[" + b + "]");
        }
    }
    
    public static void imprimirpares(int aiArre[]){//Imprime los valores pares 
        for (int i = 0; i < aiArre.length; i++) {//del arreglo
            if(aiArre[i] % 2 == 0){
                System.out.print("[" + aiArre[i] + "]");
            }
        }
    }
}
