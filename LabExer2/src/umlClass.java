import java.util.*;
public class umlClass{
	
        private static String itemname;
        private static double itemprice;
        private static int itemquantity;
        private static double amountdue;
	
        
	public static void setitemname(String newitemname) {
		
		itemname = newitemname;
	}
	
	public static void settotalcost(int quantity, double price){
		
		itemquantity = quantity;
		itemprice = price;
        
	}
	public static String getitemname() {
		
		return itemname;
		
	}
      public static double gettotalcost() {
    	  
    	   amountdue = itemquantity * itemprice;
    	   return amountdue;

}

	public static void readinput(){
		Scanner sc =  new Scanner(System.in);
		String newitemname;
		int quantity;
		double price;
		System.out.print("Enter the name of the item you are purchase ");
	    newitemname = sc.next();
	    setitemname(newitemname);
		System.out.print("Enter the quantity and price seperated by a space ");
		quantity = sc.nextInt();
		price = sc.nextDouble();
		settotalcost(quantity,price);
		
     }
	
	public static void writeoutput() {

		System.out.printf("Amount due is %.2f ",gettotalcost());
		 
	}
	public static void main(String[] args) {
	     readinput();
	     System.out.println("You are purchasing "+ itemquantity + " "+ getitemname ()+ "(s) "+ "at " + itemprice + " each.");
	     writeoutput();
	     
    }
  }	
