package net.k40s.railgun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Tobias on 12.10.2014.
 */
public class DynamicGameObject extends GameObject {
    public Vector2 velocity;
    protected float stateTime;

    public DynamicGameObject(int posX, int posY, int width, int height, Texture tex, Vector2 velocity) {
        super(posX, posY, width, height, tex);
        this.velocity = velocity;
        this.stateTime = 0;
    }

    /**
     * Updates the Objects position within the range of the screen.
     * Also updates the Objects stateTime
     *
     * @param deltaTime
     */
    public void update(float deltaTime) {
        if (velocity.x > 0 && position.x + position.width < Gdx.graphics.getWidth()
                || velocity.x < 0 && position.x + position.width > Gdx.graphics.getWidth())
            this.position.x += velocity.x;

        if (velocity.y > 0 && position.y + position.height < Gdx.graphics.getHeight()
                || velocity.y < 0 && position.x + position.height > Gdx.graphics.getHeight())
            this.position.x += velocity.x;

        this.stateTime += deltaTime;
    }

    public void setVelocity(int velocityX, int velocityY) {
        this.velocity.x = velocityX;
        this.velocity.y = velocityY;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public Vector2 getVelocity(){
        return velocity;
    }


}
