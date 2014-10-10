package net.k40s.railgun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by k40s on 10/10/14.
 */
public class Assets {
    public static Texture play;
    public static Texture menuBackground;
    public static Texture gameBackground;
    public static Texture pepperSprite;

    public static void load(){
        play = new Texture("playButton.png"); // 192x96
        menuBackground = new Texture("menuBackground.png");
        gameBackground = new Texture("menuBackground.png"); //TODO Create Background
        pepperSprite = new Texture("pepperSprite.png");
    }
}
