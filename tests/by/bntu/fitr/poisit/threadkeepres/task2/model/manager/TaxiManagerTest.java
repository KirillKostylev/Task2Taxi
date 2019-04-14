package by.bntu.fitr.poisit.threadkeepres.task2.model.manager;

import by.bntu.fitr.poisit.threadkeepres.task2.model.entity.*;
import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.InvalidValuesException;
import by.bntu.fitr.poisit.threadkeepres.task2.model.exceptions.NullValueException;
import org.junit.Assert;
import org.junit.Test;

public class TaxiManagerTest {
    Taxi taxi;
    {
        try {
            taxi = new Taxi(new Car(1300), new Truck(), new MiniBus(4500,130), new MiniBus(3200));
        } catch (InvalidValuesException e) {
            e.getMessage();
        }
    }

    @Test
    public void findCarCost() {
        try {
            taxi.addCar(new Coach(3000,50));
            Assert.assertEquals(12500 ,TaxiManager.findTaxiCost(taxi), 0);
        } catch (InvalidValuesException | NullValueException e) {
            e.getMessage();
        }

    }

    @Test
    public void findTheMostExpensiveCar() {
        try {
            taxi.addCar(new Coach(9000));
            Car expectedCar = taxi.getCar(4);
            Assert.assertEquals(expectedCar, TaxiManager.findTheMostExpensiveCar(taxi));
        } catch (InvalidValuesException | NullValueException e) {
            e.getMessage();
        }

    }

    @Test
    public void findCarCost2() {
        try {
            taxi.addCar(new Coach(-4200));
        } catch (InvalidValuesException | NullValueException e) {
            Assert.assertEquals(Car.INVALID_COST, e.getMessage());
        }
    }

    @Test
    public void findCarCost3() {
        try {
            taxi.addCar(new Coach(4561,8));
        } catch (InvalidValuesException | NullValueException e) {
            Assert.assertEquals(Coach.INVALID_SEATS_NUMBER, e.getMessage());
        }
    }

    @Test
    public void findCarCost4() {
        try {
            taxi.addCar(new MiniBus(4561,-8));
        } catch (InvalidValuesException | NullValueException e) {
            Assert.assertEquals(MiniBus.INVALID_MAX_SPEED, e.getMessage());
        }
    }
    @Test
    public void findCarCost5() {
        try {
            taxi.addCar(new Truck(200,-45));
        } catch (InvalidValuesException | NullValueException e) {
            Assert.assertEquals(Truck.INVALID_BAGGAGE_CAPACITY, e.getMessage());
        }
    }
    @Test
    public void findCarCost6() {
        try {
            taxi.addCar(null);
        } catch (NullValueException e) {
            Assert.assertEquals(Taxi.NULL_VALUE_CAR, e.getMessage());
        }
    }
    @Test
    public void findCarCost7() {
        try {
            TaxiManager.findTaxiCost(null);
        } catch (NullValueException e) {
            Assert.assertEquals(TaxiManager.NULL_VALUE, e.getMessage());
        }
    }
}