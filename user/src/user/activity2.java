package user;

import java.util.Scanner;

public class activity2 {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int x,y,mult;
		
		System.out.print("Enter number: ");
		x = enter.nextInt();
		System.out.print("Multiply me to self n5 time: ");
		y=enter.nextInt();
		mult = ((int)Math.pow(x,y));
		
		System.out.println("Answer: "+ mult);
	    }		
}
