package TaskPerformace;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	Random random = new Random();
	int guess;
	
	public Hangman() {
		guess = random.nextInt(50); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hangman number_to_guess = new Hangman();
		int number = number_to_guess.guess;
		
		int lives = 5;
		
		System.out.println("Welcome To the Guessing Game\n");
		System.out.println("Guess The Number 1 to 50");
		System.out.println("You have 5 lives to guess the number\n");
		System.out.print("Enter Your Name ");
		String name = sc.nextLine();
		
		try {
			
			do {
				System.out.print("\nEnter your guess -> ");
				int guess = sc.nextInt();
				
				if(lives == 1 && guess != number) {
					System.out.println("Game Over!");
					System.out.println("The number was " + number + " Try again Next time!");
					return;
				}
				else if(guess < number) {
					System.out.println("The number you guess is greater than " + guess);
					lives --;
				}
				else if(guess > number) {
					System.out.println("The number you guess is lower than " + guess);
					lives --;
				}
				else if(guess == number ) {
					System.out.println("Your guess of " + guess + " is correct! Congratulations "+ name +"!");
					return;
				}
				
			}while(lives != 0);
			
		}catch(Exception e) {
			System.out.println("Invalid guess!");
		}
		
		

	}

}
