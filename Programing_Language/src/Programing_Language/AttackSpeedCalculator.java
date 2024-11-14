package Programing_Language;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AttackSpeedCalculator {
    
    private double baseAttackSpeed;
    private double bonusAttackSpeed;
    
    public AttackSpeedCalculator(double baseAttackSpeed, double bonusAttackSpeed) {
        this.baseAttackSpeed = baseAttackSpeed;
        this.bonusAttackSpeed = bonusAttackSpeed;
    }
    
    public double calculateAttackSpeed(int level) {
        double bonusAttackSpeedDecimal = bonusAttackSpeed / 100.0;
        double currentAttackSpeed = baseAttackSpeed * (1 + (bonusAttackSpeedDecimal * (level - 1)));
        DecimalFormat df = new DecimalFormat("#.###");
        currentAttackSpeed = Double.parseDouble(df.format(currentAttackSpeed));
        return currentAttackSpeed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base attack speed: ");
        double baseAttackSpeed = scanner.nextDouble();

        System.out.print("Enter the bonus attack speed (%): ");
        double bonusAttackSpeed = scanner.nextDouble();

        AttackSpeedCalculator calculator = new AttackSpeedCalculator(baseAttackSpeed, bonusAttackSpeed);

        System.out.print("Enter the character's level: ");
        int level = scanner.nextInt();

        double currentAttackSpeed = calculator.calculateAttackSpeed(level);

        System.out.println("Current attack speed: " + currentAttackSpeed);
    }
}
