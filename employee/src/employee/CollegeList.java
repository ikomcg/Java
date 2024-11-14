package employee;
import java.util.*;

class Person{
	
	private String name, contactNum;
	
	public void setName (String n) {
		 name = n;
	}
	public String getName() {
		return name;
	}
	public void setContactNum(String c) {
        contactNum = c;
	}
	public String getContactNum() {
		return contactNum;
	}
	
	
}

class Employee extends Person{
	
	private double salary;
	private String department;
	
	public void setSalary(double s) {
	 salary = s;
	} 
	public double getSalary() {
		return salary;
		
	}
	
	public void setDepartment(String d) {
		department = d;
	}
	public String getDepartment() {
		return department;
	}
}
	
	class Faculty extends Employee {
		private boolean status = true;
	
	public boolean isRegular() {
		return status;
	}
  }
	
	class Student extends Person{
		
		private String program;
		private int yearLevel;
		
		public void setProgram (String p ) {
		 program = p;
		}
		public 	String getProgram(){
			return program;
		}
		
		public void setyearLevel (int y ) {
		 yearLevel = y;
		}
		public 	int getyearLevel(){
			return yearLevel;
		}
	}
	public class CollegeList {

		public static void main(String[] args) {
			   Scanner sc = new Scanner(System.in);
			   Person pn = new Person();
			   Employee ep = new Employee();
			   Faculty fy = new Faculty();
			   Student st = new Student();
			   
	           System.out.print("Press E for Employee, F for Faculty, S for Student: ");
	           String press = sc.next();
	          
	           
        	   System.out.print("Enter your Name: ");
        	   String name = sc.next();
        	   pn.setName(name);
        	   System.out.print("Enter your ContactNumber: ");
        	   String contactNum = sc.next();
        	   pn.setContactNum(contactNum);
	           
	           
	           if (press.equalsIgnoreCase("E")) {
	        	  
	        	   System.out.print("Enter your salary: ");
	        	   double salary = sc.nextDouble();
	        	   ep.setSalary(salary);
	        	   System.out.print("Department: ");
	        	   String dep = sc.next();
	        	   ep.setDepartment(dep);	        	   
	        	   System.out.println("____________________________________");
	        	   System.out.println("Name: " + pn.getName());
	        	   System.out.println("Contact Number: " + pn.getContactNum());
	        	   System.out.println("Salary: " + ep.getSalary());
	        	   System.out.println("Department: " + ep.getDepartment());
	        	   }
	           
	           else if (press.equalsIgnoreCase("F")) {
	        	  
	        	   
	        	   double salary = sc.nextDouble();
	        	   ep.setSalary(salary);
	        	   System.out.print("Department: ");
	        	   String dep = sc.next();
	        	   ep.setDepartment(dep);
	        	   
	        	  System.out.println("Press Y if you regular/tenued or N if Not");
	        	  String reg = sc.next();
	        	  
	        	  if (reg.equalsIgnoreCase("Y")) {
	        		  	        	   
		        	   System.out.println("____________________________________");
		        	   System.out.println("Name: " + pn.getName());
		        	   System.out.println("Contact Number: " + pn.getContactNum());
		        	   System.out.println("Salary: " + ep.getSalary());
		        	   System.out.println("Department: " + ep.getDepartment());
	        		   System.out.println("Status: " + fy.isRegular() );
	        	  }
	        	  else {
	        		  System.out.println("____________________________________");
	        		  System.out.println("Name: " + pn.getName());
		        	  System.out.println("Contact Number: " + pn.getContactNum());
		        	  System.out.println("Status: false");
	        	  }
	        	   
	           }
	           
	           else {
	        	   System.out.print("Your Program: ");
	        	   String prog = sc.next();
	        	   st.setProgram(prog);
	        	   System.out.print("Year Level: ");
	        	   int lev = sc.nextInt();
	        	   st.setyearLevel(lev);	  
	        	   System.out.println("____________________________________");
	        	   System.out.println("Name: " + pn.getName());
	        	   System.out.println("Contact Number: " + pn.getContactNum());
	        	   System.out.println("Program: " + st.getProgram());
	        	   System.out.println("Year level: " + st.getyearLevel());
	           }
		
	}
}
