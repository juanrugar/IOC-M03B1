/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e06;

/**
 *
 * @author Joni Ruiz García
 */
public class Exercici1 {
 
    public static int ageStudent = 12;
    public static int schoolClass;
    public static int schoolCycle;
    public static String eduLevel;
           
    public static void main(String[] args){
        
        if (ageStudent < 3) {
            System.out.println("Warning! The student is too young.");
        }                    
	        if (ageStudent > 3 && ageStudent < 7){
	                schoolCycle = 0;   
	        
	        }       if (ageStudent > 6 && ageStudent < 8) {
	                    schoolCycle = 1;
	                    schoolClass = 1;
	                
	        		}    if (ageStudent > 7 && ageStudent <9) {
	                        schoolCycle = 1;
	                        schoolClass = 2;
	                    
	        			}   	if (ageStudent > 8 && ageStudent <10) {
	                            schoolCycle = 2;
	                            schoolClass = 3;
	                        
	        					}    if (ageStudent > 9 && ageStudent <11) { 
		                                schoolCycle = 2;
		                                schoolClass = 4;
	                            
		        					}  if (ageStudent > 10 && ageStudent <12) { 
			                                    schoolCycle = 3;
			                                    schoolClass = 5;
			                                
		        							}	if (ageStudent >= 11 && ageStudent <13) { 
				                                        schoolCycle = 3;
				                                        schoolClass = 6;
				                                         
		        								}   
		        							
				        							if (ageStudent > 12 ) { 
				                                   	 	schoolCycle = 4;
				                                   	 	schoolClass = 0; 				                                    }  
				        							
			                                    	switch (schoolCycle) {
											            case 0:  eduLevel = "Student is in Pre-school Education.";
											                     break;
											            case 1:  eduLevel = "Student is in Primary Education. Initial Cycle.";
											                     break;
											            case 2:  eduLevel = "Student is in Primary Education. Medium Cycle.";
											                     break;
											            case 3:  eduLevel = "Student is in Primary Education. Upper Cycle.";
											                     break;  
											            case 4:  eduLevel = "Student age is not suitable for the School";
											           			break;
											        }
			                                    	
										            System.out.println(eduLevel);													
										            System.out.println("The student level: "+ schoolClass);
										            
		   }
}
