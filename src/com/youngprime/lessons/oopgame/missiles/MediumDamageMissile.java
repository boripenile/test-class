package com.youngprime.lessons.oopgame.missiles;

import com.youngprime.lessons.oopgame.enemies.IEnemy;

public class MediumDamageMissile extends BaseMissile {

    public MediumDamageMissile(String missileName) {
        super(missileName);
    }

    @Override
    public void shootEnemy(IEnemy enemy) {
        enemy.impact(35);
    }
}
