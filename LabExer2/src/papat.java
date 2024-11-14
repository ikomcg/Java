import java.util.*;
public class papat {
 
		public static void main(String[] args) {
			readInput();
			writtenOutput();
		}
		private static String itemName;
		private static double itemPrice;
		private static int itemQuantity;
		private static double amountDue;
		
		public static void setItemName(String newItemName){
			itemName=newItemName;
			}
			public static void setTotalCost(int quantity, double price){
			itemQuantity=quantity;
			itemPrice=price;
			
				}
				public static String getItemName(){
					
					return itemName;
					}
					public static double getTotalCost(){
						amountDue=itemQuantity*itemPrice;
						return amountDue;
						}
						public static void readInput(){
							Scanner s = new Scanner(System.in);
							String newItemName;
							int quantity;
							double price;
							System.out.println("Enter the name of the item you are purchasing ");
							newItemName=s.nextLine();
							setItemName(newItemName);
							System.out.println("Enter the quantity and price seperated by space ");
							quantity=s.nextInt();
							price=s.nextDouble();
							setTotalCost(quantity,price);
							}
							public static void writtenOutput(){
								System.out.println("You are purchasing "+itemQuantity+" "+getItemName()+"(s) "+itemPrice+" each");
								System.out.printf("Amount due is %.2f ", getTotalCost());
								}
							
	}


