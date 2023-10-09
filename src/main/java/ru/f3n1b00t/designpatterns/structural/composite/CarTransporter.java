package ru.f3n1b00t.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CarTransporter implements Driveable {
    private final List<Driveable> driveableList = new ArrayList<>();

    public void addCar(Driveable car) {
        driveableList.add(car);
    }

    public void removeCar(Driveable car) {
        driveableList.remove(car);
    }

    public void clear() {
        driveableList.clear();
    }

    @Override
    public void driveTo(double x, double y) {
        for (Driveable car : driveableList) {
            car.driveTo(x, y);
        }
    }
}
