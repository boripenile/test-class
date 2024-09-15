package com.youngprime.lessons.oopgame.aircrafts;

import com.youngprime.lessons.oopgame.missiles.IMissile;
import com.youngprime.lessons.oopgame.missiles.MinorDamageMissile;
import com.youngprime.lessons.oopgame.enemies.IEnemy;

public class BaseAircraft implements Aircraft {

    private IMissile missile;
    private String aircraftName;

    public BaseAircraft(String aircraftName) {
        this.aircraftName = aircraftName;
        this.missile = new MinorDamageMissile("Minor Missile");
    }

    @Override
    public void fireMissiles(IEnemy enemy) {
        this.missile.shootEnemy(enemy);
    }

    public String getAircraftName() {
        return this.aircraftName;
    }

    public void changeMissile(IMissile missile) {
        this.missile = missile;
    }

    public IMissile getMissile() {
        return this.missile;
    }
}
