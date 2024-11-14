import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

	import java.io.FileWriter;
	import java.io.BufferedWriter;
	import java.lang.Exception;
	import java.util.Scanner;
	import java.lang.System;
	import java.io.IOException;

	public class trylang {
	    public static void main(String[] args)throws IOException
	    {
		
				
			
			Scanner s = new Scanner(System.in);
		     System.out.print("User Name: ");
		    String username = s.next();
		    System.out.print("Password: ");
		    String passwords = s.next();
			FileWriter writer = new FileWriter("d://record.txt",true);
			BufferedWriter bWriter = new BufferedWriter(writer);
			
			try {
			bWriter.write(username);
			bWriter.write(passwords);
			bWriter.newLine();
	   	bWriter.close();
	   	writer.close();	   	
	    System.out.print("Enter your username: ");
	    String user = s.next();
	    System.out.print("Enter your passwords: ");
	    String pass = s.next();
	    
	    
	    if (user.equals(username) || pass.equals(pass)) {
	    	 System.out.print("Congrats you login ");
	    	
	    } 
	    else {
	    	System.out.print("Invalid username or password");
	    }
	   	
			}catch(Exception e) {
				
			}
			
		
			
			
			
		}
	}