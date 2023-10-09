package ru.f3n1b00t.designpatterns.structural.facade;

public class Car {
    private final Engine engine;
    private final Transmission transmission;
    private final FuelSystem fuelSystem;

    public Car() {
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.fuelSystem = new FuelSystem();
    }

    public void start() {
        System.out.println("Starting car...");
        engine.start();
        transmission.engage();
        fuelSystem.supplyFuel();
        System.out.println("Car is started!");
    }

    public void stop() {
        System.out.println("Stopping car...");
        engine.stop();
        transmission.disengage();
        fuelSystem.stopSupplyingFuel();
        System.out.println("Car is stopped!");
    }
}
