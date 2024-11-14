
import java.util.*;

 class BloodData2 {
	  String bloodtype = "O";
	  String rhFactor = "+";
	
	public void setBloodType(String newBloodType) {
		
		bloodtype = newBloodType;
		 
	 }
	 public String getBloodType() {
		 
		 return bloodtype;
	 }
	 public void setRHFactor(String newRHFactor) {
		 rhFactor = newRHFactor;
		 		 
	 }
	 public String getRHFactor() {
		 return rhFactor;
	 }
	 public void display() {
		  System.out.println(getBloodType() + getRHFactor()+ " is added to blood blank\n");
	 }

 } 
 
public class runBloodData2{
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      String input1, input2;
   
	      do {
	    	  BloodData2 bd = new BloodData2();
		     System.out.print("Enter blood type of patient: ");
		     input1 = sc.nextLine();
		     bd.setBloodType(input1);
  		     System.out.print("Enter the rhesus factor(+ or -): " );
  		     input2 = sc.nextLine();
		     bd.setRHFactor(input2);
	         
		     if (input1.equals("") || input2.equals("")) {
	        	 BloodData c = new BloodData();
	        	 c.display();
	        	 
	         }
	         else {
	        	 BloodData b = new BloodData(input1,input2);
		         bd.display();
	         }
	         
	      }while(input1.isEmpty() || input2.isEmpty());
	}
  }

