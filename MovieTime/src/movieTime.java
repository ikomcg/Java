import java.util.*;
public class movieTime {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		Queue<String> movie = new LinkedList<String>();
		Queue<String> snacks = new LinkedList<String>();
		
		int num = 3;
		String enter;
		
		for (int i = 1; i <= num; i++) {
			
		    System.out.print("Enter movie "+ i + " of "+ num+": ");
		    movie.offer(enter = sc.nextLine());
		}
		
		for (int i = 1 ; i <= num; i++) {
			
			System.out.print("Enter snack " + i + " of "+ num + ": ");
			snacks.offer(enter = sc.nextLine());
		}
		
            System.out.println("Movies to watch  are: "+ movie);
            System.out.println("Snacks available are: " + snacks);
            
            while(!snacks.isEmpty()) {
          	  System.out.print("Press s each time you finish a snacks: ");
                String eat = sc.next();
                
                snacks.poll();
                System.out.println("Snacks available: " + snacks);
               
            
             if (snacks.isEmpty())
            {
                System.out.println("No more snacks");
            }
            }	
	}

}
