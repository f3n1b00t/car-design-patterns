package ru.f3n1b00t.designpatterns.structural.composite;

public class Car implements Driveable {
    public Car() {}

    @Override
    public void driveTo(double x, double y) {
        System.out.println("Moving to " + x + ", " + y);
    }

    @Override
    public String toString() {
        return "Car()";
    }
}