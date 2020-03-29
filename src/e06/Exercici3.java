package e06;

public class Exercici3 {

	public static int childTemp = 38;
	public static int childAge = 2;
	public static int childWeight = 40;
	public static int doseParacet;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (childTemp < 38) {
			System.out.println("El nen està bé.");
			} else if (childTemp < 39) {
					System.out.println("Es recomanable donar-li un bany per baixar la temperatura.");
			}
		if (childAge < 3 && childTemp < 40) {
			System.out.println("Has de consultar amb el metge.");
			} else  if (childAge < 12 && childTemp < 40) {
					doseParacet = 15*childWeight;
					System.out.println("Cal donar-li: "+doseParacet+" mg de paracetamol cada 8h.");
			} else if (childAge >= 12 && childTemp < 40) {
				doseParacet = 500;
				System.out.println("Cal donar-li: "+doseParacet+" mg de paracetamol cada 8h.");
			} else if (childAge > 0 && childTemp >= 40) {
				System.out.println("Per més de 40 cal portal-lo a l'hospital.");
			}
	}

}
