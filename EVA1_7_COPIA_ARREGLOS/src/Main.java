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
        int [] iArray = new int [100];//Arreglo de 100 enteros
        
        for (int i = 0; i < iArray.length; i++) {//Lena el arreglo con valoreas aleatoreos
            iArray[i] = (int)((Math.random()*100)+1);
        }
        System.out.println("Arreglo original");
        System.out.println(iArray);//Se imprime la dirección de memoria
        for (int i : iArray) {//Imprime cada posición de arreglo
            System.out.print("[" + i + "]");
            
        }
        int[] iCopia = iArray;//Se crea una copia de la dirección de memoria
        System.out.println("\n");
        System.out.println("iArray = " + iArray);
        System.out.println("iCopia = " + iCopia);
        System.out.println("\n");
        System.out.println("Imprimiendo Copia: ");
        for (int i : iCopia) {
            System.out.print("[" + i + "]");
            
        }
        System.out.println("\n");//Salto de linea
        
    //Neceitamos un arreglo de 50 espacios
        System.out.print("Nuevo arreglo de 50 espacios");
        iArray = new int [50];
        System.out.println("");
        System.out.println(iArray);
        System.out.println("Imprimiendo Datos: ");
        for (int i : iArray) {
            System.out.print("[" + i + "]");
            
        }
       
        }
    }
    

