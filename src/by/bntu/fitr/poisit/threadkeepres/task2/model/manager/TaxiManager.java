package by.bntu.fitr.poisit.threadkeepres.task2.model.manager;

import by.bntu.fitr.poisit.threadkeepres.task2.model.entity.Car;
import by.bntu.fitr.poisit.threadkeepres.task2.model.entity.Taxi;
import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.NullValueException;

public class TaxiManager {
    public static final String NULL_VALUE = "Taxi can't be null.";

    private static void checkForNull(Taxi taxi) throws NullValueException {
        if (taxi == null) throw new NullValueException(NULL_VALUE);
    }

    public static double findTaxiCost(Taxi taxi) throws NullValueException {
        checkForNull(taxi);
        double sum = 0;
        for (Car car : taxi.getCar()) {
            sum += car.getCost();
        }
        return sum;
    }

    public static Car findTheMostExpensiveCar(Taxi taxi) throws NullValueException {
        checkForNull(taxi);
        Car expensiveVehicle = taxi.getCar()[0];
        for (Car car : taxi.getCar()) {
            if (car.getCost() > expensiveVehicle.getCost()) {
                expensiveVehicle = car;
            }
        }
        return expensiveVehicle;
    }
}
