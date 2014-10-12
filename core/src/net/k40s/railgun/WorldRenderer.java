package net.k40s.railgun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

import net.k40s.railgun.GameEntities.EnemyEntity;
import net.k40s.railgun.GameEntities.PlayerShip;
import net.k40s.railgun.GameEntities.Projectile;

/**
 * Created by Tobias on 12.10.2014.
 */
public class WorldRenderer {
    SpriteBatch batch;
    float screenWidth;
    float screenHeight;

    public WorldRenderer(SpriteBatch batch) {
        this.batch = batch;
        screenHeight = Gdx.graphics.getHeight();
        screenWidth = Gdx.graphics.getWidth();
    }

    /**
     * Draws the whole World
     *
     * @param enemies
     * @param playerShip
     */
    public void drawWorld(Array<EnemyEntity> enemies, PlayerShip playerShip) {
        batch.begin();
        drawBackground();
        drawAllEnemyEntities(enemies);
        drawProjectiles(playerShip.getProjectiles());
        drawPlayerShip(playerShip);
        batch.end();
    }

    private void drawBackground() {
        batch.draw(Assets.gameBackground, 0, 0, screenHeight, screenHeight);
    }

    private void drawAllEnemyEntities(Array<EnemyEntity> enemies) {
        for (EnemyEntity obj : enemies)
            obj.draw(batch);
    }

    private void drawPlayerShip(PlayerShip playerShip) {
        playerShip.draw(batch);
    }

    private void drawProjectiles(Array<Projectile> projectiles) {
        for (Projectile obj : projectiles)
            obj.draw(batch);
    }
}
