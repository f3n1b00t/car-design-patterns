package ru.f3n1b00t.designpatterns.creational.singleton;

public class CarUnsafeLazySingleton {
    private static CarUnsafeLazySingleton instance;
    private CarUnsafeLazySingleton() {}

    public static CarUnsafeLazySingleton getInstance() {
        if(instance == null) {
            instance = new CarUnsafeLazySingleton();
        }

        return instance;
    }

    public void drive() {
        System.out.println("Driving...");
    }
}