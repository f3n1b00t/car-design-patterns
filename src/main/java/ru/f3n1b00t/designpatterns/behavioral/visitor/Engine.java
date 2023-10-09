package ru.f3n1b00t.designpatterns.behavioral.visitor;

public class Engine implements CarComponent {
    @Override
    public void accept(CarComponentVisitor visitor) {
        visitor.visitEngine(this);
    }
}
