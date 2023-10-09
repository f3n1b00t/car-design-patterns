package ru.f3n1b00t.designpatterns.structural.decorator;

public class GPSCar implements Car {
    protected final Car car;

    public GPSCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        addGPS();
        car.drive();
    }

    private void addGPS() {
        System.out.println("GPS navigator added");
    }
}