# 🚗⛽ Fueling a Car with Adapter Design Pattern

This Java project demonstrates the Adapter design pattern for connecting a gas station's fuel hose to a car to refuel it.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car with a [`fuelAmount`](Car.java#L4) attribute and a method [`addFuelAmount`](Car.java#L10) for adding fuel.
- [`GasStation`](GasStation.java) interface: Defines a contract for connecting the fuel hose.
- [`CarAdapter`](CarAdapter.java) class: Implements the [`GasStation`](GasStation.java) interface and adapts the [`Car`](Car.java) to connect the fuel hose and add fuel to it.

## 🎨 Design Pattern

We have applied the Adapter design pattern to allow the gas station's [`GasStation`](GasStation.java) interface to interact with the [`Car`](Car.java) class, enabling refueling.

## 🚀 Usage

1. Create an instance of the [`Car`](Car.java) class.

2. Create a [`CarAdapter`](CarAdapter.java) instance by passing the [`Car`](Car.java) to it.

3. Use the [`connectFuelHose`](CarAdapter.java#L11) method on the [`CarAdapter`](CarAdapter.java) to add fuel to the car.

4. Check the car's fuel amount.

## 🏁 Example

```java
// Create a Car
Car car = new Car();

// Create a CarAdapter
CarAdapter carAdapter = new CarAdapter(car);

// Connect the fuel hose and add fuel
carAdapter.connectFuelHose();

// Check the car's fuel amount
System.out.println(car);
```

## 📝 Output

```
Car(fuelAmount=1000.0)
```