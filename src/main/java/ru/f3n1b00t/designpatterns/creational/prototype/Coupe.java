package ru.f3n1b00t.designpatterns.creational.prototype;

public class Coupe extends Car {
    public Coupe(String chassis, String body, String paint, String interior) {
        super(chassis, body, paint, interior);
    }

    @Override
    public Car copy() {
        return new Coupe(this.getChassis(), this.getBody(), this.getPaint(), this.getInterior());
    }
}