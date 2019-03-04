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
        int [] aiArray = new int[100];//arreglo de 100 elementos
        llenar(aiArray);
        System.out.println("Arreglo original");
        imprimir(aiArray);//imprime el arreglo original
        
        System.out.println("");
        
        int [] aiArray2 = new int[100];//Arreglo que va a almacenar valores impares
        
        impar(aiArray, aiArray2);
        
        System.out.println("\n Nuevo arreglo");
        imprimir(aiArray2);
        System.out.println("");
        
        System.out.println("\nSólo los valores impares");
        impares(aiArray2);//Función que sólo imprimirá los valores impares
        
    }
    
    public static void llenar(int aiArreglo[]){//mètodo para llenar el arreglo con nùmeros aleatoreos
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)((Math.random()*100)+1);
            
        }
    }
    
    public static void imprimir (int aiArreglo[]){// imprime los valores del arreglo
        for (int b : aiArreglo) {
            System.out.print("[" + b + "]");
        }
    }
    
   public static void impares (int aiArreglo[]){//Función que imprime valores impares
        for (int i : aiArreglo) {
            if (i != 0){
                System.out.print("[" + i + "]");
            }
        }
   }
    
    public static void impar (int aiArreglo[], int aiArreglo2[]){
       for (int i = 0; i < aiArreglo.length; i++) {//Si el valor dentro del 
        if (aiArreglo[i] % 2 != 0){                //Arreglo es impar se le
            aiArreglo2[i] = aiArreglo[i];          //Asigna dicho valor al otro
        }                                          //Arreglo
        }
    }
}