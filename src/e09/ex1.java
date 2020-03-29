package e09;

public class ex1 {
	
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
