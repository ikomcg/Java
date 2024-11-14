package findsum;
import java.util.*;
public class sum {
	public static void main(String[] args) {
		int  number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number; ");
		number =sc.nextInt();
		
	
		int factorial=0;
		int i=0;
        
		for( i = 1; i <= number; i++)
        {
            factorial += i;
        }
        
        System.out.println("Factorial of number " + number + " is " + factorial);
    
    }
}
