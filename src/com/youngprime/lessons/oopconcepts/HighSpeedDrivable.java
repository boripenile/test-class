package com.youngprime.lessons.oopconcepts;

public class HighSpeedDrivable implements IDrivable {
    @Override
    public void drive(int speed) {
        if (speed >= 200 && speed <= 1000) {
            System.out.println("Driving at a speed of " + speed + "km/hr");
        } else {
            System.out.println("Driving at a speed of 100km/hr");
        }
    }
}
