import java.util.Scanner;

public class plus {
	int num =0;
	public void showNumberPlus() {
	
	showNumberPlus10(num);
    showNumberPlus100(num);
    showNumberPlus1000(num);
    
}
		  public static void showNumberPlus10(int num){

		        System.out.println(num + " plus 10 is " + (num+10) + ".");
		    }

		    public static void showNumberPlus100(int num){

		        System.out.println(num + " plus 100 is " + (num+100) + ".");
		    }

		    public static void showNumberPlus1000(int num){

		        System.out.println(num + " plus 1000 is " + (num+1000) + ".");
		    }
}

