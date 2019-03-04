
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
        Scanner sCaptu = new Scanner(System.in);
        
        System.out.println("Introduce dos valores para buscar el GCD: ");
        System.out.println("Primer valor: ");
        int iNum1 = sCaptu.nextInt();
        System.out.println("Segundo valor: ");
        int iNum2 = sCaptu.nextInt();
        
        System.out.println(GCD(iNum1, iNum2));
        
    }
    
    public static int GCD(int iVal1, int iVal2){
        int iResi = 0;
        int iResu = 0;
        iResu = iVal1/iVal2;
        iResi = iVal1%iVal2;
        if (iResi == 0){
        return GCD(iVal2,iResi);
        } else{
            return iResi;
        }
    }
}
