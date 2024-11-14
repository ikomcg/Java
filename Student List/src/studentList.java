import java.util.*;
public class studentList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map <String, String> students = new HashMap<>();
	   
		String num = null;
		String name;
		for (int i = 1 ; i <= 3; i++) {
			System.out.print("Enter student Number " + i + ": ");
		    num = sc.nextLine();
		    System.out.print("Enter first name " + i + ": ");
		    name = sc.nextLine();
			students.put(num,name);
		}
					
		    System.out.println("Student List ");
		  		   
		 for (Map.Entry x: students.entrySet()) {
				
			System.out.println(x.getKey() +" - " + x.getValue());
			}
		   	
		System.out.print("Enter your student Number: ");
		String mynum = sc.nextLine();
		System.out.print("Enter first name: ");
		String myname = sc.nextLine();	
		students.remove(num);
		students.put(mynum, myname);
		
		
		System.out.println("Student List ");
		   
		for (Map.Entry x: students.entrySet()) {
				
				System.out.println(x.getKey() +" - " +x.getValue());
			}
	}

}
