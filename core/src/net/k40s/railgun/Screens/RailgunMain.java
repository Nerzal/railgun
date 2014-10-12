package net.k40s.railgun.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.k40s.railgun.Assets;
import net.k40s.railgun.Screens.MainMenu;

public class RailgunMain extends Game {
	SpriteBatch batch;
	
	@Override
	public void create () {
        Assets.load();
		batch = new SpriteBatch();
        this.setScreen(new MainMenu(this));
	}


	@Override
	public void render () {
        super.render();
	}
}
