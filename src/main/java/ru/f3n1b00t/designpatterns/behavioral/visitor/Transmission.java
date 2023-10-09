package ru.f3n1b00t.designpatterns.behavioral.visitor;

public class Transmission implements CarComponent {
    @Override
    public void accept(CarComponentVisitor visitor) {
        visitor.visitTransmission(this);
    }
}