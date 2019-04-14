package by.bntu.fitr.poisit.threadkeepres.task2.model.entity;

import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.InvalidValuesException;

public class Coach extends Car {
    public static final int DEFAULT_PASSENGER_SEATS_NUMBER = 20;

    public static final String INVALID_SEATS_NUMBER = "Seats of number should be more then 10.";

    private int passengerSeatsNumbers;

    public Coach() {
        super();
        passengerSeatsNumbers = DEFAULT_PASSENGER_SEATS_NUMBER;
    }
    public Coach(double cost) throws InvalidValuesException {
        super(cost);
        passengerSeatsNumbers = DEFAULT_PASSENGER_SEATS_NUMBER;
    }

    public Coach(double cost, int passengerSeatsNumbers) throws InvalidValuesException {
        super(cost);
        if(passengerSeatsNumbers < 10) throw new InvalidValuesException(INVALID_SEATS_NUMBER);
        this.passengerSeatsNumbers = passengerSeatsNumbers;
    }

    @Override
    public String toString() {
        return "Coach{ID=" + getIDCar() + ", cost=" + getCost() +
                ", passengerSeatsNumbers=" + passengerSeatsNumbers +
                '}';
    }
}
