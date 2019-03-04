
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
        System.out.println("Introduce un número: ");
        int iNum = sCaptu.nextInt();
        sCaptu.nextLine();
        recursiveUp(iNum, 1);
        //recursiveDown(iNum);
        /*for (int i = iNum; i >= 1; i--) {
            System.out.println(i + " - ");
        }*/
    }
    
    public static void recursiveDown(int iVal){
        /*
        1. LLAMADA RECURSIVA: El método debe llamarse a si mismo
        2. DETENERSE: El método debe proporcionar maneras para detener
        la recursión
        */
        System.out.print(iVal + " - ");
        if(iVal == 1){
            
        }
        else{
        recursiveDown(iVal - 1);    
        }
        
    }
    
    public static void recursiveUp(int iVal, int iCont){
        System.out.print(iCont);  
        if(iCont == iVal){
            System.out.println(iCont);
        }else {
            recursiveUp(iVal, iCont + 1);
        }
    }
}
