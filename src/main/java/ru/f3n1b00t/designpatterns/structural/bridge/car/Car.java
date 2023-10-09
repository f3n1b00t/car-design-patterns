package ru.f3n1b00t.designpatterns.structural.bridge.car;

import ru.f3n1b00t.designpatterns.structural.bridge.engine.Engine;

public abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}

