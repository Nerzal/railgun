package net.k40s.railgun.GameEntities;

import com.badlogic.gdx.math.Vector2;

import net.k40s.railgun.Assets;

/**
 * Created by Tobias on 12.10.2014.
 */
public class Pepper extends EnemyEntity {
    public Pepper(int posX, int posY, int width, int height) {
        super(posX, posY, width, height, Assets.pepperSprite, new Vector2(10, 10), 100);
    }

    //TODO evtl soll pepper ja noch Tolle sachen können -> Methoden schreiben und evtl. die draw und update methoden überschreiben
}
