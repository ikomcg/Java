package multiplication;
import java.util.*;
public class ret {
	public static void main(String[] args) {
	  

		 int count;
	    Scanner sc = new Scanner(System.in);
	  
	    System.out.println(" Count number ");
	   count = sc.nextInt();
	   
        int prev = 1; 
        int num = 1;
        
        int i = 1;
	while (i<=count) {
		  i++;
		num=  prev + num;
		System.out.println(num - 1);
	  }
	}
}
