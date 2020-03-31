/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e09;

/**
 *
 * @author Joni
 */
public class Ex1 {
    
    public static void main(String[] args) {
        int i, resultat;
        i = resultat = 0;
        while ((i<20)){
            resultat = resultat + i*2;
            System.out.println(i+": "+resultat+" ");
            i++;
            if(resultat>10){
                resultat=0;
            }
        }
    }
}
