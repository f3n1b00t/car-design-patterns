# 🚗 Car Builder Design Pattern

This Java project demonstrates the Builder design pattern for constructing [`Car`](Car.java) objects with complex configurations.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car with attributes like chassis, body, paint, and interior.
- [`CarBuilder`](Car.java#L62) inner class: Implements the builder pattern for constructing [`Car`](Car.java) objects with customizable attributes.

## 🎨 Design Pattern

We have applied the Builder design pattern to create [`Car`](Car.java) objects with various configurations while keeping the [`Car`](Car.java) class immutable.

## 🚀 Usage

1. Use the [`CarBuilder`](Car.java#L62) inner class to create a [`Car`](Car.java) object with specific attributes.

2. Chain the builder methods to set the chassis, body, paint, and interior for the car.

3. Call the [`build`](Car.java#L91) method to obtain the fully configured [`Car`](Car.java) object.

## 🏁 Example

```java
// Create a car using the builder pattern
Car car = Car.builder()
    .chassis("Chassis Model XYZ")
    .body("SUV Body Type")
    .paint("Red Color")
    .interior("Leather Seats")
    .build();

// Use the car
System.out.println(car);
```

## 📝 Output

```
Car(chassis=Chassis Model XYZ, body=SUV Body Type, paint=Red Color, interior=Leather Seats)
```