# 🚗 Car Observer Pattern

This Java project demonstrates the Observer design pattern for implementing a car and its drivers as observers.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car and allows observers (drivers) to subscribe and receive updates when the car's engine is started or stopped.
- [`CarDriver`](CarDriver.java) class: Represents a car driver who observes the car's state changes.
- [`CarObserver`](CarObserver.java) interface: Defines the contract for observers to receive updates.

## 🎨 Design Pattern

We have applied the Observer design pattern to decouple the car and its drivers. The car acts as the subject, and the drivers act as observers. When the car's engine is started or stopped, it notifies all registered drivers (observers).

## 🚀 Usage

1. Create a [`Car`](Car.java) object.

2. Create [`CarDriver`](CarDriver.java) objects representing the drivers.

3. Register drivers as observers using the [`addObserver`](Car.java#L9) method.

4. Use the [`startEngine`](Car.java#L17) and [`stopEngine`](Car.java#L21) methods to control the car's engine.

5. When the engine state changes, registered drivers receive updates.

## 🏁 Example

```java
// Create a car
Car car = new Car();

// Create drivers
CarDriver driver1 = new CarDriver("Driver 1");
CarDriver driver2 = new CarDriver("Driver 2");

// Register drivers as observers
car.addObserver(driver1);
car.addObserver(driver2);

// Start and stop the car's engine
car.startEngine();
car.stopEngine();
```

## 📝 Output

```
Driver 1 received message: Engine is started!
Driver 2 received message: Engine is started!
Driver 1 received message: Engine is stopped!
Driver 2 received message: Engine is stopped!
```