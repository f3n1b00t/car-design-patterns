# 🗺️ Navigation Strategy Pattern

This Java project demonstrates the Strategy design pattern for implementing different navigation strategies for a car.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car that can be navigated using various strategies.
- [`NavigationStrategy`](NavigationStrategy.java) interface: Defines the contract for different navigation strategies.
- [`GPSStrategy`](GPSStrategy.java) class: Implements the GPS navigation strategy.
- [`MapStrategy`](MapStrategy.java) class: Implements the map-based navigation strategy.

## 🎨 Design Pattern

We have applied the Strategy design pattern to allow the car to switch between different navigation strategies (GPS and map-based) at runtime. This decouples the car from the specific navigation implementation.

## 🚀 Usage

1. Create a [`Car`](Car.java) object.

2. Implement and set different navigation strategies using the [`NavigationStrategy`](NavigationStrategy.java) interface.

3. Use the [`drive`](Car.java#L6) method on the [`Car`](Car.java) object to navigate based on the selected strategy.

4. The selected navigation strategy is used to determine the navigation method during the drive.

## 🏁 Example

```java
// Create a car
Car car = new Car();

// Implement navigation strategies
NavigationStrategy gpsStrategy = new GPSStrategy();
NavigationStrategy mapStrategy = new MapStrategy();

// Set the GPS strategy
car.setNavigationStrategy(gpsStrategy);

// Drive using GPS navigation
car.drive();

// Set the map-based strategy
car.setNavigationStrategy(mapStrategy);

// Drive using map-based navigation
car.drive();
```

## 📝 Output

```
Navigating by GPS...
Driving...
Navigating by map...
Driving...
```