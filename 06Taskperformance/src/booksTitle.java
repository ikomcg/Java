import java.util.*;


public class booksTitle {
	 public static void main(String[] args) {
	        Stack<String> booksTitle = new Stack<String>();
	        Queue <String> add = new LinkedList<String>();
	        Scanner sc = new Scanner(System.in);
  
	        System.out.println("Enter four book titles.");
	        int b = 4;
	        String enter;
	        int i = 0;
	        for (int x = 1; x <= b; x++) {
	            System.out.print("Book " + x + ": ");
	            booksTitle.add(enter= sc.nextLine());
	            
		
	        }
	        
	        while (i<b) {
	        	   add.add(booksTitle.pop());
	    		   i++;
	            	  
	    	   }
	             System.out.println("New order of books");
	              System.out.println(add);
	  }

}
