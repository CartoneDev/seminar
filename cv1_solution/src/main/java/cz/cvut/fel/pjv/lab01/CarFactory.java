package cz.cvut.fel.pjv.lab01;

import java.awt.*;
import java.time.LocalDate;

public class CarFactory {
    private int carsMade = 0;

    public int getCarsMade() {
        return carsMade;
    }

    private void makingCar(String label) {
        carsMade++;
        System.out.println(label);

    }

    Car createTruck(CarColor color) {
        makingCar("Vytvarim nakladni auto");
        return new Car(6, 50, LocalDate.now().getYear(), color);
    }

    Car createPassengerCar(CarColor color) {
        makingCar("Vytvarim osobni auto");
        return new Car(4, 17, LocalDate.now().getYear(), color);
    }
}
