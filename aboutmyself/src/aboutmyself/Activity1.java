package aboutmyself;
import java.util.*;
public class Activity1 {

	public static void main(String[] args) {
	
		char input;
		
		Scanner enter = new Scanner(System.in);
		System.out.print("You want to about me?-Y if yes and N if no: ");
		input = enter.next().charAt(0);
	    
	     
		 if (input=='Y')
		 {
			 mydetails me = new mydetails();
			 me.personaldetails();
			 me.hobbies();
			 mysibling x = new mysibling();
			 x.mysister();	
			
		 }
	
		 else if (input=='N')
		 {
			System.out.println("EDI DON'T bye!!!");
			
		 }	
	
		 else {
			System.out.println("Input Error");
			System.out.println("End");
		 
		 }
	}
}
 	    	      

