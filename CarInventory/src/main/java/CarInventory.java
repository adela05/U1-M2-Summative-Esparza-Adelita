package CarInventory.src.main.java;

import java.util.Arrays;

public class CarInventory {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private int miles;

    // Constructor
    public CarInventory(int id, String make, String model, int year, String color, int miles) {
        this.id=id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }
    public CarInventory(){}
    public void add(String name){

    }
    public void add(int num){

    }
    public String toString(){
        String result="";
        result = "\n\tMake: " + make + "\n\tModel: " + model + "\n\tYear: " + year + "\n\tColor: " + color + "\n\tMiles: "+ miles + "\n";
        return result;
    }

    // Setter and Getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}

