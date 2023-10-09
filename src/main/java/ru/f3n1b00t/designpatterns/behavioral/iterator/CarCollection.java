package ru.f3n1b00t.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarCollection implements Iterable<Car> {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator<Car> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < cars.size();
        }

        @Override
        public Car next() {
            if (hasNext()) {
                return cars.get(index++);
            }

            throw new NoSuchElementException();
        }
    }
}