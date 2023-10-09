package ru.f3n1b00t.designpatterns.behavioral.interpreter;

public class StopCarExpression implements Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("Stopping car...");
    }
}