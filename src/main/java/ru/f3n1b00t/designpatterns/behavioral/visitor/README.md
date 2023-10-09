# 🚗 Car Component Visitor Pattern

This Java project demonstrates the Visitor design pattern for inspecting different components of a car, such as the engine, transmission, and lights.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car and contains an array of [`CarComponent`](CarComponent.java) objects.
- [`CarComponent`](CarComponent.java) interface: Defines the [`accept`](CarComponent.java#L4) method to accept a [`CarComponentVisitor`](CarComponentVisitor.java).
- [`CarComponentVisitor`](CarComponentVisitor.java) interface: Declares visit methods for different car components.
- [`CarInspector`](CarInspector.java) class: Implements the [`CarComponentVisitor`](CarComponentVisitor.java) interface and performs checks on various car components (engine, transmission, lights).
- [`Engine`](Engine.java), [`Lights`](Lights.java), and [`Transmission`](Transmission.java) classes: Concrete car components that implement the [`CarComponent`](CarComponent.java) interface.

## 🎨 Design Pattern

We have applied the Visitor design pattern to separate the algorithm for inspecting car components from the car structure. The [`CarComponent`](CarComponent.java) objects accept a [`CarComponentVisitor`](CarComponentVisitor.java), which performs specific checks on each component.

## 🚀 Usage

1. Create a [`Car`](Car.java) object and add different [`CarComponent`](CarComponent.java) objects (engine, lights, transmission) to it.

2. Create a [`CarInspector`](CarInspector.java) object to perform component checks.

3. Call the [`accept`](Car.java#L11) method on the [`Car`](Car.java) object, passing the [`CarInspector`](CarInspector.java) as a visitor. This will trigger the visitor to check each component.

## 🏁 Example

```java
// Create a car and add components
Car car = new Car();

// Create a car inspector
CarComponentVisitor carInspector = new CarInspector();

// Perform component checks
car.accept(carInspector);
```

## 📝 Output

```
Engine check
Lights check
Transmission check
```