package e08;

import java.util.Scanner;

public class Looper2 {
	
		public static final int N_MIN = 0;
		public static final int N_MAX = 20;
		public static final int MULT_MAX = 100;
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int userNum = 0; int multNum = 0;
			boolean intNum;
			boolean rightNum = false;
			Scanner scan = new Scanner(System.in);
			
			
			while (!rightNum) {
				
				System.out.println("Please enter a number between 1 to 20: ");
				
				intNum = scan.hasNextInt();
				
				if (intNum) {
					userNum = scan.nextInt();
					
					//A temporary checkout for the int value
					System.out.println("Your number is "+userNum);
					if ((userNum > N_MIN) && (userNum <= N_MAX)) {
						rightNum = true;
						System.out.println(userNum + " is correct.");
					} else {
						scan.nextLine();
					}
					
				}
					
			}
			
			while (multNum <= MULT_MAX) {
				if (userNum*multNum <= MULT_MAX) {
							
				System.out.println(userNum*multNum);
				}
				multNum++;
			}

		}
}
