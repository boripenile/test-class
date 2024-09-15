import com.youngprime.lessons.oopgame.aircrafts.BaseAircraft;
import com.youngprime.lessons.oopgame.aircrafts.NavalAircraft;
import com.youngprime.lessons.oopgame.enemies.BaseEnemy;
import com.youngprime.lessons.oopgame.enemies.TrollEnemy;
import com.youngprime.lessons.oopgame.missiles.BaseMissile;
import com.youngprime.lessons.oopgame.missiles.IMissile;
import com.youngprime.lessons.oopgame.missiles.MediumDamageMissile;

public class Main {
    public static void main(String[] args) {

//        Vehicle dangoteLorry = new Lorry();
//        dangoteLorry.drive();
//
//        IDrivable drivingSpeed = new HighSpeedDrivable();
//
//        dangoteLorry.setSpeed(1005);
//        dangoteLorry.setDrivable(drivingSpeed);
//
//        dangoteLorry.drive();

        System.out.println("=========A Simple Aircraft Game=========");
        BaseEnemy trollEnemy = new TrollEnemy("Troll Enemy", 1200);
        BaseAircraft ufo = new NavalAircraft("UFO Aircraft");
        BaseMissile mediumMissile = new MediumDamageMissile("Medium Missile");

        System.out.println("Aircraft ::: " + ufo.getAircraftName() + " ::: started with " + ufo.getMissile().getMissileName());
        System.out.println("Enemy ::: " + trollEnemy.getEnemyName() + " ::: with energy level of " + trollEnemy.getEnergy());
        for (int i = 0; i < 10; i++) {
            if (i <= 5) {
                ufo.fireMissiles(trollEnemy);
            } else{
                ufo.changeMissile(mediumMissile);
                ufo.fireMissiles(trollEnemy);
            }
            System.out.println("Enemy ::: " + trollEnemy.getEnemyName() + " ::: depreciated to " + trollEnemy.getEnergy());
        }
        System.out.println("Aircraft ::: " + ufo.getAircraftName() + " ::: later loaded " + ufo.getMissile().getMissileName());
        System.out.println("Enemy ::: " + trollEnemy.getEnemyName() + " ::: depreciated to " + trollEnemy.getEnergy());
    }
}