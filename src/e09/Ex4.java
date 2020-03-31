/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e09;

import java.util.Scanner;

/**
 *
 * @author Joni Ruiz Garcia
 */
public class Ex4 {
    
    public static final int MIN_LIM = 0;
    public static final int MAX_LIM = 20;
    
     public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari = 0;
        int outOfRange = 0;
        boolean valorNOk=true;
        boolean negVal=true;
        while (valorNOk && negVal){
            outOfRange = outOfRange + valorUsuari;
            System.out.print("Introdueix un valor enter entre 0 i 20: ");
            valorUsuari = lector.nextInt();
            lector.nextLine();
            if((valorUsuari >= MIN_LIM)&&(valorUsuari <= MAX_LIM)){
              valorNOk=false;    
            }
            if (valorUsuari == -1) {
                negVal = false;
            }
        }
        if (!valorNOk){
        System.out.println("Dada correcta. Has escrit " + valorUsuari);
        } else if (!negVal) {
        System.out.println("Suma dels valors fora de marge: "+outOfRange);
        }
    }
}
