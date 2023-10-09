package ru.f3n1b00t.designpatterns.creational.abstractfactory.car;

public class Sedan extends Car {
    public Sedan(String chassis, String body, String paint, String interior) {
        super(chassis, body, paint, interior);
    }

    @Override
    public String toString() {
        return "Sedan(" +
                "chassis=" + getChassis() +
                ", body=" + getBody() +
                ", paint=" + getPaint() +
                ", interior=" + getInterior() +
                ')';
    }
}
