package CarInventory.src.main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // User input car information
        System.out.println("Enter the Car information.");
        System.out.println("Make: ");
        String make = keyboard.nextLine();
        System.out.println("Model: ");
        String model = keyboard.nextLine();
        System.out.println("Year: ");
        int year = keyboard.nextInt();
        System.out.println("Color: ");
        String color = keyboard.nextLine();
        System.out.println("Miles on the Odometer: ");
        int miles = keyboard.nextInt();
    }
}
