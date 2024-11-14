package multiplication;

import java.util.Scanner;

public class mikooo {
	public static int find_sum(int enter) {
		
		 int x = 0, ans = 0;
			while(x<enter) {
				x++;
				ans = ans += x;	
	
	}	return(ans);	
}
	 
	public static void main(String[] args) {
	
		int enter;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter number: ");
		enter= num.nextInt();	
		System.out.println("The sum of the first number " + enter + " integers is " + find_sum(enter));
		  
	}
	
}
