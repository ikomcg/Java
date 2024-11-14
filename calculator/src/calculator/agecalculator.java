package calculator;
import java.util.*;
public class agecalculator {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		agecalculator ac = new agecalculator();
		System.out.print("Enter birth year ");
		int birthyear= in.nextInt(); 
		ac.calculateage(birthyear);
		}
		public static void calculateage(int year) {
		
		int age = 2021 - year;
		System.out.println("your age is " + age);
	}

}
