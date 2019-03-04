
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
        System.out.println("Introduce un valor: ");
        int iNum = Inpt.nextInt();
        Inpt.nextLine();
        
        //Usando el for
        System.out.println("Factorial (" + iNum + ") - " + factorial(iNum));
        
        //Usando factorial recursivo
         System.out.println("Factorial (" + iNum + ") - " + factorialRecu(iNum));
    }
    
    public static int factorial(int iVal){//mètodo for para obtener el factorial
        int iResu = 1;
        for (int i = 1; i <= iVal; i++) {
            iResu = iResu * i;
            //iResu *= i;
        }
        
        return iResu;
    }
    
    public static int factorialRecu(int iVal) {//factorial usando la recursividad 
        if(iVal == 0){
            return 1;
        }else{
        return iVal * factorialRecu(iVal - 1);
    }
    
    }
}
