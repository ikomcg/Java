package user;

import java.util.*;

public class LabExer5B {


	public static void main(String[]args){
       
		   Scanner sc= new Scanner(System.in);
           int question =10;
           int score = 0;
        
           String [] answer;
    
           String[][] questionArray  ={
			{"What is the largest big cat?","\nA. Lion \nB. Tiger\nC. Cheetah","B"},
			{"What land animal can open its mouth the widest?","\nA. Hippo \nB. Crocodile \nC. Baboon","A"},
            {"What is the largest animal on Earth?","\nA. The African elephant \nB. The blue whale \nC. The sperm whale","B"},
			{"What is the only flying mammal?","\nA. The bat \nB. The flying squirrel \nC. The bald eagle","A"},
			{"What is an animal called that eats plants and meat?","\nA. Carnivore \nB. Herbivore \nC. Omnivore","C"},
			{"Why do sea otters hold hands?","\nA. Because they love each other \nB. To show they’re in the same family \nC. So they don’t float away when they’re sleeping","C"},
			{"How can you tell an insect and a spider apart?","\nA. Insects have three body parts; spiders have two. \nB. Insects have six legs; spiders have eight. \nC. All of the above.","C"},
			{"What does the duck-billed platypus do that hardly any other mammals do?","\nA. Quacks like a duck \nB. Lays eggs \nC. Builds nests","B"},
            {"Why do snakes stick out their tongue?","\nA. To scare predators \nB. To “smell” the air \nC. To make a hissing sound","b"},
			{"What is it called when there are no more of one kind of animal left on Earth?","\nA. Evolution \nB. Conservation \nC. Extinction","c"}
			

 };
		
          answer = new String[( int) question];
         
	for (int i = 0 ; i<question; i++) {
		
		
	try{

		System.out.print((i+1) + ")" + questionArray[i][0] +questionArray[i][1]+ "\n");
		 answer[i]=String.valueOf(sc.nextLine());

		  if(questionArray[i][2].equalsIgnoreCase(answer[i])) {
			System.out.println("Answer Correct!!");
			score++; 
	  }
			
		  else if(  answer[i].equalsIgnoreCase("a") || answer[i].equalsIgnoreCase("b") || answer[i].equalsIgnoreCase("c")){
			  System.out.println("Wrong Answer the correct answer is " + questionArray[i][2]);
			  
	  }			
	      else if ( answer[i].equals("")){
	    	      i--;
		          throw new NullPointerException();
	  }
          else {
        	      i--;
                  throw new InputMismatchException();
      }
		 
           
		 
      }
	 

        catch(InputMismatchException ex){
                 System.out.println("---Invalid letter A, B, C only---");
                 System.out.println("---Try Again---");
      }
        catch(NullPointerException ex){
                 System.out.println("---No answer---");
                 System.out.println("---Try Again---");
                 
      }

	  }
	                          
	System.out.println("You score is "+ score + " out of "+ question);
	
      }
}

