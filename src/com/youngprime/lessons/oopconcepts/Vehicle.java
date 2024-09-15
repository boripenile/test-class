package com.youngprime.lessons.oopconcepts;

public abstract class Vehicle implements VehicleOperation {

    private IDrivable drivable;
    private int speed;

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void reverse() {

    }

    @Override
    public void stop() {

    }

    public void setDrivable(IDrivable drivable) {
        this.drivable = drivable;
    }

    public IDrivable getDrivable() {
        return drivable;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
