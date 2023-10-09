# 🚗🔌 Car Control System

This Java project demonstrates the Facade design pattern for controlling a car's engine, transmission, and fuel system.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car and acts as a facade for controlling its various subsystems.
- [`Engine`](Engine.java) class: Manages the car's engine, including starting and stopping.
- [`FuelSystem`](FuelSystem.java) class: Controls the car's fuel system, supplying and stopping fuel flow.
- [`Transmission`](Transmission.java) class: Manages the car's transmission, engaging and disengaging gears.

## 🎨 Design Pattern

We have applied the Facade design pattern to simplify the interface for controlling a complex system (the car's subsystems). The [`Car`](Car.java) class acts as a facade, providing a unified and simplified interface for starting and stopping the car, while internally managing the complex interactions between the engine, fuel system, and transmission.

## 🚀 Usage

1. Create a [`Car`](Car.java) object to control the car's subsystems.

2. Call the [`start`](Car.java#L14) method to start the car, and the [`stop`](Car.java#L22) method to stop it.

3. The [`Car`](Car.java) class handles the internal interactions between the engine, fuel system, and transmission, making it easy to control the car.

## 🏁 Example

```java
// Create a car
Car car = new Car();

// Start the car
car.start();

// Stop the car
car.stop();
```

## 📝 Output

```
Starting car...
Engine is started
Transmission is engaged
Fuel supply is started
Car is started!
Stopping car...
Engine is stopped
Transmission is disengaged
Fuel supply is stopped
Car is stopped!
```