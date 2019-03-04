
import java.util.Scanner;

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
        Scanner Inpt = new Scanner(System.in);
        
        System.out.println("Ingresa un valor y un segundo valor que será la"
                + " potencia");
        System.out.println("Primer Valor: ");
        int iBase = Inpt.nextInt();
        
        System.out.println("Segundo Valor: ");
        int iPot = Inpt.nextInt();
        
        System.out.println(nPot(iBase, iPot));
    }
    
    public static int nPot(int iVal1, int iVal2){
        if(iVal2>1){
            iVal1 = iVal1 * iVal1; 
            return nPot(iVal1, iVal2-1);
        }
        else{
            return iVal1;
        }
        
        
    }
}
