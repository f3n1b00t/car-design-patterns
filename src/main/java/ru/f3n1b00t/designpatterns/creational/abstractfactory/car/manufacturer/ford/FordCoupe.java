package ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.ford;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Coupe;

public class FordCoupe extends Coupe {
    public FordCoupe(String chassis, String body, String paint, String interior) {
        super(chassis, body, paint, interior);
    }

    @Override
    public String toString() {
        return "FordCoupe(" +
                "chassis=" + getChassis() +
                ", body=" + getBody() +
                ", paint=" + getPaint() +
                ", interior=" + getInterior() +
                ')';
    }
}