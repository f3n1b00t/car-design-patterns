package ru.f3n1b00t.designpatterns.creational.abstractfactory.factory.manufacturer;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Coupe;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Sedan;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.toyota.ToyotaCoupe;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.manufacturer.toyota.ToyotaSedan;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.factory.CarFactory;

public class ToyotaFactory implements CarFactory {
    @Override
    public Sedan createSedan(String chassis, String body, String paint, String interior) {
        return new ToyotaSedan(chassis, body, paint, interior);
    }

    @Override
    public Coupe createCoupe(String chassis, String body, String paint, String interior) {
        return new ToyotaCoupe(chassis, body, paint, interior);
    }
}
