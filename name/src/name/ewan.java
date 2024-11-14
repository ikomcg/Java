package name;
import java.util.*;

class employee{
	String name;
	public void setname(String newname) {
		newname = name;
	}
	public String getname() {
		return name;
	}
}
class fulltime extends employee{
	double monthlysalary;
	public void setmonthly(double newmonthlysalary) {
		newmonthlysalary = monthlysalary;
	}
	public double getmonthly() {
		return monthlysalary;
	}
}
class parttime extends employee{
	double rateperhour;
	int hourworked;
	double wage;
	
	public void setwage(double newrateperhour, int newhourworked) {
		newrateperhour = rateperhour;
		newhourworked = hourworked;
	}
	public double getwage() {
		wage = rateperhour * hourworked;
		return wage;
	}
}
class runemployee{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, press;
		System.out.print("Enter name ");
		name = sc.next();
		System.out.print("Enter F for Full Time and P for Part Time: ");
		press = sc.next();
	    
		double salary, rph;
		int hw;
	if(press.equalsIgnoreCase("F")) {
		
		  System.out.print("Enter monthly salary: ");
		   salary = sc.nextDouble();
		  
		  fulltime full = new fulltime(); 
		  full.setmonthly(salary);
		  full.setname(name);
		  System.out.println("Name: " + full.getname());
		  System.out.printf("Wage: %.2f" , full.getmonthly());
		
	}
	else if (press.equalsIgnoreCase("P")) {
		  System.out.print("Enter rate per hour and no. of hours worked separated by space: ");
		  rph = sc.nextDouble();
		  hw = sc.nextInt();
		  
		  parttime part = new parttime(); 
		  part.setwage(rph, hw);
		  part.setname(name);
		  System.out.println("Name: " + part.getname());
		  System.out.printf("Wage: %.2f" , part.getwage());
	}
		  
		  
		  
	 }
}
 

