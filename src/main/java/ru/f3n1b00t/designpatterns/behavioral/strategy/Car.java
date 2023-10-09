package ru.f3n1b00t.designpatterns.behavioral.strategy;

public class Car {
    private NavigationStrategy navigationStrategy;

    public void drive() {
        navigationStrategy.navigate();
        System.out.println("Driving...");
    }

    public NavigationStrategy getNavigationStrategy() {
        return navigationStrategy;
    }

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }
}