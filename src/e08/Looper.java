package e08;

import java.util.Scanner;

public class Looper {
	
	public static final int N_MIN = 0;
	public static final int N_MAX = 20;
	public static int userNum;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 0;
		boolean intNum;
		boolean rightNum = false;
		Scanner scan = new Scanner(System.in);
		
		
		while (!rightNum) {
			
			System.out.println("Please enter a number between 1 to 20: ");
			
			intNum = scan.hasNextInt();
			
			if (intNum) {
				userNum = scan.nextInt();
				System.out.println("Your number is "+userNum);
				if ((userNum > N_MIN) && (userNum <= N_MAX)) {
					rightNum = true;
					System.out.println(userNum + " is correct. Thanks for your entry.");
				} else {
					intNum = false;	
				scan.nextLine();
				}
			}
				
		}
	}
}
