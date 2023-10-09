package ru.f3n1b00t.designpatterns.structural.proxy;

public class RealCar implements Car {
    @Override
    public void drive() {
        System.out.println("Car started moving");
    }
}
