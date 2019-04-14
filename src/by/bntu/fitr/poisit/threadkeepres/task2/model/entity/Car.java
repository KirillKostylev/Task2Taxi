package by.bntu.fitr.poisit.threadkeepres.task2.model.entity;

import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.InvalidValuesException;

public class Car {
    public static final double DEFAULT_COST_CAR = 500;

    public static final String INVALID_COST = "Cost should be positive number";

    private static int counterCar = 0;
    private double cost;
    private int IDCar;

    {
        IDCar = counterCar++;
    }

    public Car() {
        cost = DEFAULT_COST_CAR;
    }

    public Car(double cost) throws InvalidValuesException {
        if(cost < 0) throw new InvalidValuesException(INVALID_COST);
        this.cost = cost;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getIDCar() {
        return IDCar;
    }

    public static int getCounterCar() {
        return counterCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", IDCar=" + IDCar +
                '}';
    }
}