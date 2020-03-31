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
public class Ex2 {
    
    public static void main(String[] args) {
        int i, resultat;
        boolean seguir=true;
        i = resultat = 0;
        while ((resultat<10)&&(seguir)){
            resultat = resultat + i;
            System.out.println(i+": "+resultat+" ");
            i++;
             if(i>19){
                seguir=false;
            }
        }
    }
}
