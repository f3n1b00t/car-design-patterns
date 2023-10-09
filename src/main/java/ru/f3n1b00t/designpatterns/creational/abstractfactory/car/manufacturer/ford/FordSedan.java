package ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.ford;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Sedan;

public class FordSedan extends Sedan {
    public FordSedan(String chassis, String body, String paint, String interior) {
        super(chassis, body, paint, interior);
    }

    @Override
    public String toString() {
        return "FordSedan(" +
                "chassis=" + getChassis() +
                ", body=" + getBody() +
                ", paint=" + getPaint() +
                ", interior=" + getInterior() +
                ')';
    }
}