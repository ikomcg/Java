import java.util.*;
public class Countdown {
      
    	 
        	  public static void main(String[] args) {	  
    	  
    	  int num;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("enter number");
    	  num=sc.nextInt();
    	  countup(num);
    	  
        	  
    
      } 
        	  public static void countup(int n)
              {
            	  if (n>10) {
            		 
            		  System.out.println("Stop");
            		  
            	  }
            	  else {
            		
            		  System.out.println(n);
            		  countup(n+1);
            		
            		
            	  }
              }
}

