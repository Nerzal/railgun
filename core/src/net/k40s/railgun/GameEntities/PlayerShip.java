package net.k40s.railgun.GameEntities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import net.k40s.railgun.GameEntities.GameLiving;

/**
 * Created by Tobias on 12.10.2014.
 */
public class PlayerShip extends GameLiving {

    public PlayerShip(int posX, int posY, int width, int height, Texture tex, Vector2 velocity) {
        super(posX, posY, width, height, tex, velocity);
    }
}
