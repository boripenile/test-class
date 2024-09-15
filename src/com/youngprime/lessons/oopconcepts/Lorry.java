package com.youngprime.lessons.oopconcepts;

public class Lorry extends Vehicle {



    @Override
    public void drive() {
        if (getDrivable() != null) {
            getDrivable().drive(getSpeed());
        } else {
            System.out.println("Lorry is moving at 23km/hr");
        }
    }

}
