# 🚗🔌 Car Proxy

This Java project demonstrates the Proxy design pattern, allowing controlled access to the [`RealCar`](RealCar.java) class while performing additional operations using the [`CarProxy`](CarProxy.java) class.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) interface: Defines the contract for driving a car.
- [`CarProxy`](CarProxy.java) class: Acts as a proxy for the [`RealCar`](RealCar.java), allowing operations to be performed before and after driving.
- [`RealCar`](RealCar.java) class: Represents the actual car and implements the [`Car`](Car.java) interface.

## 🎨 Design Pattern

We have applied the Proxy design pattern to control access to the [`RealCar`](RealCar.java) class. The [`CarProxy`](CarProxy.java) class adds functionality by performing additional operations before and after invoking the [`drive`](Car.java#L4) method of the [`RealCar`](RealCar.java). This pattern is useful for scenarios where you need to control access, perform lazy loading, or add additional behavior without modifying the original class.

## 🚀 Usage

1. Create a [`RealCar`](RealCar.java) object to represent the actual car.

2. Create a [`CarProxy`](CarProxy.java) object, passing the [`RealCar`](RealCar.java) as an argument.

3. Call the [`drive`](Car.java#L4) method on the [`CarProxy`](CarProxy.java) object to drive the car. The proxy will execute operations before and after the car starts moving.

## 🏁 Example

```java
// Create a RealCar
RealCar realCar = new RealCar();

// Create a CarProxy for the RealCar
Car carProxy = new CarProxy(realCar);

// Drive the car using the proxy
carProxy.drive();
```

## 📝 Output

```
Preparing before moving...
Car started moving
Completing operations after moving...
```