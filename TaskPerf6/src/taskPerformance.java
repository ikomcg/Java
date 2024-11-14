
import java.io.*;
import java.util.Scanner;

public class taskPerformance{
    

	    
	    static Scanner scan;
	    public static void main(String[] args)throws IOException{
	    	
	    	
	    	do {
			Scanner sc = new Scanner(System.in);
	              System.out.print("Login or Register? ");
	              String login = sc.nextLine();
	              
	              
	                 if(login.equalsIgnoreCase("Register")){
	            
	               
	                       System.out.print("Enter User Name: ");
	                       String username = sc.next();
	                       System.out.print("Enter Password: ");
	                       String password = sc.next();
			               FileWriter writer = new FileWriter("d:\\record.txt",true);
			               BufferedWriter bWriter = new BufferedWriter(writer);
	                       bWriter.write(username);
	                       bWriter.newLine();
	                       bWriter.write(password);
	                       bWriter.newLine();
	                       bWriter.close();
	                       bWriter.close();
	                
	            }
	             else if(login.equalsIgnoreCase("Login")){
	                
	                     System.out.print("UserName: ");
		                 String user = sc.nextLine();
	                     System.out.print("Password: ");
		                 String pass = sc.nextLine();
	                     String path = "d:\\record.txt";
		                 login(user,pass,path);
	         }

	                 
	              } while(true);
	    
	    }
	    public static void login(String user,String pass,String path){
	   
	             String username = "";
	             String password = "";
	     
	             try{
	            	 do {
	            	 Scanner con = new Scanner(System.in);
	            	 String confirm;
	            	 scan = new Scanner(new File(path));
	                 username = scan.next();
	                 password = scan.next();
					
	  
	                if(username.equals(user) && password.equals(pass)){
	                       System.out.println("Success Login");

	    }
	             else if (user.trim().isBlank() || pass.trim().isEmpty()){
	            	 System.out.println("Fill up all Requirments");
	                 
	                
	    }
	             else {
	            	 
	            	 System.out.println("Invalid password or username");
	             }
	                System.out.print("Register?");
	                confirm = con.next();
	               if (confirm.equalsIgnoreCase("No")) {
	            	   System.out.print("Ok Bye");
	            	   System.exit(0);
	               }	
					
	             }while(true);
	            	 
	             }
	       
	           catch(Exception e){
	                      System.out.println(e);
	       }
	    }
	}