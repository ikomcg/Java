package Programing_Language;

import java.util.Scanner;

public class Kinetic_energy {
    
    private double mass;
    private double velocity;
    
    public Kinetic_energy(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }
    
    public double calculateKineticEnergy() {
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        return kineticEnergy;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter mass in kilograms: ");
        double mass = scanner.nextDouble();
        
        System.out.print("Enter velocity in meters per second: ");
        double velocity = scanner.nextDouble();
        
        Kinetic_energy calculator = new Kinetic_energy(mass, velocity);
        double kineticEnergy = calculator.calculateKineticEnergy();
        
        System.out.println("The object's kinetic energy is: " + kineticEnergy + " J");
    }
}
