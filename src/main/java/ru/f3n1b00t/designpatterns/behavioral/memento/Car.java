package ru.f3n1b00t.designpatterns.behavioral.memento;

public class Car {
    private boolean engineRunning = false; // Stores the engine state.
    private int gear = 0; // Stores the current gear.

    public void startEngine() {
        engineRunning = true;
    }

    public void stopEngine() {
        engineRunning = false;
    }

    public void shiftGear(int gear) {
        this.gear = gear;
    }

    public CarState saveState() {
        return new CarState(engineRunning, gear);
    }

    public void restoreState(CarState state) {
        this.engineRunning = state.isEngineRunning();
        this.gear = state.getGear();
    }

    @Override
    public String toString() {
        return "Car(" +
                "engineRunning=" + engineRunning +
                ", gear=" + gear +
                ")";
    }
}