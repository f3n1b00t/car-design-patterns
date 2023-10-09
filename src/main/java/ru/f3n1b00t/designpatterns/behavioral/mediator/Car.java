package ru.f3n1b00t.designpatterns.behavioral.mediator;

public class Car {
    private final CarMediator mediator;

    public Car(CarMediator mediator) {
        this.mediator = mediator;
    }

    public void start() {
        mediator.startEngine();
    }

    public void stop() {
        mediator.stopEngine();
    }

    public void shift(int gear) {
        mediator.shiftGear(gear);
    }

    public void turnLightsOn() {
        mediator.turnLightsOn();
    }

    public void turnLightsOff() {
        mediator.turnLightsOff();
    }
}