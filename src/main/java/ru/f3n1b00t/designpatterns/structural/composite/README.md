# 🚗🚚 Car Transporter

This Java project demonstrates a simple car transporter system that allows you to manage and drive multiple cars using a common interface.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents an individual car that can be driven to a specific location.
- [`CarTransporter`](CarTransporter.java) class: Manages a list of [`Driveable`](Driveable.java) objects (cars) and allows you to drive them all to a common location.
- [`Driveable`](Driveable.java) interface: Defines a contract for objects that can be driven to a specific location.

## Functionality 🚀

- The [`Car`](Car.java) class implements the [`Driveable`](Driveable.java) interface, allowing individual cars to be driven to specific coordinates.
- The [`CarTransporter`](CarTransporter.java) class manages a list of [`Driveable`](Driveable.java) objects, enabling you to:
    - Add cars to the transporter.
    - Remove cars from the transporter.
    - Clear the transporter's list of cars.
    - Drive all the cars in the transporter to a common destination.

## 🏁 Example

```java
// Create individual cars
Driveable car1 = new Car();
Driveable car2 = new Car();

// Create a car transporter
CarTransporter transporter = new CarTransporter();

// Add cars to the transporter
transporter.addCar(car1);
transporter.addCar(car2);

// Drive all cars to the same location
transporter.driveTo(100.0, 200.0);
```

## 📝 Output

```
Moving to 100.0, 200.0
Moving to 100.0, 200.0
```