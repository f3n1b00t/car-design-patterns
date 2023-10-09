package ru.f3n1b00t.designpatterns.behavioral.chainofresponsibility;

public class CarRequest {
    private final RequestType requestType;

    public CarRequest(RequestType requestType) {
        this.requestType = requestType;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}