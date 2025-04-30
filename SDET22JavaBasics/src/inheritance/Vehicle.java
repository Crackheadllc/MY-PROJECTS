package inheritance;

public class Vehicle {

    String vinNumber;

}
class Car extends Vehicle{

    String color;

    void drive(){
        System.out.println("Driving......");
    }
}

class ElectricCar extends Vehicle{

    void drive(){
        System.out.println("No need for gas to drive");
    }
}

class  Audi extends Car{

}