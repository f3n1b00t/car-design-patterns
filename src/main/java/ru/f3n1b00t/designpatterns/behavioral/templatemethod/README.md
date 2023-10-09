# 🚗 Car Engine Start-Stop Pattern

This Java project demonstrates the Template Method design pattern for controlling the start and stop of car engines for different car types (Electric and Petrol).

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) abstract class: Defines the template method [`drive`](Car.java#L4), which controls the sequence of starting and stopping the engine. Subclasses implement [`startEngine`](Car.java#L10) and [`stopEngine`](Car.java#L12) methods.
- [`ElectricCar`](ElectricCar.java) class: Extends [`Car`](Car.java) and provides an implementation for starting and stopping the electric engine.
- [`PetrolCar`](PetrolCar.java) class: Extends [`Car`](Car.java) and provides an implementation for starting and stopping the petrol engine.

## 🎨 Design Pattern

We have applied the Template Method design pattern to define the overall structure of the engine start-stop process while allowing subclasses to implement the specific engine operations.

## 🚀 Usage

1. Create instances of [`ElectricCar`](ElectricCar.java) and [`PetrolCar`](PetrolCar.java).

2. Call the [`drive`](Car.java#L4) method on the car instances to start and stop their respective engines.

3. The template method [`drive`](Car.java#L4) controls the sequence, ensuring that the correct engine operations are performed.

## 🏁 Example

```java
// Create an electric car
Car electricCar = new ElectricCar();

// Drive the electric car
electricCar.drive();

// Create a petrol car
Car petrolCar = new PetrolCar();

// Drive the petrol car
petrolCar.drive();
```

## 📝 Output

```
Starting electric engine...
Driving...
Stopping electric engine...
Starting petrol engine...
Driving...
Stopping petrol engine...
```