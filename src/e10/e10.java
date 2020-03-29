package e10;

import java.util.Scanner;

public class e10 {
	
	//constant variables declaration
	public static final int NUM_MIN = 20;
	public static final int NUM_MAX = 100;
	//a specific constant for Part 3
	public static final int LOOP_EXEC = 2;
	

	public static void main(String[] args) {
		
		//local variables for limit value
		int userNum = 0;
		int evenTotal = 0;
		Scanner scan = new Scanner(System.in);
		boolean correctType = false;
	    boolean correctValue = false;
	    boolean execTwice = false;
	    
	    //PART 3 - Loop the 1 and 2 parts twice only
	    //using a for loop we can iterate the number of times when the do/while loop boolean is correct
	    for (int j = 1; j <=LOOP_EXEC; j++) {
	    	//set the condition for boolean true     	
	    	if (j<3) {
	    		execTwice = true;
	    
				    	do {
							//data entry
							System.out.println("Please, enter a integer number within limits (20-100): ");
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
							
							//Part 2 - even number sorting and total sum
							
							for (int i = 0; i<= userNum; i++) {
								
								if (!(i % 2 == 0)) {
									System.out.println(i);
									evenTotal = evenTotal + i;
								}
							}
							
							System.out.println("Total sum of even numbers up to "+userNum+" is: "+evenTotal);
							
							 
							
				    	} while (execTwice);
	
	    		}
	    	}
	   }

}
