package by.bntu.fitr.poisit.threadkeepres.task2.model.entity;

import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.InvalidValuesException;

public class MiniBus extends Car {
    public static final int DEFAULT_MAX_SPEED = 100;

    public static final String INVALID_MAX_SPEED = "Max speed should be more then 20.";

    private int maxSpeed;

    public MiniBus() {
        super();
        maxSpeed = DEFAULT_MAX_SPEED;
    }

    public MiniBus(double cost) throws InvalidValuesException {
        super(cost);
        maxSpeed = DEFAULT_MAX_SPEED;
    }

    public MiniBus(double cost, int maxSpeed) throws InvalidValuesException {
        super(cost);
        if (maxSpeed < 20) throw new InvalidValuesException(INVALID_MAX_SPEED);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "MiniBus{ID=" + getIDCar() + ", cost=" + getCost() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
