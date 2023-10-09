package ru.f3n1b00t.designpatterns.behavioral.visitor;

public interface CarComponent {
    void accept(CarComponentVisitor visitor);
}