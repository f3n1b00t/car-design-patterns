# 🚗 Car Handling System

This Java project demonstrates the Chain of Responsibility design pattern for handling car-related requests.

## 📋 Overview

The project consists of the following components:

- [`CarHandler`](CarHandler.java) interface: Defines the basic structure for handling car requests.
- [`CarRequest`](CarRequest.java) class: Represents a car request with a specific request type (START or STOP).
- [`RequestType`](RequestType.java) enum: Enumerates the types of car requests (START, STOP).
- [`StartCarHandler`](StartCarHandler.java) class: Implements the car request handler for starting the engine.
- [`StopCarHandler`](StopCarHandler.java) class: Implements the car request handler for stopping the engine.

## 🎨 Design Pattern

We have used the Chain of Responsibility design pattern to handle car requests. In this pattern, each handler decides whether to process the request or pass it to the next handler in the chain.

## 🚀 Usage

1. Create a [`CarRequest`](CarRequest.java) object with the desired request type (START or STOP).

2. Create instances of request handlers ([`StartCarHandler`](StartCarHandler.java) and [`StopCarHandler`](StopCarHandler.java)).

3. Set up the chain of responsibility using the [`setNextHandler`](CarHandler.java#L5) method to specify the next handler in the chain.

4. Call the [`handleRequest`](CarHandler.java#L4) method on the first handler in the chain to initiate the request processing.

## 🏁 Example

```java
// Create a car request
CarRequest startRequest = new CarRequest(RequestType.START);
CarRequest stopRequest = new CarRequest(RequestType.STOP);

// Create request handlers
CarHandler startHandler = new StartCarHandler();
CarHandler stopHandler = new StopCarHandler();

// Set up the chain of responsibility
startHandler.setNextHandler(stopHandler);

// Process the request
startHandler.handleRequest(startRequest);
startHandler.handleRequest(stopRequest);
```

## 📝 Output

```
Engine is started!
Engine is stopped!
```