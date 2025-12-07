package Allinone;
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class Castingexample {
    public static void main(String[] args) {
        Vehicle v = new Car(); 
        v.start(); 

        Car c = (Car) v; 
        c.drive(); 
    }
}
