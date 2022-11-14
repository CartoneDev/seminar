package cz.cvut.fel.omo.lab01;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final int makeYear;
    private final CarColor color;
    private final List<Wheel> wheels = new ArrayList<>();

    public Car(int wheelsCount, int wheelRadius, int makeYear, CarColor color) {
        this.makeYear = makeYear;
        this.color = color;
        for (int i = 0; i < wheelsCount; i++) {
            wheels.add(new Wheel(wheelRadius));
        }
    }

    public int getMakeYear() {
        return makeYear;
    }

    public CarColor getColor() {
        return color;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
}
