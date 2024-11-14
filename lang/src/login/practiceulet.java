package login;
import java.util.*;

 class BloodData {
	 static String bloodtype;
	 static String rhFactor;
	 
	 public BloodData() {
		 
		 bloodtype = "O";
		 rhFactor = "+";
		 
		 
	 }
	
	 public BloodData(String bt , String rh) {
		 this.bloodtype = bt;
		 this.rhFactor = rh;
		 
	 }
	 
	 public void display() {
		 System.out.println(bloodtype + rhFactor + " is added to blood blank\n");
	 }

 } 

public class practiceulet{
	

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      String input1, input2;
   
	      do {
		     System.out.print("Enter blood type of patient: " );
		     input1 = sc.nextLine();
  		     System.out.print("Enter the rhesus factor(+ or -): " );
  		     input2 = sc.nextLine();
		     
	         
	         if (input1.equals("")|| input2.equals("") ) {
	        	 BloodData c = new BloodData();
	        	 c.display();
	        	 
	         }
	         else {
	        	 BloodData bd = new BloodData(input1,input2);
		         bd.display();
	         }
	      }while(input1.isEmpty() || input2.isEmpty());
	}
  }
