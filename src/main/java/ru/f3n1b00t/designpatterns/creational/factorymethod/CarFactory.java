package ru.f3n1b00t.designpatterns.creational.factorymethod;

public class CarFactory {
    public static Car createCar(String chassis, String body, String paint, String interior) {
        return new Car(chassis, body, paint, interior);
    }
}