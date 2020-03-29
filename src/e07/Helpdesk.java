package e07;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joni Ruiz García
 */
public class Helpdesk {
    
    //variables declaration
        
    public static final int SUPERRED_VAT = 4;
    public static final int RED_VAT = 8;
    public static final int GENERAL_VAT = 21;
    /* public static final int PRODCAT_MEDICINE = 1;
    public static final int PRODCAT_FLOUR = 2;
    public static final int PRODCAT_VETMEDICINE = 3;
    public static final int PRODCAT_WATER = 4;
    public static final int PRODCAT_COSMETICS = 5;    
    public static final int PRODCAT_BOOZE = 6; */
    public static final int SHIP_LOW = 3;
    public static final int SHIP_MED = 20;
    public static final int SHIP_TOP = 50;
    
    
    //main class
    public static void main (String[] args) {
       
        double totalCost, finalCost, prodcatVAT = 0, finalVAT, shippingCost, productBaseCost;
        int unitsRequested, prodCat;
        int deskOption;
        boolean validOption, validUnit;
        Scanner scan = new Scanner(System.in);     
        
        System.out.println("Welcome to the Helpdesk.\nPlease, choose an option:\nCalculate total cost (1);\nShow apllied VAT (2);\nShow shipping cost (3)");
        validOption = scan.hasNextInt();
        
                if (validOption) {
                    deskOption = scan.nextInt();
                    
                    if (deskOption == 1) {
                        System.out.println("Please enter the base cost of the product: ");
                        productBaseCost = scan.nextDouble();
                        System.out.println("Please enter units requested: ");
                        validUnit = scan.hasNextInt();
                        
                        if (validUnit) {
	                        unitsRequested = scan.nextInt();
	                         
	                        System.out.println("Please enter product category:\nMedicines(1)\nFlour(2)\nVeterinarian Medicine(3)\nWater(4)\nCosmetics(5)\nAlcoholic Beverages(6)");
	                        prodCat = scan.nextInt();
		                        switch (prodCat){
		                            case 1: prodcatVAT = SUPERRED_VAT;
		                            break;
		                            case 2: prodcatVAT = SUPERRED_VAT;
		                            break;
		                            case 3: prodcatVAT = RED_VAT;
		                            break;
		                            case 4: prodcatVAT = RED_VAT;
		                            break;
		                            case 5: prodcatVAT = GENERAL_VAT;
		                            break;
		                            case 6: prodcatVAT = GENERAL_VAT;
		                            break;
		                        }
	                        totalCost = productBaseCost*unitsRequested;
	                        finalVAT = prodcatVAT/totalCost*100;
	                        finalCost = productBaseCost*unitsRequested+finalVAT;
	                        System.out.println("The total cost of purchase is: "+finalCost+" euros.");
	                        System.out.println("Thanks for your inquiry. Come back soon.");
                        } else {
                        	System.out.println("Invalid input. Please restart the inquiry.");
                        }
                    }   
                    
                    if (deskOption == 2 ) {
                    	System.out.println("Please enter product category:\nMedicines(1)\nFlour(2)\nVeterinarian Medicine(3)\nWater(4)\nCosmetics(5)\nAlcoholic Beverages(6)");
                        prodCat = scan.nextInt();
                        switch (prodCat){
                            case 1: prodcatVAT = SUPERRED_VAT;
                            break;
                            case 2: prodcatVAT = SUPERRED_VAT;
                            break;
                            case 3: prodcatVAT = RED_VAT;
                            break;
                            case 4: prodcatVAT = RED_VAT;
                            break;
                            case 5: prodcatVAT = GENERAL_VAT;
                            break;
                            case 6: prodcatVAT = GENERAL_VAT;
                            break;
                        }
                        System.out.println("The VAT applied is "+prodcatVAT+" %.");
                        System.out.println("Thanks for your inquiry. Come back soon.");
                    }
                    
                    if (deskOption == 3 ) {
                    	System.out.println("Please enter the base cost of the product: ");
                        productBaseCost = scan.nextDouble();
                        System.out.println("Please enter units requested: ");
                        unitsRequested = scan.nextInt();
                        
                        totalCost = productBaseCost*unitsRequested;
                        if (totalCost<100) {
                        	shippingCost = 3;                        			
                        } else if (totalCost>100 && totalCost<500) {
                        	shippingCost = 20; 
                        } else {
                        	shippingCost = 50;
                        }
                       System.out.println("The shipping cost of purchase is "+shippingCost+" euros.");
                       System.out.println("Thanks for your inquiry. Come back soon.");
                    }
                    
                    
                } else {
                    System.out.println("Please enter a valid inquiry number.");
            }       
    }
}
