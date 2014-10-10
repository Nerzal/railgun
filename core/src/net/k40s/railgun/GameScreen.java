package net.k40s.railgun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

import net.k40s.gameutils.OverlapTester;

/**
 * Created by k40s on 10/10/14.
 */
public class GameScreen implements Screen {

    final RailgunMain game;
    OrthographicCamera camera;
    int halfWidth = Gdx.graphics.getWidth()/2;
    int halfHeight = Gdx.graphics.getHeight()/2;
    int i = 0;
    int j = 0;

    public GameScreen(final RailgunMain game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glEnable(GL20.GL_TEXTURE_2D);

        game.batch.setProjectionMatrix(camera.combined);
        camera.update();
        game.batch.begin();
        game.batch.draw(Assets.gameBackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        if(Gdx.input.isTouched()){
            game.batch.draw(Assets.pepperSprite, Gdx.input.getX(), Gdx.input.getY());
        }
        if (i < Gdx.graphics.getHeight()) {
            game.batch.draw(Assets.pepperSprite, j, i);
            i++;
            j++;
        } else {
            i = 0;
            j = 0;
        }
        game.batch.end();
    }


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
