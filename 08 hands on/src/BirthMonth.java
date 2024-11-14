import java.util.*;
public class BirthMonth {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		HashSet group1 = new HashSet();
		HashSet group2 = new HashSet();
		HashSet self = new HashSet();
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter birth month "+ i + ": ");
			String month = sc.nextLine();
			Collections.addAll(group1, month );
			
		}
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter birth month "+ i + ": ");
			String month = sc.nextLine();
			Collections.addAll(group2, month );
		}
		
		System.out.println("Group1: " + group1);
		System.out.println("Group2: " + group2);
		
		System.out.print("Enter your birth month: ");
		String my = sc.nextLine();
		Collections.addAll(self, my );
		
		
		Set union = new HashSet(group1);
		Set inter = new HashSet(group1);
		Set differ = new HashSet(group1);
		
		union.addAll(group2);
		inter.retainAll(group2);
		differ.removeAll(group2);
		
		System.out.println("Union: " + union);
		System.out.println("Interrsction: " + inter);
		System.out.println("Difference: " + differ);
		
		
		if (group1.containsAll(self) || group2.containsAll(self)  ) {
			System.out.println("You have the same birth month with one of your Classmates");
		}
		else {
			System.out.println("You don't have same birth month in your Classmates");
		}
	}

}
