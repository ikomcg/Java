
class  Person{
	  private String name , contactNum;
	  	 public void setName(String n) {
	  		 name = n;
	  	 }
	  	 public String getname() {
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
	
	public void setsalary(double s) {
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setdepartment(String d) {
		department = d;
	}
	
	public String getdepartmen() {
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
	private int yearlevel;
	
	public void setprogram(String p) {
		program = p;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setYearLevel(int y) {
		yearlevel = y;
	}
	
	public int getYearlevel() {
		return yearlevel;
	}
	
}

public class CollegList {

	public static void main(String[] args) {
          


	}

}
