package patrick;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
	public class guessgame {
	    public static void main(String[] args) throws Exception{
	        
	    System.out.println("WELCOME TO HANGMAN");
	    File dictionary = new File("d:\\words.txt");
	    
	    Scanner textScanner = new Scanner(dictionary);
	    Scanner input = new Scanner(System.in);
	    
	    ArrayList<String> words = new ArrayList<>();
	    
	    while (textScanner.hasNextLine()) {
	        words.add(textScanner.nextLine());
	    }
	    String hidden_text = words.get((int)(Math.random()*words.size()));
	    char[] textArray = hidden_text.toCharArray();
	    char[] myAnswers = new char[textArray.length];
	    
	    for(int i = 0; i < textArray.length; i++) {
	        myAnswers[i] = '?';
	        
	    }
	    System.out.println(myAnswers);
	    boolean finished = false;
	    int lives = 6;
	    while(finished == false) {
	        String letter = input.next();
	        
	  
	        boolean found = false; 
	        for (int i = 0; i<textArray.length; i++){
	            if (letter.charAt(0)==textArray[i]){
	                myAnswers[i] = textArray[i];
	                found = true;
	            }
	        }
	        if(!found){
	            lives--;
	            System.out.println("Wrong letter\n"); 
	        }
	        boolean done = true;
	        for (int i = 0; i<myAnswers.length; i++){
	            if (myAnswers[i]=='?') {
	                System.out.print(" ? ");
	                done = false;
	                
	            }
	            else {
	                System.out.print(" " + myAnswers[i]);
	            }
	        }
	        System.out.println("\n" + "Lives Left: " + lives); 
	     
	        
	        if (done) {
	            System.out.println("The word is " + hidden_text);
	            System.out.println("Congratulations you win!");
	            finished = true; 
	        }
	        if (lives <= 0) {
	            System.out.println("The word is " + hidden_text);
	            System.out.println("You lose - Try Again");
	            finished = true; 
	        }
	    }
	  }
}