package net.k40s.railgun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.utils.Array;

import net.k40s.railgun.GameEntities.EnemyEntity;
import net.k40s.railgun.GameEntities.Pepper;
import net.k40s.railgun.GameEntities.PlayerShip;

import java.util.Random;

/**
 * Created by Tobias on 12.10.2014.
 */
public class World {
    public FPSLogger fps;
    public PlayerShip ship;
    public Array<EnemyEntity> enemies;
    private float screenCenterX;
    private float screenCenterY;
    private int screenWidth;
    private int screenHeight;
    private Random rand;
    private float stateTime;

    public World() {
        screenHeight = Gdx.graphics.getHeight();
        screenWidth = Gdx.graphics.getWidth();
        rand = new Random();
        fps = new FPSLogger();
        ship = new PlayerShip(100, (int) screenCenterY, 128, 128);
        enemies = new Array<EnemyEntity>();
        generateEnemies(3);
    }

    private void generateEnemies(int enemyCount) {
        for (int i = 0; i < enemyCount; i++) {
            EnemyEntity tmpEnemy = new Pepper(screenWidth, (int) (screenCenterY + rand.nextInt(100)), 128, 128);
            tmpEnemy.setTarget(ship);
            enemies.add(tmpEnemy);
        }
    }

    public void updateWorld(float deltaTime) {
        ship.update(deltaTime);

        for (EnemyEntity obj : enemies) {
            obj.update(deltaTime);
        }

        stateTime += deltaTime;
    }

    public float getStateTime() {
        return stateTime;
    }

    public void setStateTime(float stateTime) {
        this.stateTime = stateTime;
    }
}
