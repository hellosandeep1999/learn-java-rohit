package com.codingshuttle.youtube.LearningRESTAPIs.practices;

abstract class Vehicle {
    abstract void sound();

    void fuel() {
        System.out.println("Fuel filling.");
    }
}

class Car extends Vehicle {

    @Override
    void sound() {
        System.out.println("Car started.");
    }
}

public class VehicleMain {

    public static void main(String[] args) {
        Car obj = new Car();
        obj.fuel();
        obj.sound();
    }
}
