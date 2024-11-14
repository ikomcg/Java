
import java.util.*;
import java.io.*;
import java.nio.file.*;


public class Login {

	static Scanner s= new Scanner(System.in);
	static Path fileName = Paths.get("records.txt");
	

	public static void main(String[] args) {
	

       new Login(); }
	   public Login() {
		try {
		
		 System.out.println("1. Create User Account");
		 System.out.println("2. Login User Account");
		 System.out.print("Enter: ");
		 String press = s.nextLine();
		 
		 if(press.equals("1")) {
			 System.out.println("");
			 System.out.println("Enter username:");
			 String userName = s.nextLine();
			 System.out.println("Enter Password:");
			 String password=  s.nextLine();

		    FileWriter writer = new FileWriter("d:\\records.txt");
			BufferedWriter bw = new BufferedWriter(writer);
		
			bw.write(userName);
			bw.write(password);
			bw.close();
			System.out.println("Acount has been succesfully saved! ");		 
			
		 }
		  if (press.equals("2")) {

				
			  File file = new File("d:\\records.txt");
			  FileReader fr;
			  
			System.out.println("Enter username: ");
			String username = s.nextLine();
			System.out.println("Enter password: ");
		    String password = s.nextLine();
		
			
	
		 fr = new FileReader(file);
		BufferedReader br = new BufferedReader (fr);
		String line;
		
		
		while ((line = br.readLine()) != null) {
			String [] split = line.split(", ");
			
			username = split [0];
			password = split[0];
			
			if (username.equals(username) && password.equals(password)) {
			
		 
			 System.out.println("Successfully Logged in!");

		 }
		else {
			 System.out.println("Incorrect Username or Password ");

		}
		 
		}
	 }
	
	}
		catch(Exception ex){
		
		 System.out.println(ex.getMessage());
		}
	   }
}
  
