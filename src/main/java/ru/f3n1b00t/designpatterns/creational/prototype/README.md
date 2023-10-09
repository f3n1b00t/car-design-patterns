# 🚗 Car Copying with Prototype Design Pattern

This Java project demonstrates the Prototype design pattern for creating copies of `Car` objects.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) abstract class: Represents a car with attributes like chassis, body, paint, and interior. It defines an abstract [`copy`](Car.java#L48) method for creating copies of cars.
- [`Coupe`](Coupe.java) class: Extends the [`Car`](Car.java) class and implements the [`copy`](Car.java#L48) method to create a copy of a coupe car.
- [`Sedan`](Sedan.java) class: Extends the [`Car`](Car.java) class and implements the [`copy`](Car.java#L48) method to create a copy of a sedan car.

## 🎨 Design Pattern

We have applied the Prototype design pattern to create copies of [`Car`](Car.java) objects efficiently.

## 🚀 Usage

1. Create instances of [`Coupe`](Coupe.java) or [`Sedan`](Sedan.java) cars.

2. Use the [`copy`](Car.java#L48) method to create copies of cars with the same attributes.

3. Customize the copied cars if needed.

## 🏁 Example

```java
// Create a Coupe car
Car coupeCar = new Coupe("Chassis Model 123", "Coupe Body", "Red Paint", "Leather Interior");

// Copy the Coupe car
Car copiedCoupe = coupeCar.copy();

// Customize the copied Coupe car
copiedCoupe.setPaint("Blue Paint");

System.out.println("Original Coupe: " + coupeCar);
System.out.println("Copied Coupe: " + copiedCoupe);
```

## 📝 Output

```
Original Coupe: Car(chassis=Chassis Model 123, body=Coupe Body, paint=Red Paint, interior=Leather Interior)
Copied Coupe: Car(chassis=Chassis Model 123, body=Coupe Body, paint=Blue Paint, interior=Leather Interior)
```