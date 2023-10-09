#  🚗 Expression Interpreter for Car Control

This Java project demonstrates the Interpreter design pattern for interpreting car control commands.

## 📋 Overview

The project consists of the following components:

- [`Context`](Context.java) class: Holds and manages expressions and interprets commands.
- [`Expression`](Expression.java) interface: Defines the contract for interpreting commands.
- [`StartCarExpression`](StartCarExpression.java) class: Implements the interpretation for starting the car.
- [`StopCarExpression`](StopCarExpression.java) class: Implements the interpretation for stopping the car.

## 🎨 Design Pattern

We have applied the Interpreter design pattern to interpret and execute different car control commands based on input strings.

## 🚀 Usage

1. Create a [`Context`](Context.java) object to manage expressions.

2. Define and register specific expressions ([`StartCarExpression`](StartCarExpression.java) and [`StopCarExpression`](StopCarExpression.java)) with the [`Context`](Context.java).

3. Call the [`interpret`](Expression.java#L4) method on the [`Context`](Context.java) object with a command string to execute the corresponding interpretation.

## 🏁 Example

```java
// Create a context
Context context = new Context();

// Register expressions
context.registerExpression("start", new StartCarExpression());
context.registerExpression("stop", new StopCarExpression());

// Interpret commands
context.interpret("start");
context.interpret("stop");
```

## 📝 Output

```
Starting car...
Stopping car...
```