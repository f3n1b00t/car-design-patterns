# 🚗 Car Collection Iterator

This Java project demonstrates the Iterator design pattern for managing and iterating over a collection of cars.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car with chassis, body, paint, and interior attributes.
- [`CarCollection`](CarCollection.java) class: Provides a collection of cars and implements the `Iterable` interface.
- [`CarIterator`](CarCollection.java#L20) class: Implements the `Iterator` interface to iterate over the car collection.

## 🎨 Design Pattern

We have applied the Iterator design pattern to efficiently traverse and manage a list of cars.

## 🚀 Usage

1. Create a [`CarCollection`](CarCollection.java) object.

2. Add cars to the collection using the [`addCar`](CarCollection.java#L11) method.

3. Use a `for-each` loop or an explicit `Iterator` to iterate over the cars in the collection.

## 🏁 Example

```java
// Create a car collection
CarCollection carCollection = new CarCollection();

// Add cars to the collection
carCollection.addCar(new Car("SUV", "Steel", "Black", "Leather"));
carCollection.addCar(new Car("Sedan", "Aluminum", "White", "Fabric"));

// Iterate over the cars
for (Car car : carCollection) {
    System.out.println("Car details: " + car);
}
```

## 📝 Output

```
Car details: Car(chassis=SUV, body=Steel, paint=Black, interior=Leather)
Car details: Car(chassis=Sedan, body=Aluminum, paint=White, interior=Fabric)
```