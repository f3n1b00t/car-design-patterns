package ru.f3n1b00t.designpatterns.behavioral.mediator;

public interface CarMediator {
    void startEngine();
    void stopEngine();
    void shiftGear(int gear);
    void turnLightsOn();
    void turnLightsOff();
}