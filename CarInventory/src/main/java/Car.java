package CarInventory.src.main.java;

public class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private int miles;

    //Constructor--
    public Car(String make, String model, String color, int year, int miles){
        this.make=make;
        this.model=model;
        this.color=color;
        this.year=year;
        this.miles=miles;
    }

    //Setter and Getters
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

