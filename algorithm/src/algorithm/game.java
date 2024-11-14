package algorithm;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
	

		 
		Scanner games = new Scanner(System.in);		
		System.out.println("Start the Game" );			 		
		String name,asks;
		
		System.out.println("Enter Name: ");
		name = games.next();
		System.out.println("-Hello "+ name);         
	    System.out.println("Skip Tutorial?");
	    asks = games.next();
	   
	    if(asks.equalsIgnoreCase("yes")) {
			
	 }
		
	    else if(asks.equalsIgnoreCase("no")) {
		       System.out.println("-Start tutorial");
		       System.out.println("-End tutorial");
		
	 }
	 
		   String x,ask;
			 
			 Scanner game = new Scanner(System.in);
	   
		 do {
		
			 System.out.println("-Create/choose player"); 
			 System.out.println("-Choose fighting Equipment"); 
			 //After choose player and Equipment
	         System.out.println("Press/type ok to start the Battle ");
   	          ask = game.next();
   	 
	        if(ask.equalsIgnoreCase("ok")) {
			
	       } 
	         System.out.println("-The Battle Start at Level 1 . ");
	         int damage;	
	       
	         
	         System.out.println("The Enemy have 10hp life ");
	         System.out.print("Input damage attack: ");  
	         damage = game.nextInt();
	    
		    if(damage>=10) {
		    	 System.out.println("You defeated the Enemy. "); 
		    	 System.out.println("level 2. ");
		    	 System.out.println("The 2 Enemy have each 20hp life. ");
		    	 System.out.print("Input damage attack: "); 
		    	 damage = game.nextInt();
		    }
		    if(damage>=20) {	 
		    	 System.out.println("You defeated 1  Enemy 1 remaining. ");
		    	 System.out.print("Input damage attack: "); 
		    	 damage = game.nextInt();
		    	
		    
		    }
		    if(damage>=20) {	 
		    	 System.out.println("You defeated 2 Enemy. ");
		    	 System.out.println(" Final level. ");
		    	 System.out.println("Final Enemy/Boss have 100hp life.");
		    	 System.out.print("Input damage attack: ");   
		    	 damage = game.nextInt();	
		
		    }
		    if(damage>=100) {
		    	 System.out.println("You defeated the Enemy/Boss. ");    	
			    	 System.out.println("You won.");
			    	 
			   }
	        else {
	        	System.out.println("-The "+ damage +"% Damage attack is lower than life of enemy.");
	        	System.out.println("-The enemy attack you");
				   System.out.println("-YOU DIED/LOSE.");
                 }
	        
	                System.out.print("Play Again? ");
		             x=game.next();	       
                 } while(x.equalsIgnoreCase("yes")); 
		           while(x.equalsIgnoreCase("no")) {
			       System.out.print("exit ");
			       break;
		 }
    }
}
