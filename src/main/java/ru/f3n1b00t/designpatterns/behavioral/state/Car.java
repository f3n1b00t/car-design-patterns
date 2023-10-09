package ru.f3n1b00t.designpatterns.behavioral.state;

public class Car {
    private EngineState engineState;

    public Car() {
        this.engineState = new EngineOffState();
    }

    public void startEngine() {
        engineState.start();
    }

    public void stopEngine() {
        engineState.stop();
    }

    public EngineState getEngineState() {
        return engineState;
    }

    public void setEngineState(EngineState engineState) {
        this.engineState = engineState;
    }

    private class EngineOffState implements EngineState {
        @Override
        public void start() {
            System.out.println("Engine is started!");
            setEngineState(new EngineOnState());
        }

        @Override
        public void stop() {
            System.out.println("Engine is already stopped!");
        }
    }

    private class EngineOnState implements EngineState {
        @Override
        public void start() {
            System.out.println("Engine is already running!");
        }

        @Override
        public void stop() {
            System.out.println("Engine is stopped!");
            setEngineState(new EngineOffState());
        }
    }
}
