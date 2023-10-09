package ru.f3n1b00t.designpatterns.behavioral.templatemethod;

public class ElectricCar extends Car {
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping electric engine...");
    }
}

