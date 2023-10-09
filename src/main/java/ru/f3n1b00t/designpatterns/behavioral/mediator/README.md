# 🚗 Car Mediator Pattern

This Java project demonstrates the Mediator design pattern for managing car actions through a mediator.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car and interacts with a [`CarMediator`](CarMediator.java).
- [`CarMediator`](CarMediator.java) interface: Defines the contract for the mediator to manage car actions.
- [`CarMediatorImpl`](CarMediatorImpl.java) class: Implements the [`CarMediator`](CarMediator.java) interface to handle car-related actions.

## 🎨 Design Pattern

We have applied the Mediator design pattern to centralize and manage various car-related actions such as starting the engine, shifting gears, and controlling lights through a mediator.

## 🚀 Usage

1. Create a [`CarMediator`](CarMediator.java) object, usually an instance of [`CarMediatorImpl`](CarMediatorImpl.java).

2. Create a [`Car`](Car.java) object and pass the [`CarMediator`](CarMediator.java) to it.

3. Use the [`Car`](Car.java) methods like [`start`](Car.java#L10), [`stop`](Car.java#L14), [`shift`](Car.java#L18), [`turnLightsOn`](Car.java#L22), and [`turnLightsOff`](Car.java#L26) to perform car actions.

## 🏁 Example

```java
// Create a car mediator
CarMediator mediator = new CarMediatorImpl();

// Create a car and pass the mediator
Car car = new Car(mediator);

// Perform car actions
car.start();
car.shift(3);
car.turnLightsOn();
car.stop();
```

## 📝 Output

```
Engine is started!
Gear is changed to 3
Lights are turned on!
Engine is stopped!
```