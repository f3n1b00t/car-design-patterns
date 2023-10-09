# 🚗🔧 Car and Engine Abstraction with Factory Method

This Java project demonstrates the Factory Method design pattern for creating different types of cars with corresponding engines.

## 📋 Overview

The project consists of the following components:

- [`Car`](car/Car.java) class: An abstract class representing a car with an [`Engine`](engine/Engine.java).
- [`ElectricCar`](car/ElectricCar.java) class: Extends [`Car`](car/Car.java) and represents an electric car.
- [`PetrolCar`](car/PetrolCar.java) class: Extends [`Car`](car/Car.java) and represents a petrol car.
- [`Engine`](engine/Engine.java) interface: Defines a contract for engine types.
- [`ElectricEngine`](engine/ElectricEngine.java) class: Implements [`Engine`](engine/Engine.java) for electric cars.
- [`PetrolEngine`](engine/PetrolEngine.java) class: Implements [`Engine`](engine/Engine.java) for petrol cars.

## 🎨 Design Pattern

We have applied the Factory Method design pattern to create different types of cars ([`ElectricCar`](car/ElectricCar.java) and [`PetrolCar`](car/PetrolCar.java)) with their corresponding engines ([`ElectricEngine`](engine/ElectricEngine.java) and [`PetrolEngine`](engine/PetrolEngine.java)) using a common abstract class ([`Car`](car/Car.java)) and interface ([`Engine`](engine/Engine.java)).

## 🚀 Usage

1. Create instances of [`ElectricEngine`](engine/ElectricEngine.java) and [`PetrolEngine`](engine/PetrolEngine.java).

2. Create instances of [`ElectricCar`](car/ElectricCar.java) and [`PetrolCar`](car/PetrolCar.java), passing the respective engine as a parameter.

3. Call the [`drive`](car/Car.java#L12) method on the car instances to start the engines and drive.

## 🏁 Example

```java
// Create electric and petrol engines
Engine electricEngine = new ElectricEngine();
Engine petrolEngine = new PetrolEngine();

// Create electric and petrol cars
Car electricCar = new ElectricCar(electricEngine);
Car petrolCar = new PetrolCar(petrolEngine);

// Drive the cars
electricCar.drive();
petrolCar.drive();
```

## 📝 Output

```
Electric engine start
Electric car drive
Petrol engine start
Petrol car drive
```