package net.k40s.railgun;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Tobias on 12.10.2014.
 */
public class GameObject {
    protected Rectangle position;
    protected Texture tex;
    protected boolean isVisible;

    public GameObject() {
        position = new Rectangle();
        tex = null;
        isVisible = false;
    }

    public GameObject(int posX, int posY, int width, int height, Texture texture) {
        position = new Rectangle();
        position.x = posX;
        position.y = posY;
        position.width = width;
        position.height = height;
        tex = texture;
        isVisible = true;
    }

    /**
     * Draws the object onto the FrameBuffer
     * batch.begin() must be called before this method is called
     *
     * @param batch
     */
    public void draw(SpriteBatch batch) {
        if(isVisible)
           batch.draw(tex, position.x, position.y, position.width, position.height);
    }

    public void setVisibility(boolean visible){
        isVisible = visible;
    }
}
