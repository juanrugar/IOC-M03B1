package e06;

public class Exercici2 {
	
	public static int scoreExam = 7; //between 0 and 10
	public static int numAssignments = 8; // between 0 and 10
	public static int scoreAssignments; //depends on the numAssignments
	public static int scorePractice = 1;//bbetween 0 and 10
	public static final int TOTAL_ASSIGNMENTS = 10;
	public static boolean nonFollowCA; 
	public static int finalScore;
	
	public static void main(String[] args) {
		
		int assignPercent = numAssignments/TOTAL_ASSIGNMENTS*100;
		int practicePercent = 70*scorePractice/100;
		if (scoreExam < 7) {
			System.out.println("Susp�s per prova final.");
		}
			if (assignPercent < 70) {
				System.out.println("Suspens. No has seguit avaluaci� continua.");
				nonFollowCA = true;
			}
				if (assignPercent == 100) {
					scoreAssignments = 10;
				}
					if (assignPercent >= 90) {
						scoreAssignments = 8;
					}
						if (assignPercent >= 80) {
							scoreAssignments = 6;
						}
							if (assignPercent >= 70) {
								scoreAssignments = 4;
							}
						
						finalScore = ((20*scoreExam/100)+(10*scoreAssignments/100)+(practicePercent));
						System.out.println(finalScore);
						

						if (finalScore <5) {
							System.out.println("Suspens amb nota de final de: "+finalScore+".");
							
							if (nonFollowCA) {
								System.out.println("Recomanaci�: cal seguir avaluaci� continua.");
							} else {
								System.out.println("Recomanaci�: fes els exercicis preparatoris per a la PAF2.");
							}
						}
	}

}
