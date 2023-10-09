package ru.f3n1b00t.designpatterns.behavioral.chainofresponsibility;

public interface CarHandler {
    void handleRequest(CarRequest request);
    void setNextHandler(CarHandler nextHandler);
}