package algorithmGame;
import java.util.*;
public class game {

	public static void main(String[] args) {
	  
		String  asks;
		Scanner games = new Scanner(System.in);		
		System.out.println("Start the Game" );			 		
		String  name;
		System.out.println("Enter Name: ");
		name = games.nextLine();
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
			
	         System.out.println("Press/type ok to start the Battle ");
   	          ask = game.next();
   	 
	        if(ask.equalsIgnoreCase("ok")) {
	        	 System.out.println("-The Battle Start on first Level . ");
		         String answer;	
		         System.out.println("You defeated Enemy? ");
		           answer = game.next();
	       
	        
	    
		    
		  if(answer.equalsIgnoreCase("yes")) {
		    	 System.out.println("enter to the next level? ");
		    	 answer = game.next();
		    }
		    if(ask.equalsIgnoreCase("yes")) {	 
		    	System.out.println(" Fight the final Enemy/Boss ");
				   answer = game.next();	
		    
		    }
		   
		    if(answer.equalsIgnoreCase("yes")) {
		    	 System.out.println("You defeated the Enemy/Boss? ");    	
				   answer = game.next();
			  
		    }
		    
		    if(answer.equalsIgnoreCase("yes")) {
			    	 System.out.println("you defeated the boss.");
			    	 System.out.println("You won.");
			    	 
			   }
	        else {
		    	
				   System.out.println("you lose/Died");
                 }
	           
                 } 
	                 System.out.print("Play Again? ");
                      x=game.next();
		 
           }       
		           while(x.equalsIgnoreCase("yes")); 
                   while(x.equalsIgnoreCase("no")) {
                   System.out.print("exit ");
                   break;
       }
   }
}