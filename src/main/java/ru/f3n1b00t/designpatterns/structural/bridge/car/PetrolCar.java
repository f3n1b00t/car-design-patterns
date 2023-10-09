package ru.f3n1b00t.designpatterns.structural.bridge.car;

import ru.f3n1b00t.designpatterns.structural.bridge.engine.Engine;

public class PetrolCar extends Car {
    public PetrolCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Petrol car drive");
    }
}
