# 🏭 Car Factory Abstract Factory Pattern

This Java project demonstrates the Abstract Factory design pattern for creating different types of cars from two manufacturers: Ford and Toyota.

## 📋 Overview

The project consists of the following components:

- Car classes for Ford and Toyota: [`FordSedan`](car/manufacturer/ford/FordSedan.java), [`FordCoupe`](car/manufacturer/ford/FordCoupe.java), [`ToyotaSedan`](car/manufacturer/toyota/ToyotaSedan.java), and [`ToyotaCoupe`](car/manufacturer/toyota/ToyotaCoupe.java), all extending the abstract [`Car`](car/Car.java) class.
- [`Car`](car/Car.java) abstract class: Represents the base structure of a car with attributes like chassis, body, paint, and interior.
- Factories for Ford and Toyota: [`FordFactory`](factory/manufacturer/FordFactory.java) and [`ToyotaFactory`](factory/manufacturer/ToyotaFactory.java), implementing the [`CarFactory`](factory/CarFactory.java) interface.
- [`CarFactory`](factory/CarFactory.java) interface: Declares methods to create different types of cars (sedans and coupes).
- [`FactoryProducer`](factory/FactoryProducer.java) class: Provides a method to get a factory for a specified car manufacturer (Ford or Toyota).

## 🎨 Design Pattern

We have applied the Abstract Factory design pattern to create families of related car objects (sedans and coupes) without specifying their concrete classes. This pattern allows for flexibility and ensures that created objects are compatible with each other.

## 🚀 Usage

1. Use the [`FactoryProducer`](factory/FactoryProducer.java) to get a factory for the desired car manufacturer (Ford or Toyota).

2. Use the factory to create specific car models (sedans and coupes) with custom attributes.

3. The created cars can then be used as needed in your application.

## 🏁 Example

```java
// Get a Ford factory
CarFactory fordFactory = FactoryProducer.getFactory("FORD");

// Create a Ford sedan
Sedan fordSedan = fordFactory.createSedan("Ford Chassis", "Ford Sedan Body", "Ford Sedan Paint", "Ford Sedan Interior");
System.out.println(fordSedan);

// Get a Toyota factory
CarFactory toyotaFactory = FactoryProducer.getFactory("TOYOTA");

// Create a Toyota coupe
Coupe toyotaCoupe = toyotaFactory.createCoupe("Toyota Chassis", "Toyota Coupe Body", "Toyota Coupe Paint", "Toyota Coupe Interior");
System.out.println(toyotaCoupe);
```

## 📝 Output

```
FordSedan(chassis=Ford Chassis, body=Ford Sedan Body, paint=Ford Sedan Paint, interior=Ford Sedan Interior)
ToyotaCoupe(chassis=Toyota Chassis, body=Toyota Coupe Body, paint=Toyota Coupe Paint, interior=Toyota Coupe Interior
```