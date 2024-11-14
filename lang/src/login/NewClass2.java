package login;
import java.io.*;
import java.util.*;

public class NewClass2{  

	public static void main(String [] args) throws IOException
	{
		
		//	public static final Comparator<secretWord> CASE_INSENSITIVE_ORDER;
		
		int maxTries = 7;
		int wordLength;
		boolean solved;
		StringBuffer guessedLetters = new StringBuffer();
		
		//the fileScan gets the first word for the game
		Scanner fileScan = new Scanner(new FileInputStream("d:\\words.txt"));
		String secretWord = fileScan.next();
		
		//Creates a StringBuffer for the viewing of the letters guessed
		StringBuffer word = new StringBuffer();
		for(int i = 0; i <= secretWord.length(); i++)
		word.append("_");
		System.out.println(word);
		
		
		System.out.println("Welcome to the game of HANGMAN!!!!");
		System.out.println("You will have 7 chances to guess what the word is.");
		
	
			
			
			
		//	System.out.println("Your word is " + wordLength + " letters long.");
			
	
			String letter;
			while(maxTries > 0)
			{
			System.out.println("The letters that you have guessed are: " + guessedLetters);
			System.out.print("Please enter a letter to guess: ");
			Scanner inScan = new Scanner(System.in);
			letter = inScan.next();
			guessedLetters.append(letter + " ");	
			
			if(secretWord.indexOf(letter) != (-1))
			{
				 secretWord.indexOf(letter);
				 System.out.println("correct");
			}
			else
				maxTries--;
			System.out.println("You have " + maxTries + " wrong guesses left.");
			}
			
		
	
	}
}