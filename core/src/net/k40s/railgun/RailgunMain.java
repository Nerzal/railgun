package net.k40s.railgun;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RailgunMain extends Game {
	SpriteBatch batch;
    MainMenu menu;
	
	@Override
	public void create () {
        Assets.load();
		batch = new SpriteBatch();
        menu = new MainMenu(this);
	}

	@Override
	public void render () {
        super.render();
	}
}
