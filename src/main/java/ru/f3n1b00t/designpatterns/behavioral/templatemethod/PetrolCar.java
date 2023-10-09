package ru.f3n1b00t.designpatterns.behavioral.templatemethod;

public class PetrolCar extends Car {
    @Override
    public void startEngine() {
        System.out.println("Starting petrol engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping petrol engine...");
    }
}