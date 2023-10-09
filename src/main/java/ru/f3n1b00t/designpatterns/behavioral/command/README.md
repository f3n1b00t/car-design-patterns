# 🚗 Car Control System

This Java project demonstrates the Command design pattern for controlling car actions.

## 📋 Overview

The project consists of the following components:

- [`Car`](Car.java) class: Represents a car and provides methods for starting and stopping the engine.
- [`CarInvoker`](CarInvoker.java) class: Invokes car commands.
- [`Command`](Command.java) interface: Specifies the contract for car command objects.
- [`StartCarCommand`](StartCarCommand.java) class: Implements a command to start the car engine.
- [`StopCarCommand`](StopCarCommand.java) class: Implements a command to stop the car engine.

## 🎨 Design Pattern

We have applied the Command design pattern to decouple the sender ([`CarInvoker`](CarInvoker.java)) from the receiver ([`Car`](Car.java)) by encapsulating requests (commands) as objects.

## 🚀 Usage

1. Create a [`Car`](Car.java) object to represent your car.

2. Create command objects ([`StartCarCommand`](StartCarCommand.java) and [`StopCarCommand`](StopCarCommand.java)) associated with specific actions.

3. Create a [`CarInvoker`](CarInvoker.java) object and pass the desired command.

4. Call the [`execute`](CarInvoker.java#L10) method on the [`CarInvoker`](CarInvoker.java) to initiate the command.

## 🏁 Example

```java
// Create a car object
Car car = new Car();

// Create command objects
Command startCommand = new StartCarCommand(car);
Command stopCommand = new StopCarCommand(car);

// Create an invoker
CarInvoker startCarInvoker = new CarInvoker(startCommand);
CarInvoker stopCarInvoker = new CarInvoker(stopCommand);

// Execute the command
startCarInvoker.execute();
stopCarInvoker.execute();
```

## Output 

```
Engine is started!
Engine is stopped!
```