package Programing_Language;

import java.util.Scanner;

public class MixColor {
    
    private String color1;
    private String color2;
    
    public MixColor() {
        this.color1 = "";
        this.color2 = "";
    }
    
    public void setColor1(String color) {
        this.color1 = color;
    }
    
    public void setColor2(String color) {
        this.color2 = color;
    }
    
    public String mixColors() {
        if (color1.equals("red") && color2.equals("blue") || color1.equals("blue") && color2.equals("red")) {
            return "purple";
        } else if (color1.equals("red") && color2.equals("yellow") || color1.equals("yellow") && color2.equals("red")) {
            return "orange";
        } else if (color1.equals("blue") && color2.equals("yellow") || color1.equals("yellow") && color2.equals("blue")) {
            return "green";
        } else {
            return "invalid color combination";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MixColor mixer = new MixColor();
        
        System.out.println("Enter the colors that you want to mix");
        System.out.print("Enter first color: ");
        String color1 = scanner.nextLine();
        mixer.setColor1(color1);
        
        System.out.print("Enter second color: ");
        String color2 = scanner.nextLine();
        mixer.setColor2(color2);
        
        String result = mixer.mixColors();
        System.out.println(color1+ " + " + color2 + " = " + result);
    }
}
