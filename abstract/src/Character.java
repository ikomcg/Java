
public abstract class Character {
      
	public abstract void walking(); 

	public void showName() {
		System.out.println("miko");
	}
	
}
class withTwoLegs extends Character {
	public void walking() {
		System.out.println("Walking in 2 legs");
		
	}
	
}
 class withTreeLegs extends Character{
		public void walking() {
			System.out.println("Walking in 3 legs");
		}
}

 class runcharacter{
	 
	 public static void main(String [] args) {
		 withTwoLegs two = new withTwoLegs();
	       two.walking();
	       
	       withTreeLegs three = new withTreeLegs();
	       three.walking();
	 }
 }