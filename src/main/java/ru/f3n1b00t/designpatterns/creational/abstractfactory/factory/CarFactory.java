package ru.f3n1b00t.designpatterns.creational.abstractfactory.factory;

import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Coupe;
import ru.f3n1b00t.designpatterns.creational.abstractfactory.car.Sedan;

public interface CarFactory {
    Sedan createSedan(String chassis, String body, String paint, String interior);
    Coupe createCoupe(String chassis, String body, String paint, String interior);
}