package ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.toyota;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Coupe;

public class ToyotaCoupe extends Coupe {
    public ToyotaCoupe(String chassis, String body, String paint, String interior) {
        super(chassis, body, paint, interior);
    }

    @Override
    public String toString() {
        return "ToyotaCoupe(" +
                "chassis=" + getChassis() +
                ", body=" + getBody() +
                ", paint=" + getPaint() +
                ", interior=" + getInterior() +
                ')';
    }
}