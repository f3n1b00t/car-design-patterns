package ru.f3n1b00t.designpatterns.structural.bridge.engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine start");
    }
}