import java.util.*;
public class binaryRecursion {
	      
              public static int fib(int num){
	    	
	    	   int sum; 
		       int previousNumber = 0;
			   int nextNumber = 1;    
			   
	           for (int i = 1; i<=num; i++) {
	        	   
	        	   System.out.println(previousNumber);
		             sum = previousNumber + nextNumber;
		             previousNumber = nextNumber;
		             nextNumber = sum;
		             
	           }
			  
	        return num;
}
	        public static void main(String[] args) { 
	
			 int number;
			 Scanner sc = new Scanner(System.in);
			 System.out.print("Enter a number higher than 0: ");
			 number = sc.nextInt();
		     fib(number);
		     
		}	
}
