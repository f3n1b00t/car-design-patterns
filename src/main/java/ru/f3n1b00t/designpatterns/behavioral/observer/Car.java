package ru.f3n1b00t.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final List<CarObserver> observers = new ArrayList<>();

    public void addObserver(CarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CarObserver observer) {
        observers.remove(observer);
    }

    public void startEngine() {
        notifyObservers("Engine is started!");
    }

    public void stopEngine() {
        notifyObservers("Engine is stopped!");
    }

    private void notifyObservers(String message) {
        for (CarObserver observer : observers) {
            observer.update(message);
        }
    }
}