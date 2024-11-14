package employee;

import java.util.*;

class Employeee{
	 String name;
	public  void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name ;
	}
}

class FullTimeEmployee extends Employeee{

	 double monthlySalary;
	 public void setMonthlySalary(double newMothlySalary){
     monthlySalary = newMothlySalary;
	}
	
	public double getMonthlySalary(){
		return monthlySalary;
	}
}

class PartTimeEmployee extends Employeee{
		double ratePerHour;
	    int hoursWorked;
		double wage;

	 public void setwage(double newratePerHour, int newhoursWorked ){
		ratePerHour = newratePerHour;
		hoursWorked = newhoursWorked;

	}

	public double getWage(){
		wage=ratePerHour*hoursWorked;
		return wage;
	}
}
public class RunEmployee{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name, press;
		
		System.out.print("Enter Name: ");
	    name=sc.nextLine();
		System.out.print("Enter F for Full Time and P for Part Time: ");
		press=sc.next();
		
		double salary, rph;
		int hw;
	  if(press.equalsIgnoreCase("F")){

		System.out.print("Enter Monthly Salary:");
		salary = sc.nextInt();
		
		FullTimeEmployee fullemployee = new FullTimeEmployee();
		fullemployee.setMonthlySalary(salary);
		fullemployee.setName(name);
		
		System.out.println("Name: " + fullemployee .getName());
		System.out.println("Monthly Salary: " + fullemployee.getMonthlySalary());
			
	}
	  else if (press.equalsIgnoreCase("P")){

		 System.out.print("Enter rate per hour and no. of hours worked separated by space: ");
		 rph=sc.nextDouble();
	     hw=sc.nextInt();
	    
	     PartTimeEmployee partemplyoee = new PartTimeEmployee();
	     partemplyoee.setwage(rph,hw);
		 partemplyoee.setName(name);
		 System.out.println("Name: " + partemplyoee.getName());
		 System.out.printf("Wage: %.2f",partemplyoee.getWage());
		
	   }
	  else {
		  System.out.println("You enter letter " + "("+ press +")" + " is invalid!!!!" );
	  }
	}
}