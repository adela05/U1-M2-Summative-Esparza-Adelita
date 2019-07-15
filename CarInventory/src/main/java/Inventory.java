package CarInventory.src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Car> carInventory = new ArrayList<Car>();


    public void add(Car car) {
        // must add a new car to the inventory
    }
    public void delete(Car car){
        // must delete car info from the list
    }
    public List <Car> search(String searchCatagory, String searchString){
        searchCatagory = searchCatagory;
    }
    public String toString(){
        String result = "";
        // Will print out the array as a list individually
        for (Car car : carInventory){
            result = result + car;
        }
        return result;
    }
    public void isListed(){
        // to print the entire array list on the screen
    }
}
