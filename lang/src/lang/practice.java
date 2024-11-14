package lang;

import java.util.*;


public class practice {

	public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         int tinapa = 35;
	         int canton = 25;
	         int egg = 12;
	         
	         int tinapa1 = 5;
	         int canton1 = 10;
	         int egg1 = 20;

	         
	         System.out.println("Ordering System");
	         System.out.println("-----------------------------------");
	         System.out.println("#Product        Price        Stock");
	         System.out.println("1. Tinapa         "+ tinapa +"           " + tinapa1);
	         System.out.println("2. canton         "+ canton +"           " + canton1);
	         System.out.println("3. egg            "+ egg +"           " + egg1);
	         System.out.println("-----------------------------------");
	         
	        
	        do {
	         System.out.print("Select your Order: ");
	         int sel = sc.nextInt();
	         System.out.print("Enter Quantity: ");
	         int quan = sc.nextInt();
	         
	         
	         if (sel==1) {
	     
	        	 System.out.print("PRoduct Price   ");
	        	 System.out.println("Quantity");
	        	 System.out.println("Tinapa    35     " + quan);
	        	 int min =    tinapa1 - quan;
	        	 System.out.println("Ordering System");
	 	         System.out.println("-----------------------------------");
	 	         System.out.println("#Product        Price        Stock");
	 	         System.out.println("1. Tinapa         "+ tinapa +"           " + min);
	 	         System.out.println("2. canton         "+ canton +"           " + canton1);
	 	         System.out.println("3. egg            "+ egg +"           " + egg1);
	 	         System.out.println("-----------------------------------");
	             
	         }
	         }while(0==0);
	         }
	         
	}

  
