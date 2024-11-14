package user;

import java.util.*;

public class LabExer5A  {
	
		  

		public static void main(String arg[])  {
		
		
	        Scanner sc = new Scanner(System.in);
	 
	        int num = 50;
	        int attemp = 0;
	        int guess = 0;
	        int number = (int)(num * Math.random());
	        System.out.println( "Guess the number from 1 to 50");
	        
	        while (guess != number){
	         try {
	        	 
	         	  guess = sc.nextInt();
	                
	               
	            
	         	 if (guess > 50 || guess < 1){
	         		
		        	   throw new ArithmeticException();
		        	   
		           }
	         	 if (number > guess ) {
	            	System.out.println("The number is  greater than " + guess + " try again" );
	                attemp++;
	               
	            }
	           else if (number < guess) {
	            	System.out.println("The number is  less than " + guess + " try again " );
	                attemp++;
	                
	        }
	           
	           else {
	        	   System.out.println( "You got the number "+number + " in "+ attemp + " attemp(s)");
	           }
	        	 
	         }
	            	catch(InputMismatchException e) {
	                    System.out.println("invalid number");
	                    System.out.println( "Guess the number from 1 to 50");
	                    attemp++;
	                	sc.next();
	                    
		      }	 
	         catch(ArithmeticException k) {
	        	  System.out.println("out of range");
                  System.out.println( "Guess the number from 1 to 50");
                  attemp++;
              	  
	         }
	       
	        
            }  
       
		} 
         }
			
