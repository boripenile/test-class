package com.youngprime.lessons.oopconcepts;

public class LowSpeedDrivable implements IDrivable {

    @Override
    public void drive(int speed) {
        if (speed >= 50 && speed <= 500) {
            System.out.println("Driving at a speed of " + speed + "km/hr");
        } else {
            System.out.println("Driving at a speed of 50km/hr");
        }
    }
}
