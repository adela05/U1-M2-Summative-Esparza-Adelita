package CarInventory.src.main.java;

public class Car extends Inventory{
    //Constructor
    public Car(String make, String model, int year, String color, int miles){
        super(make, model, year, color, miles);
    }

    public void add() {
        // must add a new car to the inventory
    }
    public void delete(){
        // must delete car info from the list
    }
    public void search(){
        // this method could needs a contain() method
    }
    public String toString(){
        // Optional but will print out the array as a list individually
        return null;
    }
    public void isListed(){
        // to print the entire array list on the screen
    }

}

