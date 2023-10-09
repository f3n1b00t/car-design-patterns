package ru.f3n1b00t.designpatterns.behavioral.observer;

public class CarDriver implements CarObserver {
    private final String name;

    public CarDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}