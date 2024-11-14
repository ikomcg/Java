package user;
import java.util.*;

public class returnType {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Type your Name ");
		String name = sc.nextLine();
		
		Employee emp = new Employee();
		emp.setName(name);
		System.out.println("Hello " + emp.getName());
   
	}
}
class Employee{
	
	String name;
	public  void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name ;
	}
}
