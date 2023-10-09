package ru.f3n1b00t.designpatterns.behavioral.memento;

public class CarState {
    private final boolean engineRunning;
    private final int gear;

    public CarState(boolean engineRunning, int gear) {
        this.engineRunning = engineRunning;
        this.gear = gear;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public String toString() {
        return "CarState(" +
                "engineRunning=" + engineRunning +
                ", gear=" + gear +
                ')';
    }
}