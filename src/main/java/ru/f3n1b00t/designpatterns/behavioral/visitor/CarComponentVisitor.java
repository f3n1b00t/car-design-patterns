package ru.f3n1b00t.designpatterns.behavioral.visitor;

public interface CarComponentVisitor {
    void visitEngine(Engine engine);
    void visitTransmission(Transmission transmission);
    void visitLights(Lights lights);
}