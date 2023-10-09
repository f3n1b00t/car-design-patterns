package ru.f3n1b00t.designpatterns.creational.singleton;

public enum CarEnumEagerSingleton {
    INSTANCE;

    public void drive() {
        System.out.println("Driving...");
    }
}