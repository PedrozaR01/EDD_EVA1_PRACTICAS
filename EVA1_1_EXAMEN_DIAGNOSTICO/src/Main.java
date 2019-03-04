/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Antonio
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Primo pNum = new Primo();
        pNum.setiNum(27);
        pNum.esPrimo();
        
        Primo iNum2 = new Primo(27);
        iNum2.esPrimo();
        
    }
    
}

class Primo{ //default
    private int iNum;

    public Primo() {
    }
    
    public Primo(int iNum) {
        this.iNum = iNum;
    }

    public int getiNum() {
        return iNum;
    }

    public void setiNum(int iNum) {
        this.iNum = iNum;
    }
    
    public void esPrimo(){
        String sMensa = iNum + " " + "Es Primo";
        for(int i = 2; i <= iNum-1; i++){
           if((iNum % i) == 0){//No es primo
               sMensa = iNum + " " + "No es primo";
               break;
           } 
        }
        System.out.println(sMensa);
    }
}