package com.youngprime.lessons.oopgame.enemies;

import java.util.Random;

public abstract class BaseEnemy implements IEnemy {

    private int energy;
    private String enemyName;

    public BaseEnemy(String enemyName, int energy) {
        this.enemyName = enemyName;
        this.energy = energy;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    public String getEnemyName() {
        return this.enemyName;
    }
    @Override
    public void impact(int level) {
        if (this.getEnergy() > 0 && level > 0) {
            int val = new Random().nextInt(level);
            if (val > 0) this.energy -= val;
        }
        if (this.energy <= 0) {
            this.energy = 0;
        }
    }
}
