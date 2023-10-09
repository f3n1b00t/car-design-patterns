package ru.f3n1b00t.designpatterns.creational.singleton;

public class CarEagerSingleton {
    private static final CarEagerSingleton instance = new CarEagerSingleton();

    private CarEagerSingleton() {}

    public static CarEagerSingleton getInstance() {
        return instance;
    }

    public void drive() {
        System.out.println("Driving...");
    }
}