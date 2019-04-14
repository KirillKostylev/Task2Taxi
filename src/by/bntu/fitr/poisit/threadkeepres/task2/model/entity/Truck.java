package by.bntu.fitr.poisit.threadkeepres.task2.model.entity;

import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.InvalidValuesException;

public class Truck extends Car {
    public final int DEFAULT_BAGGAGE_CAPACITY = 15;

    public static final String INVALID_BAGGAGE_CAPACITY = "Fiedl baggageCapacity should be positive number.";

    private int baggageСapacity;

    public Truck() {
        super();
        baggageСapacity = DEFAULT_BAGGAGE_CAPACITY;
    }
    public Truck(int cost) throws InvalidValuesException {
        super(cost);
        baggageСapacity = DEFAULT_BAGGAGE_CAPACITY;
    }

    public Truck(double cost, int baggageСapacity) throws InvalidValuesException{
        super(cost);
        if(baggageСapacity < 0) throw new InvalidValuesException(INVALID_BAGGAGE_CAPACITY);
        this.baggageСapacity = baggageСapacity;
    }

    @Override
    public String toString() {
        return "Truck{ID=" +getIDCar()+", cost="+getCost()+
                ", baggageСapacity=" + baggageСapacity +
                '}';
    }
}
