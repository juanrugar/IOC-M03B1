package e10;

import java.util.Scanner;

public class e10 {
	
	//constant variables declaration
	public static final int NUM_MIN = 20;
	public static final int NUM_MAX = 100;
	

	public static void main(String[] args) {
		
		//local variables for limit value
		int userNum = 0;
		Scanner scan = new Scanner(System.in);
		boolean correctType = false;
	    boolean correctValue = false;
		//data entry
		System.out.println("Please, enter a integer number withim limits (20-100): ");
		correctType = scan.hasNextInt();
		//data type validation
		if (!correctType) {
			//invalid data type entries rejected
			System.out.println("Not an integer number. Please, try again.");
		} else {
				//if data type valid, it enters the loop
			do {	userNum = scan.nextInt();		
					correctValue = ((userNum >= NUM_MIN) && (userNum <= NUM_MAX));
					System.out.println("Enter a valid value, please.");
			} while (!correctValue);
			
			System.out.println(userNum+ " is within limits.");
		}
		
	}

}
