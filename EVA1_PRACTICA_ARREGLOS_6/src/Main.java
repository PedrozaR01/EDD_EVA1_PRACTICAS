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
        int [] aiArray = new int [50];
        int [] aiCopyP = new int [50];
        int iEven = 0;
        int iUneven = 0;
        
        llenar(aiArray);
        
        System.out.println("Arreglo original: ");
        imprimir(aiArray);
        
        for (int i = 0; i < aiArray.length; i++) {
            if(aiArray[i] % 2 == 0){
                iEven++;
            }
        }
        
        for (int i = 0; i < aiArray.length; i++) {
            if(aiArray[i] % 2 != 0){
                iUneven++;
            }
        }
        //par(aiArray, iEven);
        //impar(aiArray, iUneven);
        System.out.println("\nValores pares en el arreglo: " + iEven);
        System.out.println("Valores impares en el arreglo: " + iUneven);
        
        int [] aiPares = new int [iEven];
        int [] aiImpares = new int [iUneven];
        
        copiapares(aiArray, aiCopyP);
        //imprimir(aiCopyP);
        int l = 0;
        for (int i = 0; i < aiPares.length; i++) {
            if(aiCopyP[l] != 0){
                    aiPares[i] = aiCopyP[l];
                }else{
                if(aiCopyP[l]==0){
                    l++;
                    aiPares[i] = aiCopyP[l];
                }
            }
        }
        System.out.println("Arreglo de Pares: ");
        imprimir(aiPares);
    }
    
    public static void llenar (int [] aiArreglo){
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)(Math.random() * 100 + 1);
        }
    }
    
    public static void imprimir (int [] aiArreglo){
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        }
    
    }
    
   public static void copiapares(int [] aiArreglo, int [] copy){
       for (int i = 0; i < aiArreglo.length; i++) {
           if(aiArreglo[i] % 2 == 0){
               copy[i] = aiArreglo[i];
           }
       }
   }
}
