package ru.f3n1b00t.designpatterns.structural.adapter;

public class CarAdapter implements GasStation {
    private final Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void connectFuelHose() {
        car.addFuelAmount(1000);
    }
}