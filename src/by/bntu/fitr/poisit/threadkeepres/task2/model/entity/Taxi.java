package by.bntu.fitr.poisit.threadkeepres.task2.model.entity;

import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.NullValueException;

import java.util.Arrays;

public class Taxi {
    public final static String NULL_VALUE_CAR = "Car can't be null.";

    private Car[] taxi;
    private int numberOfCars;

    public Taxi() {
        taxi = new Car[0];
        numberOfCars = 0;
    }

    public Taxi(Car... cars) {
        this.taxi = cars;
        numberOfCars = cars.length;
    }

    public Car getCar(int taxiNumber) {
        return taxi[taxiNumber];
    }
    public Car[] getCar(){
        return taxi;
    }
    public void addCar(Car car) throws NullValueException {
        checkForNull(car);
        this.taxi = Arrays.copyOf(taxi, taxi.length + 1);
        this.taxi[numberOfCars] = car;
        numberOfCars++;
    }
    private static void checkForNull(Car car) throws NullValueException {
        if (car == null) throw new NullValueException(NULL_VALUE_CAR);
    }
}
