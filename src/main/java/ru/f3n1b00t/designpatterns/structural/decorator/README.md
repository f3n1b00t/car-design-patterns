# 🚗🌐 GPS-Car

This Java project demonstrates the Decorator design pattern to enhance a car's functionality by adding GPS navigation.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) interface: Defines the contract for a car with a [`drive`](Car.java#L4) method.
- [`GPSCar`](GPSCar.java) class: A decorator that adds GPS navigation to a car.
- [`RealCar`](RealCar.java) class: Represents a real car that implements the [`Car`](Car.java) interface.

## 🎨 Design Pattern

We have applied the Decorator design pattern to extend the behavior of the [`RealCar`](RealCar.java) class. The [`GPSCar`](GPSCar.java) decorator enhances a [`Car`](Car.java) object by adding GPS navigation functionality without altering the original car class. This pattern allows for flexible and dynamic behavior extension.

## 🚀 Usage

1. Create a [`RealCar`](RealCar.java) object to represent a car.

2. Optionally, create a [`GPSCar`](GPSCar.java) decorator and pass the [`RealCar`](RealCar.java) as a parameter to add GPS navigation.

3. Use the [`drive`](Car.java#L4) method on the car objects to initiate driving.

## 🏁 Example

```java
// Create a RealCar
Car realCar = new RealCar();

// Add GPS functionality to the car
Car gpsCar = new GPSCar(realCar);

// Drive the car (with GPS)
realCar.drive();
gpsCar.drive();
```

## 📝 Output

```
Car started moving
GPS navigator added
Car started moving
```