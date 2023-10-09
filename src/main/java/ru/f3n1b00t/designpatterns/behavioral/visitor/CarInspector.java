package ru.f3n1b00t.designpatterns.behavioral.visitor;

public class CarInspector implements CarComponentVisitor {
    @Override
    public void visitEngine(Engine engine) {
        System.out.println("Engine check");
    }

    @Override
    public void visitTransmission(Transmission transmission) {
        System.out.println("Transmission check");
    }

    @Override
    public void visitLights(Lights lights) {
        System.out.println("Lights check");
    }
}