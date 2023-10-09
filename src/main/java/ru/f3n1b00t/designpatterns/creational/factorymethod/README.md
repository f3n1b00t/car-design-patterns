# 🚗 Car Factory Design Pattern

This Java project demonstrates the Factory design pattern for creating [`Car`](Car.java) objects.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car with attributes like chassis, body, paint, and interior.
- [`CarFactory`](CarFactory.java) class: Implements the Factory design pattern to create [`Car`](Car.java) objects with specified configurations.

## 🎨 Design Pattern

We have applied the Factory design pattern to create [`Car`](Car.java) objects in a centralized and organized way.

## 🚀 Usage

1. Use the [`CarFactory`](CarFactory.java) class to create [`Car`](Car.java) objects.

2. Pass the required attributes (chassis, body, paint, and interior) to the [`createCar`](CarFactory.java#L4) method.

3. The factory method returns a fully configured [`Car`](Car.java) object.

## 🏁 Example

```java
// Create a car using the factory pattern
Car car = CarFactory.createCar("Chassis Model XYZ", "SUV Body Type", "Red Color", "Leather Seats");

// Use the car
System.out.println(car);
```

## 📝 Output

```
Car(chassis=Chassis Model XYZ, body=SUV Body Type, paint=Red Color, interior=Leather Seats)
```