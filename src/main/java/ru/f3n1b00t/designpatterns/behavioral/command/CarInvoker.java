package ru.f3n1b00t.designpatterns.behavioral.command;

public class CarInvoker {
    private final Command command;

    public CarInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}