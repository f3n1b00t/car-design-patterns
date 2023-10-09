package ru.f3n1b00t.designpatterns.creational.abstractfactory.factory.manufacturer;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Coupe;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Sedan;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.ford.FordCoupe;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.ford.FordSedan;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.factory.CarFactory;

public class FordFactory implements CarFactory {
    @Override
    public Sedan createSedan(String chassis, String body, String paint, String interior) {
        return new FordSedan(chassis, body, paint, interior);
    }

    @Override
    public Coupe createCoupe(String chassis, String body, String paint, String interior) {
        return new FordCoupe(chassis, body, paint, interior);
    }
}
