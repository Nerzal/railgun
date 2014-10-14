package net.k40s.railgun.GameEntities;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import net.k40s.railgun.Assets;

/**
 * Created by Tobias on 12.10.2014.
 */
public class PlayerShip extends GameLiving {
    private Array<Projectile> projectiles;

    public PlayerShip(int posX, int posY, int width, int height) {
        super(posX, posY, width, height, Assets.spaceship, new Vector2(0, 0));
        projectiles = new Array<Projectile>();
    }

    @Override
    public void draw(SpriteBatch batch) {
        if (velocity.x != 0 || velocity.y != 0 && hp > 0)
            batch.draw(Assets.spa.getKeyFrame(stateTime, true), position.x, position.y, position.width, position.height);
        else
            super.draw(batch);
    }

    @Override
    public void update(float deltaTime) {
        updateProjectiles(deltaTime);
        super.update(deltaTime);
    }

    public void shot(float deltaTime) {
        projectiles.add(new Projectile((int) getCenterX(), (int) getCenterY(), 50, 20, Assets.spaceship, new Vector2(10, 0)));
    }

    private void updateProjectiles(float deltaTime) {
        for (Projectile obj : projectiles)
            obj.update(deltaTime);
    }

    public Array<Projectile> getProjectiles() {
        return this.projectiles;
    }

    public void setProjectiles(Array<Projectile> projectiles) {
        this.projectiles = projectiles;
    }
}
