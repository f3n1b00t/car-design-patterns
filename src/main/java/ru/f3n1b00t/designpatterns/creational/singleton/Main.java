package ru.f3n1b00t.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Create a car using the eager singleton pattern
        CarEagerSingleton car = CarEagerSingleton.getInstance();

// Use the car
        car.drive();

    }
}
