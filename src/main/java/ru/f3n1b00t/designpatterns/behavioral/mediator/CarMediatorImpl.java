package ru.f3n1b00t.designpatterns.behavioral.mediator;

public class CarMediatorImpl implements CarMediator {
    @Override
    public void startEngine() {
        System.out.println("Engine is started!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is stopped!");
    }

    @Override
    public void shiftGear(int gear) {
        System.out.println("Gear is changed to " + gear);
    }

    @Override
    public void turnLightsOn() {
        System.out.println("Lights are turned on!");
    }

    @Override
    public void turnLightsOff() {
        System.out.println("Lights are turned off!");
    }
}