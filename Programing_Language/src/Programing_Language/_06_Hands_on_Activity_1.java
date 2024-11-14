package Programing_Language;
import java.util.Scanner;
public class _06_Hands_on_Activity_1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 6-digit number: ");
        int number = scanner.nextInt();

        int removed = number % 10;
        int digit = number / 10;

        int remainder = digit % 7;
        boolean isEqual = remainder == removed;
        System.out.println(isEqual);

    }
}






