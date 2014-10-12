package net.k40s.railgun.GameEntities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import net.k40s.railgun.DynamicGameObject;

/**
 * Created by Tobias on 12.10.2014.
 */
public class Projectile extends DynamicGameObject {
    double damage; // höhö
    boolean dispose;

    public Projectile(int posX, int posY, int width, int height, Texture tex, Vector2 velocity) {
        super(posX, posY, width, height, tex, velocity);
        this.dispose = false;
    }

    @Override
    public void update(float deltaTime) {
        //TODO Checken, ob das Ziel getroffen wurde
        //TODO Ziel getroffen? dann markiere dieses Object zum entfernen
        super.update(deltaTime);
    }
}
