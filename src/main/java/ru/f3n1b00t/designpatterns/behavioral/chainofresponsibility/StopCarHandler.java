package ru.f3n1b00t.designpatterns.behavioral.chainofresponsibility;

public class StopCarHandler implements CarHandler {
    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(CarRequest request) {
        if (request.getRequestType() == RequestType.STOP) {
            System.out.println("Engine is stopped!");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}