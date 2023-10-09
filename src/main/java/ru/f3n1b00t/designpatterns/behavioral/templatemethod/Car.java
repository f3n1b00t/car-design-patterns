package ru.f3n1b00t.designpatterns.behavioral.templatemethod;

public abstract class Car {
    public final void drive() {
        startEngine();
        System.out.println("Driving...");
        stopEngine();
    }

    public abstract void startEngine();

    public abstract void stopEngine();
}