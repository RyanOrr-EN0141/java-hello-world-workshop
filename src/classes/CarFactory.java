package classes;

public class CarFactory {

    public static void main(String[] args) {

        //instantiating a new car
        Car car1 = new Car();
        car1.setMake("Honda");
        car1.setModel("Civic");

        //calling toString() to get the Car's details
        System.out.println(car1.toString());

        //call accelerate() method on the Car object
        car1.accelerate();

    }

}
