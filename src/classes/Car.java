package classes;

public class Car {

    //fields
    private String make;
    private String model;

    //default constructor with no arguments
    public Car(){}

    //getter and setter methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make.equalsIgnoreCase("Harley-Davidson")) {
            System.out.println("This factory doesn't make motorcycles");
            this.make = "Default";
        }
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //other methods
    public void accelerate() {
        System.out.println("The " + make + " " + model + " is accelerating");
    }

    @Override
    public String toString() {
        return "Make:" + this.make + ", Model:" + this.model;

    }


}
