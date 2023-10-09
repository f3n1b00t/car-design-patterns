package ru.f3n1b00t.designpatterns.creational.abstractfactory.factory;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.factory.manufacturer.FordFactory;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.factory.manufacturer.ToyotaFactory;

public class FactoryProducer {
    public static CarFactory getFactory(String manufacturer) {
        if (manufacturer.equalsIgnoreCase("FORD")) {
            return new FordFactory();
        } else if (manufacturer.equalsIgnoreCase("TOYOTA")) {
            return new ToyotaFactory();
        }

        throw new IllegalArgumentException("Invalid factory manufacturer");
    }
}
