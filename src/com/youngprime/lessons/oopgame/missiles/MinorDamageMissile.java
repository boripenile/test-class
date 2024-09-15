package com.youngprime.lessons.oopgame.missiles;

import com.youngprime.lessons.oopgame.enemies.IEnemy;

public class MinorDamageMissile extends BaseMissile {

    public MinorDamageMissile(String missileName) {
        super(missileName);
    }

    @Override
    public void shootEnemy(IEnemy enemy) {
        enemy.impact(20);
    }

}
