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
public class Ex3 {
    
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari = 0;
        int count = 0;
        boolean valorNOk=true;
        boolean countExceed=true;
        
        while (valorNOk && countExceed){
            count = count + 1;
            System.out.print("Introdueix un valor enter entre 0 i 5: ");
            valorUsuari = lector.nextInt();
            lector.nextLine();
            if((valorUsuari >= 0)&&(valorUsuari <= 5)){
              valorNOk=false;    
            }
            if (count >=3) {
               countExceed=false;
            }
        }
        if (!valorNOk) {
        System.out.println("Dada correcta. Has escrit " + valorUsuari);
        } else if (!countExceed) {
        System.out.println("Ha superat el nombre d'entrades permesa.");
        }
    }
}
