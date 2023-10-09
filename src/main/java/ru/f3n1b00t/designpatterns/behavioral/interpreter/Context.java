package ru.f3n1b00t.designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Expression> expressions = new HashMap<>();

    public Context() {}

    public void registerExpression(String commandName, Expression expression) {
        expressions.put(commandName, expression);
    }

    public void interpret(String command) {
        if(expressions.containsKey(command)) {
            expressions.get(command).interpret(this);
        } else {
            System.out.println("Command not found!");
        }
    }
}