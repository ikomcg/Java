import java.util.*;
	public class LabExer1B {
	    public static void main(String [] args){
	    int num;
	    Scanner enter = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    num = enter.nextInt();
	   
	    showNumberPlus10(num);
	    showNumberPlus100(num);
	    showNumberPlus1000(num);
	    }
	    

	    public static void showNumberPlus10(int num){
            int x;
            x=num+10;
	        System.out.println(num + " plus 10 is " + x);
	    }

	    public static void showNumberPlus100(int num){
            int y;
	    	y = num+100;
	        System.out.println(num + " plus 100 is " + y);
	    }

	    public static void showNumberPlus1000(int num){
            int z;
	        z= num+1000;
	        System.out.println(num + " plus 1000 is " + z);
	 }
}

