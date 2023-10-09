# 🚗 Car State Pattern

This Java project demonstrates the Memento design pattern for saving and restoring the state of a car.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car and provides methods for controlling the engine and gears.
- [`CarState`](CarState.java) class: Represents the state of the car and is used for saving and restoring the state.

## 🎨 Design Pattern

We have applied the Memento design pattern to allow the [`Car`](Car.java) class to save its state using a [`CarState`](CarState.java) object and later restore the state if needed.

## 🚀 Usage

1. Create a [`Car`](Car.java) object.

2. Use the [`startEngine`](Car.java#L7), [`stopEngine`](Car.java#L11), and [`shiftGear`](Car.java#L15) methods to control the car's state.

3. To save the current state, call the [`saveState`](Car.java#L19) method, which returns a [`CarState`](CarState.java) object.

4. To restore the state, pass a [`CarState`](CarState.java) object to the [`restoreState`](Car.java#L23) method.

## 🏁 Example

```java
// Create a car
Car car = new Car();

// Control the car's state
car.startEngine();
car.shiftGear(3);
car.stopEngine();

// Save the car's state
CarState savedState = car.saveState();

// Restore the car's state
car.restoreState(savedState);
```

## 📝 Output

```
Car(engineRunning=false, gear=3)
```