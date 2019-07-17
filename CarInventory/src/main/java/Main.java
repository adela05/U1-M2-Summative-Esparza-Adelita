package CarInventory.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<CarInventory> carList = new ArrayList();
        int id = 0;
        carList.add(new CarInventory(id++, "Honda", "Accord LX", 2015, "Hunter Green", 3700));
        carList.add(new CarInventory(id++, "Chevy", "Tahoe", 1995, "Black", 18700));
        carList.add(new CarInventory(id++, "Chevy", "Silverado", 1998, "White", 37000));
        carList.add(new CarInventory(id++, "Ford", "Fiesta", 1976, "Aqua Blue", 4506));
        carList.add(new CarInventory(id++, "Toyota", "Prius PHV", 2011, "Blue", 10000));
        carList.add(new CarInventory(id++, "Lincoln", "MKX", 2007, "Silver", 9800));

        System.out.println("**************************************");
        System.out.println(" # Welcome to Rod's Car Inventory! #");
        System.out.println("**************************************");
        System.out.println("\t\n Make your selection below.");
        System.out.println("\t 1. Add a Car \n"
                + "\t 2. Delete a Car \n"
                + "\t 3. List Cars \n"
                + "\t 4. Search a Car");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num == 1) {
            // Adding a new car to the ArrayList for CarInventory.
            CarInventory car = new CarInventory();

            System.out.println("Enter Make:");
            String make = scanner.nextLine();
            System.out.println("Enter Model:");
            String model = scanner.nextLine();
            System.out.println("Enter Color:");
            String color = scanner.nextLine();
            System.out.println("Enter Year:");
            int year = scanner.nextInt();
            System.out.println("Enter the Miles:");
            int miles = scanner.nextInt();

            for (int i = 0; i < carList.size(); i++) {
                carList.add(new CarInventory(id++, make, model, year, color, miles));

                break; // I added the break statement because it keeps loop even with the print statement.
            }
            System.out.println("Your car has been added to the Inventory.");
            System.out.println(carList.toString());

        }
        // To Delete an item from the list, add your getters to show it's been deleted
        else if (num == 2) {
            // Listing the Id's for User to delete
            for (int i = 0; i < carList.size(); i++) {
                System.out.println("Id Number: " + " " + carList.get(i).getId() + " " + carList.get(i).getMake()
                        + " " + carList.get(i).getModel() + " " + carList.get(i).getYear() + " " + carList.get(i).getColor()
                        + " " + carList.get(i).getMiles());
            }
            System.out.println("Enter the ID to delete and item: ");
            id = scanner.nextInt();
//
            for (int count = 0; count < carList.size(); count++) {
                if (carList.get(count).getId() == (id)) {
                    carList.remove(count);
                    System.out.println(carList.toString());
                }
            }
        } else if (num == 3) {
            // call all the getters with a for loop
            System.out.println("********************************");
            System.out.println("\t Rod's Inventory List ");
            for (int count = 0; count < carList.size(); count++) {
                System.out.println("\n\t " + carList.toString());
                break;  // I added the break statement because it keeps loop even with the print statement.
            }
        }
        // Search car by properties.
        else if (num == 4) {
            System.out.println("********************************");
            System.out.println("\t Rod's Search List ");
            System.out.println("Make a selection: "
                    + " 1. Make " + " 2. Model " + " 3. Year" + " 4. Color " + " 5. Miles");
            int num2 = scanner.nextInt();
            String search = scanner.nextLine();
            // My Search by data is not printing the list on the console. I've tried different way that I could think of
            // and I couldn't get it to work.
            if (search.equals("1")) {
                for (int a = 0; a < carList.size(); a++) {
                    if (carList.get(a).getMake().equals(search)) {
                        System.out.println(carList.get(a).getMake());
                    }
                }
                if (search.equals("2")) {
                    for (int b = 0; b < carList.size(); b++) {
                        if (carList.get(b).getModel().equals(search)) {
                            System.out.println(carList.get(b).getModel());
                        }
                    }
                    if (num2 ==3) {
                        for (int c = 0; c < carList.size(); c++) {
                            if (carList.get(c).getYear() == num2) {
                                System.out.println(carList.get(c).getYear());
                            }
                        }
                        if (search.equals("4")) {
                            for (int d = 0; d < carList.size(); d++) {
                                if (carList.get(d).getColor().equals(search)) {
                                    System.out.println(carList.get(d).getColor());
                                }
                            }
                            if (num2 == 5) {
                                for (int e = 0; e < carList.size(); e++) {
                                    if (carList.get(e).getMiles() == num2) {
                                        System.out.println(carList.get(e).getMiles());
                                        System.out.println(carList);
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }




    }
}
