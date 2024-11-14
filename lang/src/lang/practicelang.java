package lang;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.Random.*;
public class practicelang{
	public static void main(String [] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		String []letter = new String[50];
		String [] guess = new String[50];		
		Random ran = new Random();
		int num = ran.nextInt(6)+1;
		int ctr = 0;
		int attemp = 5;
		boolean retry = true;
	
		System.out.println("Guess the word and it is all about name of country.");
		BufferedReader in = new BufferedReader(new FileReader("d:\\words.txt"));
		String data;
		
		try { 
		
		
		 while ((data = in.readLine()) != null) {
			 ctr+=1;
			 if (ctr == num) {
				 break;
			 }
		 }in.close();
		 
		 for(int i= 0; i < data.length(); i++) {
			 
			 letter[i] = String.valueOf(data.charAt(i));
			 guess[i] = String.valueOf(data.charAt(i));
		 }
		 for (int i = 0; i < 4 ; i++) {
			 int gno = ran.nextInt(data.length());
			 
			 if (letter[gno].equals("?")) {
				 i--;
				 
			 }
			 
			 else {
				 letter[gno] = "?";
			 }
		 }
		 System.out.println("You have only 5 attemps to guess the words");
		 System.out.print("The words you guess is ---> ");
			 for (int i = 0 ; i < data.length(); i++ ) {
				 
				 System.out.print(letter[i]);
				 
			 }
			 
			 do {
				 
				 System.out.println("\nEnter the words you guess:");
				 String let = sc.nextLine();
				 boolean invalid = false;
				do {
					if (let.length()<2) {
						let = String.valueOf(let.charAt(0));
						for(int i= 0; i < data.length(); i++) {
							if (let.equalsIgnoreCase(guess[i])) {
								letter[i] = let.toUpperCase();
								System.out.println("Correct ");
								invalid = true;
								retry = false;
							}
						}
						if (invalid == false) {
							attemp--;
							System.out.println("The Words "+ let + " is Wrong ");
							System.out.println("You have "+ attemp);
							retry = true;
							if (attemp == 0) {
								System.out.println("GameOver!! ");
								System.out.println("The Words is "+ data);
								System.exit(0);
							}
						}
						
						boolean hasq = true;
						
						for(int i= 0; i < data.length(); i++) {
							if (letter[i].equals("?")) {
								retry = false;
							    hasq = false;
								
							}
						}
						
						if (hasq == true ) {
							System.out.println("Congrats the word was " + data.toString());	
							retry = false;
							System.exit(0);
						}
						for (int i = 0 ; i < data.length(); i++ ) {
							 
							 System.out.print(letter[i]);
							 retry = false;
						 }	
						
					}
					
					
				}while(retry);
				 
			 }while(true);
			
			 
		 }catch(Exception e) {
		
			
	
		 }
		 
			 
		 }

}
	
