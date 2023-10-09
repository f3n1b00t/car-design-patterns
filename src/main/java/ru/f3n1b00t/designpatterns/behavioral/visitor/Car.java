package ru.f3n1b00t.designpatterns.behavioral.visitor;

public class Car implements CarComponent {
    private final CarComponent[] components = new CarComponent[] {
            new Engine(),
            new Lights(),
            new Transmission()
    };

    @Override
    public void accept(CarComponentVisitor visitor) {
        for (CarComponent component : components) {
            component.accept(visitor);
        }
    }
}