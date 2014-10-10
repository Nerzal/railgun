package net.k40s.railgun;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by k40s on 10/10/14.
 */
public class Assets {
    //TODO
    public static Texture menuBackground;
    public static TextureRegion exitRegion;
    public static TextureRegion playRegion;
    public static Texture play;
    public static Texture exit;

    public static void load(Game game){
        play = new Texture("playButton.png"); // 192x96
        playRegion = new TextureRegion(play, 0, 0, 256, 256);
        exit = new Texture("exitButton.png");
        exitRegion = new TextureRegion(exit, 0, 0, 256, 256);
    }
}
