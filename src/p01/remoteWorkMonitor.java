package p01;

import java.util.Scanner;

public class remoteWorkMonitor {

	// variables declaration

	public static String employeeCat;
	public static String employeeDpt;
	public static String month;
	
	public static void main(String[] args) {	
		
		//variable declaration
		int employeeCode, employeeCategory, employeeDept, mnth, day, connection;
		boolean correctData, correctDate;
		
		//Data entry method declaration
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Greetings and welcome to the remote working monitoring system.\nPlease enter your code (99 - 999): ");
		correctData = scan.hasNextInt();
		
			if(correctData) {
				employeeCode = scan.nextInt();
				if(employeeCode>=99 && employeeCode<=999 ) {
					System.out.println("Code verified. Please, enter your category:\nJunior(1), Senior(2), or Manager(3); ");
					correctData = scan.hasNextInt();
					if(correctData) {
						employeeCategory = scan.nextInt();
						if(employeeCategory == 1 || employeeCategory == 2 || employeeCategory == 3) {
							switch (employeeCategory) {
								case 1: employeeCat = "Junior"; 
								break;
								case 2: employeeCat = "Senior"; 
								break;
								case 3: employeeCat = "Manager"; 
								break;
							}
							System.out.println("Category verified. Please, enter your department:\nIT(0), COM(1), DSS(2), ADM(3), SLS(4)");
							correctData = scan.hasNextInt();
							if (correctData) {
								employeeDept = scan.nextInt();
							
								if (employeeDept>= 0 && employeeDept<=4) {
									switch (employeeDept) {
									case 0: employeeDpt = "Information Tech - IT"; 
									break;
									case 1: employeeDpt = "Communications - COM"; 
									break;
									case 2: employeeDpt = "Design - DSS"; 
									break;
									case 3: employeeDpt = "Administration - ADM"; 
									break;
									case 4: employeeDpt = "Sales - SLS"; 
									break;
									}
								System.out.println("Department verified. Please enter current Month (1-12): ");
								correctData = scan.hasNextInt();
								
								if (correctData) {
									mnth = scan.nextInt();
									if (mnth >= 1 && mnth <13) {
										switch (mnth) {
											case 1: month = "January"; 
											break;
											case 2: month = "February"; 
											break;
											case 3: month = "March"; 
											break;
											case 4: month = "April"; 
											break;
											case 5: month = "May"; 
											break;
											case 6: month = "June"; 
											break;
											case 7: month = "July"; 
											break;
											case 8: month = "August"; 
											break;
											case 9: month = "September"; 
											break;
											case 10: month = "October"; 
											break;
											case 11: month = "November"; 
											break;
											case 12: month = "December"; 
											break;
										}
										System.out.println("Month verified. Please enter current day (1-31): ");
										correctData = scan.hasNextInt();
										if (correctData) {
											day = scan.nextInt();
												if ((mnth == 2) && (day>=1 && day<=29)) {
													correctDate = true;
													
												} else if ((mnth == 4 || mnth == 6 || mnth == 9 || mnth == 11) && (day>=1 && day<=30)) {
													correctDate = true;
												} else {
													correctDate = false;
													System.out.println("Day not valid. Please, begin login again.");
												}
											
											if (correctDate) {
												
												System.out.println("Day verified. Please, enter connection time (0 - 1440):");
												correctData = scan.hasNextInt();
												if (correctData) {
													connection = scan.nextInt();
													if (connection>=0 && connection<=1440) {
														System.out.println("Connection time verified.\nThanks for logging in. This is your user data: ");
														System.out.println("Your Code is "+employeeCode
																+"\nYou are a "+employeeCat+" employee"
																+ "\nYou work in "+employeeDpt+" department\nToday is "+month+" "+day
																+"\nand your connection time is "+connection);
														System.out.println("Thanks for logging in. Have a nice day!");
													
													} else {
														System.out.println("Connection time out of range. Please, begin login again.");
													}
												} else {
													System.out.println("Wrong data type. Please, begin login again.");
												}
												
											} 
										} else {
											System.out.println("Wrong data type. Please, begin login again.");
										}
											
									} else {
										System.out.println("Not a valid month. Please, begin login again.");
									}
										
									} else {
										System.out.println("Wrong data type. Please, begin login again.");
									}
										
									} else {
										System.out.println("Not a valid department. Please, begin login again.");
									}
										
									} else {
										System.out.println("Wrong data type. Please, begin login again.");
									}
								} else {
									System.out.println("Not a valid category. Please, begin login again.");
								}
							
							
							} else {
								System.out.println("Wrong data type. Please, begin login again.");
							}
								
					

				} else {
					System.out.println("Code number out of range. Please, begin login again.");
				}
			
			} else {
				System.out.println("Wrong data type. Please, begin login again.");
			}
		
	}
}
