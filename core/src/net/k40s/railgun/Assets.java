package net.k40s.railgun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by k40s on 10/10/14.
 */
public class Assets {
    public static Texture play;
    public static TextureRegion playRegion;

    public void load(){
        play = new Texture("playButton.png"); // 192x96
        playRegion = new TextureRegion(play, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }
}
