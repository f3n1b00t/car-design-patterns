package ru.f3n1b00t.designpatterns.behavioral.strategy;

public class MapStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Navigating by map...");
    }
}