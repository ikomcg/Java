package Default;

public class Main {
	   
	public static void main(String[] args) {
		Main mn = new Main();
		mn.student();
		mn.name();
		mn.year();
		
		
	}
   void student() {
	   System.out.println("Hello student");
   }
   public void name() {
	   System.out.println("Miko C. Gurrobat");
   }
   protected void age() {
	   System.out.println("20 years old");
   }
   private void year() {
	   System.out.println("2001");
   }
}
