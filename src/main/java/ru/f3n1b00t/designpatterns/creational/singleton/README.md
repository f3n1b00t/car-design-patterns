# 🚗 Car Singleton Design Pattern

This Java project demonstrates various implementations of the Singleton design pattern for creating and managing single car instances.

## 📋 Overview

The project consists of the following components:

- [`CarEagerSingleton`](): Demonstrates eager initialization for creating a single instance of a car.
- [`CarEnumEagerSingleton`](): Uses an enum to create an eager single instance of a car.
- [`CarThreadSafeLazySingleton`](): Implements lazy initialization with thread safety for creating a singe car instance.
- [`CarUnsafeLazySingleton`](): Illustrates lazy initialization without thread safety for creating a single car instance.

## 🎨 Design Pattern

We have applied the Singleton design pattern to manage the creation of single car instances.

## 🚀 Usage

1. Create a single car instance using one of the singleton variations.

2. Call the drive method on the car instances to start the engines and drive.

## 🏁 Example
### Eager Singleton
```java
// Create a car using the eager singleton pattern
CarEagerSingleton car = CarEagerSingleton.getInstance();

// Use the car
car.drive();
```

### Eager Enum Singleton

```java
// Create a car using the eager enum singleton pattern
CarEnumEagerSingleton car = CarEnumEagerSingleton.INSTANCE;

// Use the car
car.drive();
```

### Thread Safe Lazy Singleton

```java
// Create a car using the thread safe lazy singleton pattern
CarThreadSafeLazySingleton car = CarThreadSafeLazySingleton.getInstance();

// Use the car
car.drive();
```

### Thread Unsafe Lazy Singleton

```java
// Create a car using the thread unsafe lazy singleton pattern
CarUnsafeLazySingleton car = CarUnsafeLazySingleton.getInstance();

// Use the car
car.drive();
```

## 📝 Output

```
Driving...
```