package p01;

import java.util.Scanner;

public class remoteWorkMonitor2 {

	/* constant variables declaration:
	 * min and max of code int value; 
	 * min and max of category int value; 
	 * categories' names;
	 * min and max of department' int value
	 * departments' names
	 * min and max of months' int value
	 * months' names
	 * min day and max days depending the month (29, 30, 31)
	 * min and max connection period
		*/
	public static final int MIN_CODE = 99;
	public static final int MAX_CODE = 999;
	public static final int MIN_CAT = 1;
	public static final int MAX_CAT = 3;
	public static final String CAT_J = "Junior";
	public static final String CAT_S = "Senior";
	public static final String CAT_M = "Manager";
	public static final int MIN_DPT= 0;
	public static final int MAX_DPT = 4;
	public static final String DPT_IT = "IT";
	public static final String DPT_COM = "COM";
	public static final String DPT_DSS = "DSS";
	public static final String DPT_ADM = "ADM";
	public static final String DPT_SLS = "SLS";
	public static final int MIN_MNTH = 1;
	public static final int MAX_MNTH = 12;
	public static final String M_JAN = "January";
	public static final String M_FEB = "February";
	public static final String M_MAR = "March";
	public static final String M_APR = "April";
	public static final String M_MAY = "May";
	public static final String M_JUN = "Juny";
	public static final String M_JUL = "July";
	public static final String M_AGT = "August";
	public static final String M_SEP = "September";
	public static final String M_OCT = "October";
	public static final String M_NOV = "November";
	public static final String M_DEC = "December";
	public static final int MIN_DAY = 1;
	public static final int MAX_DAYFEB = 29;
	public static final int MAX_DAYAJSN = 30;
	public static final int MAX_DAY = 31;
	public static final int MIN_CON = 0;
	public static final int MAX_CON = 1440;
	
	/*declared these non-constant outside main class declaration for become static along all program runtime; used to store Sting values of names for category,
	 * department and months  */
	public static String emCat, emDpt, logMnth;
	
	public static void main(String[] args) {	
		
		//variable declaration
		int employeeCode, employeeCategory, employeeDept, mnth, day, connection;
		boolean correctData, correctDate;
		
		//Data entry method declaration
		Scanner scan = new Scanner(System.in);
		
		//Welcome and employee code user entry
		System.out.println("Greetings and welcome to the remote working monitoring system.\nPlease enter your code (99 - 999): ");
		correctData = scan.hasNextInt();
		
		//code data entry type validation; invalid entry referred in line 209
			if(correctData) {
				employeeCode = scan.nextInt();
				//code value validation; invalid entry referred in line 
				if(employeeCode>=MIN_CODE && employeeCode<=MAX_CODE) {
					//employee category data user entry
					System.out.println("Code verified. Please, enter your category:\nJunior(1), Senior(2), or Manager(3); ");
					correctData = scan.hasNextInt();
					//category data entry validation; invalid entry referred in line
					if(correctData) {
						employeeCategory = scan.nextInt();
						//category value validation
						if(employeeCategory>= MIN_CAT && employeeCategory <= MAX_CAT) {
							//category variable assignment to constant String variable for final data user report depending of the employeeCategory value
							switch (employeeCategory) {
								case 1: emCat = CAT_J; 
								break;
								case 2: emCat = CAT_S; 
								break;
								case 3: emCat = CAT_M; 
								break;
							}
							//Employee department user data entry
							System.out.println("Category verified. Please, enter your department:\nIT(0), COM(1), DSS(2), ADM(3), SLS(4)");
							correctData = scan.hasNextInt();
							//category user entry data type validation
							if (correctData) {
								employeeDept = scan.nextInt();
								//category data value validation; invalid entry referred in line
								if (employeeDept>= MIN_DPT && employeeDept<=MAX_DPT) {
									switch (employeeDept) {
									case 0: emDpt = DPT_IT; 
									break;
									case 1: emDpt = DPT_COM; 
									break;
									case 2: emDpt = DPT_DSS; 
									break;
									case 3: emDpt = DPT_ADM; 
									break;
									case 4: emDpt = DPT_SLS; 
									break;
									}
								//month user entry	
								System.out.println("Department verified. Please enter current Month (1-12): ");
								correctData = scan.hasNextInt();
								//Month data type validation
								if (correctData) {
									mnth = scan.nextInt();
									//Month value validation
									if (mnth >= MIN_MNTH  && mnth <=MAX_MNTH) {
										//month variable assignment to constant String variable for final data user report depending of the mnth value
										switch (mnth) {
											case 1: logMnth = M_JAN; 
											break;
											case 2: logMnth = M_FEB; 
											break;
											case 3: logMnth = M_MAR; 
											break;
											case 4: logMnth = M_APR; 
											break;
											case 5: logMnth = M_MAY; 
											break;
											case 6: logMnth = M_JUN; 
											break;
											case 7: logMnth = M_JUL; 
											break;
											case 8: logMnth = M_AGT; 
											break;
											case 9: logMnth = M_SEP; 
											break;
											case 10: logMnth = M_OCT; 
											break;
											case 11: logMnth = M_NOV; 
											break;
											case 12: logMnth = M_DEC; 
											break;
										}
										//Day user data entry
										System.out.println("Month verified. Please enter current day (1-31): ");
										correctData = scan.hasNextInt();
										//Day user entry data type validation
										if (correctData) {
											day = scan.nextInt();
												//Day value filtering (depending on month's duration and validation 
												if ((mnth == 2) && (day>=MIN_DAY && day<=MAX_DAYFEB)) {
													correctDate = true;
												} else if ((mnth == 4 || mnth == 6 || mnth == 9 || mnth == 11) && (day>= MIN_DAY && day<=MAX_DAYAJSN)) {
													correctDate = true;
												} else if ((mnth == 1 || mnth == 3 || mnth == 5 || mnth == 7 || mnth == 8 || mnth == 10 || mnth == 12) && (day >= MIN_DAY && day <= MAX_DAY))	{
													correctDate = true;
												} else {
													correctDate = false;
													//System.out.println("Day not valid. Please, begin login again.");
												}
											//Here's the mentioned day value on month's length validation
											if (correctDate) {
												//Connection period user data entry
												System.out.println("Day verified. Please, enter connection period (0 - 1440 min):");
												correctData = scan.hasNextInt();
												//Connection period user entry data type validation
												if (correctData) {
													connection = scan.nextInt();
													//entry value validation
													if (connection>= MIN_CON && connection<= MAX_CON) {
														//Final user data login report
														System.out.println("Connection period verified.\nThanks for logging in. This is your user data: ");
														//Screen output data use main class int variables and class string variables
														System.out.println("Code\tCategory\tDepartment\tDate\tConnection period\n"
														+employeeCode+"\t"+emCat+"\t"+"\t"+emDpt+"\t"+"\t"+day+"/"+logMnth+"\t"+connection+" min");
														System.out.println("Thanks for logging in. Have a nice day!");
													
													} else {
														//Invalid value entry for connection period warning
														System.out.println("Connection time out of range. Please, begin login again.");
													}
												} else {
													//Connection period invalid data type entry warning
													System.out.println("Wrong data type. Please, begin login again.");
												}
												
											} else {
												//Day-month mismatch error
												System.out.println("Invalid entry: Day does not match month lenght. Please, begin login again.");
											}
										} else {
											//Day invalid data type
											System.out.println("Wrong data type. Please, begin login again.");
										}
											
									} else {
										//Month value invalid entry
										System.out.println("Not a valid month. Please, begin login again.");
									}
										
									} else {
										//Month data type invalid entry
										System.out.println("Wrong data type. Please, begin login again.");
									}
										
									} else {
										//Department data value invalid entry
										System.out.println("Not a valid department. Please, begin login again.");
									}
										
									} else {
										//Department data type invalid entry
										System.out.println("Wrong data type. Please, begin login again.");
									}
								} else {
									//Category data value invalid entry
									System.out.println("Not a valid category. Please, begin login again.");
								}
							
							} else {
								//Category data type invalid entry
								System.out.println("Wrong data type. Please, begin login again.");
							}
								
				} else {
					//Code value invalid entry
					System.out.println("Code number out of range. Please, begin login again.");
				}
			
			} else {
				//Code data type invalid entry
				System.out.println("Wrong data type. Please, begin login again.");
			}
		
	}
}
