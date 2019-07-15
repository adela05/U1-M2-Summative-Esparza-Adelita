package CarInventory.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // User can search for a car
        //System.out.println("Enter the Car information.");

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Honda", "Accord LX", "Hunter Green", 2015, 3700));
        carList.add(new Car("Chevy", "Tahoe", "Black", 1995, 18700));
        carList.add(new Car("Chevy", "Silverado", "White", 1998, 37000));
        carList.add(new Car("Ford", "Fiesta", "Aqua Blue", 1976, 4506));
        carList.add(new Car("Toyota", "Prius PHV", "Blue", 2011, 10000));
        carList.add(new Car("Lincoln", "MKX", "Silver", 2007, 9800));
        


//        System.out.println("Make: ");
//        String make = keyboard.nextLine();
//        car.setMake(make);
//        System.out.println("Model: ");
//        String model = keyboard.nextLine();
//        car.setModel(model);
//        System.out.println("Color: ");
//        String color = keyboard.nextLine();
//        car.setColor(color);
//        System.out.println("Year: ");
//        int year = keyboard.nextInt();
//        car.setYear(year);
//        System.out.println("Miles on the Odometer: ");
//        int miles = keyboard.nextInt();
//        car.setMiles(miles);





    }
}
