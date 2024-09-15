package com.youngprime.lessons.oopgame.missiles;

import com.youngprime.lessons.oopgame.enemies.IEnemy;

public interface IMissile {

    public void shootEnemy(IEnemy enemy);
    public String getMissileName();
}
