package ru.f3n1b00t.designpatterns.behavioral.command;

public class StopCarCommand implements Command {
    private final Car car;

    public StopCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopCar();
    }
}