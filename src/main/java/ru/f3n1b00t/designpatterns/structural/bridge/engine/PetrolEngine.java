package ru.f3n1b00t.designpatterns.structural.bridge.engine;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine start");
    }
}
