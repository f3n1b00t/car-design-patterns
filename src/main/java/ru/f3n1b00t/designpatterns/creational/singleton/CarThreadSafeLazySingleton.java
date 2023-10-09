package ru.f3n1b00t.designpatterns.creational.singleton;

public class CarThreadSafeLazySingleton {
    private static volatile CarThreadSafeLazySingleton instance;

    private CarThreadSafeLazySingleton() {}

    public static CarThreadSafeLazySingleton getInstance() {
        if(instance == null) {
            synchronized (CarThreadSafeLazySingleton.class) {
                if(instance == null) {
                    instance = new CarThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }

    public void drive() {
        System.out.println("Driving...");
    }
}
