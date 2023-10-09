# 🚗🔌 Car Engine State

This Java project demonstrates the State design pattern, where the state of a car's engine is managed using different engine state objects.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car and maintains the current engine state.
- [`EngineState`](EngineState.java) interface: Defines the contract for engine state objects, with methods for starting and stopping the engine.
- [`EngineOffState`](Car.java#L26) class: Represents the engine state when it's turned off.
- [`EngineOnState`](Car.java#L39) class: Represents the engine state when it's turned on.

## 🎨 Design Pattern

We have applied the State design pattern to encapsulate the behavior of the car's engine into separate state classes. The [`Car`](Car.java) class delegates the engine control tasks to the current engine state object. By switching between different engine states, the car can respond appropriately to start and stop requests. This pattern simplifies the management of complex state transitions and enhances the maintainability of the code.

## 🚀 Usage

1. Create a [`Car`](Car.java) object to represent a car with an initial engine state (usually [`EngineOffState`](Car.java#L26)).

2. Use the [`startEngine`](Car.java#L10) and [`stopEngine`](Car.java#L14) methods of the [`Car`](Car.java) object to control the engine state.

3. Optionally, use the [`setEngineState`](Car.java#L22) method to switch between different engine states.

## 🏁 Example

```java
// Create a Car with an initial EngineOffState
Car car = new Car();

// Start the engine
car.startEngine();

// Stop the engine
car.stopEngine();
```

## 📝 Output

```
Engine is started!
Engine is stopped!
```