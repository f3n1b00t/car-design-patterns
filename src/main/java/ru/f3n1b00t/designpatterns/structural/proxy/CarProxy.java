package ru.f3n1b00t.designpatterns.structural.proxy;

public class CarProxy implements Car {
    private final RealCar car;

    public CarProxy(RealCar car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("Preparing before moving...");
        car.drive();
        System.out.println("Completing operations after moving...");
    }
}
