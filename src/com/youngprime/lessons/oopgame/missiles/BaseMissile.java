package com.youngprime.lessons.oopgame.missiles;

import com.youngprime.lessons.oopgame.enemies.IEnemy;

public class BaseMissile implements IMissile{

    private String missileName;

    public BaseMissile(String missileName) {
        this.missileName = missileName;
    }

    @Override
    public void shootEnemy(IEnemy enemy) {
        System.out.println("No base implementation");
    }

    @Override
    public String getMissileName() {
        return missileName;
    }
}
