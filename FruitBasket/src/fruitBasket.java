import java.util.*;
public class fruitBasket {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		   Stack<String> Basket = new Stack<String>();
		  Queue <String> fruits = new LinkedList<>();
		   String input;
		   int num; 
		 
           System.out.println("Catch and eat any of these fruits:(apple ,orange, mango, guava) ");
           System.out.print("How many fruit would you like to catch: ");
           num = sc.nextInt();
           System.out.println("Choose a fruit to catch. Press A, O, M or G.");
           int i= 1 ;
              while (i<= num) {
              	 System.out.print("fruit " + i + " of " + num +": ");
              	 input = sc.next();
              	 if (input.equalsIgnoreCase("a")) {
              		Basket.push("apple");
              	 }
              	 else if (input.equalsIgnoreCase("o")) {
              		 Basket.push("orange");
              	 }
              	 else if (input.equalsIgnoreCase("m")) {
              		 Basket.push("mango");
              	 }
              	 else if (input.equalsIgnoreCase("g")) {
              		 Basket.push("guava");
              	 }
              	 i++;
              }


              System.out.println("Your basket now has " + Basket );
               while(!Basket.empty()) {
            	  System.out.print("Press E to eat a fruit: ");
                  String eat = sc.next();
                  Basket.pop();
               if(eat.equalsIgnoreCase("e")){
                  	
                  System.out.println("Fruit(s) in the basket: " + Basket);
                  
              }
               if (Basket.empty())
              {
                  System.out.println("No more fruits");
              }
              }	
	}

}
