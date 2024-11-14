import java.util.Scanner;
  
       class AmountDue{
    	  static double tax = .12;

   	    static void computeAmountDue(double price) {
   	    	double Tax = price * tax;
   	        double ammount = price + Tax;
   	        System.out.println("Amount due is: " + ammount);
   	    }

   	    static void computeAmountDue(double price, int quantity) {
   	        double Tax = price * tax;
   	        double ammount = price * quantity;
   	        double totalammount = ammount + Tax;
   	        System.out.println("Amount due is: " + totalammount);
   	    }

   	    static void computeAmountDue(double price, int quantity, double discount) {
   	    	double Tax = price * tax;
   	        double ammount = price * quantity; 
   	        double totalamount = ammount - discount; 
   	        double totalamount2 = totalamount + Tax;
   	        System.out.println("Amount due isL: " + totalamount2);
   	    }

   	}

public class RunAmountDue {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int num;
		 System.out.println("Press any of the following then enter values seperated by spaces ");
		  AmountDue due = new AmountDue();
	      System.out.println("Press any of the then enter values separated by spaces: ");
	      System.out.println("1 - Price only");
	      System.out.println("2 - Price, Quantity");
	      System.out.println("3 - Price, Quantity, and discount amount");
	      num = sc.nextInt();
	      
	      if (num =='1') {
	    	  System.out.print("Enter Price: ");
	    	  due.computeAmountDue(sc.nextDouble());
	      }
	      else if (num == '2'){
	    	  System.out.print("Enter Price and Quantity: ");
	    	  due.computeAmountDue(sc.nextDouble(), sc.nextInt());
	      }
	      else {
	    	  System.out.print("Enter Price, Quantity and Discount Amount: ");
	    	  due.computeAmountDue(sc.nextDouble(), sc.nextInt(), sc.nextDouble());
	      }

	}

}
