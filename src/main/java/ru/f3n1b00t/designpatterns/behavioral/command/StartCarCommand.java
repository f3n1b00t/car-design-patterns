package ru.f3n1b00t.designpatterns.behavioral.command;

public class StartCarCommand implements Command {
    private final Car car;

    public StartCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startCar();
    }
}