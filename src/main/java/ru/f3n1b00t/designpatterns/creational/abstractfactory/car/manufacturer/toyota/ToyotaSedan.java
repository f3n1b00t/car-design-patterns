package ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.toyota;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Sedan;

public class ToyotaSedan extends Sedan {
    public ToyotaSedan(String chassis, String body, String paint, String interior) {
        super(chassis, body, paint, interior);
    }

    @Override
    public String toString() {
        return "ToyotaSedan(" +
                "chassis=" + getChassis() +
                ", body=" + getBody() +
                ", paint=" + getPaint() +
                ", interior=" + getInterior() +
                ')';
    }
}