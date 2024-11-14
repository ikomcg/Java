package TaskPerformace;
import java.util.Scanner;

public class Game {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correct = 0;
		String[][] question = {
				 {"What is the deepest point in the world?", "Mariana Trench"},
                 {"In which ocean Maria Trench is located?", "Pacific Ocean"},
                 {"Which country connects South America and North America?", "Panama"},
                 {"Asia and Europe are connected through which country?", "Turkey"},
                 {"Which two continents are connected through Egypt?" ,"Asia and Africa"}
		};
		
		System.out.println("Trivia Question\n");
		
		for(int i = 0; i < question.length; i++) {
			
			String ques = question[i][0];
			String ans = question[i][1];
			int num = i+1;
			
			
			System.out.println(num + " " + ques );
			System.out.print("Your answer: ");
			String answer = sc.nextLine();
			System.out.println("\n");
			
			if(answer.equalsIgnoreCase(ans)) {
				correct += 2;
			} 
			
			if(i+1 == question.length) {
				System.out.println("Your score:" + correct);
			}
			
			
			
		}
		                    
		                    
				
	}

}
