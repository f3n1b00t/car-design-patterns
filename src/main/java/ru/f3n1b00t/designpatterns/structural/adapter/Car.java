package ru.f3n1b00t.designpatterns.structural.adapter;

public class Car {
    private double fuelAmount;

    public Car() {
        this.fuelAmount = 0;
    }

    public void addFuelAmount(double fuelAmount) {
        this.fuelAmount += fuelAmount;
    }

    @Override
    public String toString() {
        return "Car(" +
                "fuelAmount=" + fuelAmount +
                ')';
    }
}