package studen;

import java.util.Scanner;

class student{
	
	private  String Fullname;
	private  String course;
	public void setName(String newName) {
		this.Fullname = newName;
	}
	 
	public String getName() {
		return  this.Fullname;
	}
	
	public void setCourse(String newCourse) {
		
		this.course = newCourse;
	}
	public String getCourse() {
		
		return this.course;
	}
}

 public class runStudent {

	      public static void main(String[] args) {
		 
		     Scanner sc  = new Scanner(System.in);
		     student student = new student();
	     	 System.out.print("Enter your name: ");
	    	 String name = sc.nextLine();
			 student.setName(name);
	    	 System.out.print("Enter your Course: ");
	    	 String course = sc.nextLine();	
	    	 student.setCourse(course);
	    	 System.out.println("Hello " + student.getName());
	    	 System.out.print("Course: " + student.getCourse());
	}
}