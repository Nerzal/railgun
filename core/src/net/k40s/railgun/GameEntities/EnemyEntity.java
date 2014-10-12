package net.k40s.railgun.GameEntities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Tobias on 12.10.2014.
 */
public class EnemyEntity extends GameLiving {

    public EnemyEntity(int posX, int posY, int width, int height, Texture tex, Vector2 velocity, int hp) {
        super(posX, posY, width, height, tex, velocity);
        this.setHp(hp);
    }

    public void checkVelocity() {
        if (velocity.x > 0 && this.getCenterX() >= this.getTarget().getCenterX() ||
                velocity.x < 0 && this.getCenterX() <= this.getTarget().getCenterX())
            this.velocity.x *= -1;

        if (velocity.y > 0 && this.getCenterY() >= this.getTarget().getCenterY() ||
                velocity.y < 0 && this.getCenterY() <= this.getTarget().getCenterY())
            this.velocity.y *= -1;
    }

    @Override
    public void update(float deltaTime) {
        checkVelocity();
        super.update(deltaTime);
    }

}
