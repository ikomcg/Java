import java.util.*;
public class uml {
	private static String petname;
	private static int petage;
	private static double petweight;
	
	public static void setpet(String newname, int age, double newweight) {
		petname = newname;
		petage = age;
		petweight= newweight;
		
	}
	public static void setname(String newname) {
		Scanner a = new Scanner (System.in);
		petname = a.next();
		
	}
	public static void setage(int newage) {
		Scanner a = new Scanner (System.in);
		petage = a.nextInt();
		
	}
	public static void setweight(double newweight) {
		Scanner a = new Scanner (System.in);
		petweight = a.nextDouble();
	}
	public static String getname() {
      System.out.print(petname);
		return petname;
	} 
	
	public static int getage() {
		 System.out.print(petage);
		return petage;
	}
	public static double getweight() {
		 System.out.print(petweight);
		return petweight;
	}
	public static void readinput() {
		System.out.println("Name of your pet: ");
		setname(petname);
		System.out.println("age of your pet: ");
		setage(petage);
		System.out.println("Weiht of your pet: ");
		setweight(petweight);
	}
	public static void writeoutput() {
		System.out.print("your pet name is "  );
		getname();
		System.out.print(" and he/she age is " );
		getage();
		System.out.print(" and weight is " );
		getweight();
	}
	public static void main(String [] args) {
		readinput();
		writeoutput();
		
	}
}
