import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		//Eto ung pagtawag sa constructor
		class2 x = new class2();
		
		//ung nasa loob ng () variable sa String ung name nga bali dito mapupunta ung ininput mo dyan na data sa constructor na setName
		x.setName(name);
		
		//dito naman sa getName na constructor dyan napunta kung ano ininput mo sa string name
		System.out.print("Your name: " + x.getName());
	}

}
class class2{	
	
		 String name;
		public  void setName(String newName){
			name = newName;
		}
		public String getName(){
			return name ;
		
	}
}