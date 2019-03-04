
import java.util.Scanner;

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
        Scanner Inpt = new Scanner(System.in);
        int iProm = 0;
        
        System.out.println("Ingresa la cantidad de edades a capturar: ");
        int iEdades = Inpt.nextInt();
        int[] aiEdad = new int[iEdades];
        
        for (int i = 0; i < aiEdad.length; i++) {
            System.out.println("Ingresa la edad: ");
            int iEdad = Inpt.nextInt();
            aiEdad[i] = iEdad;
        }
        
        for (int i = 0; i < aiEdad.length; i++) {
            iProm += aiEdad[i];
            
        }
        
        for (int i : aiEdad) {
            System.out.println("Edad: " + i);
        }
        
        System.out.println("El promedio es: " + iProm/aiEdad.length);
    }
    
}
