
import java.util.*;

public class sayHi {

	public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    String Try;
	    do {
	    	
	    
	    System.out.println("Enter your password ");
	    String pass = sc.nextLine();
	    System.out.print("your password is ");
	    
	   
	    if (pass.length() >= 8) {
	    	
	    	System.out.println("goods");
	    	
	    }
	    
	    else {
	    	
	    	System.out.println("bad");
	    }
	    System.out.print("try again: ");
	     Try = sc.nextLine();
	}while(Try.equalsIgnoreCase("yes"));
		 }
        
	   }

  
