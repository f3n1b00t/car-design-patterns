package ru.f3n1b00t.designpatterns.creational.abstractfactory.car;

public class Coupe extends Car {
    public Coupe(String chassis, String body, String paint, String interior) {
        super(chassis, body, paint, interior);
    }

    @Override
    public String toString() {
        return "Coupe(" +
                "chassis=" + getChassis() +
                ", body=" + getBody() +
                ", paint=" + getPaint() +
                ", interior=" + getInterior() +
                ')';
    }
}