package net.k40s.railgun.Screens;

/**
 * Created by k40s on 10/10/14.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

import net.k40s.gameutils.OverlapTester;
import net.k40s.railgun.Assets;

public class MainMenu implements Screen {

    final RailgunMain game;

    OrthographicCamera camera;
    Rectangle playBounds;
    Vector3 touchPoint;
    int halfWidth = Gdx.graphics.getWidth() / 2;
    int halfHeight = Gdx.graphics.getHeight() / 2;

    public MainMenu(final RailgunMain game) {
        this.game = game;
        touchPoint = new Vector3();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        playBounds = new Rectangle(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glEnable(GL20.GL_TEXTURE_2D);

        game.batch.setProjectionMatrix(camera.combined);
        camera.update();

        game.batch.begin();
        game.batch.draw(Assets.menuBackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        game.batch.draw(Assets.play, halfWidth - 96, halfHeight - 48);
        game.batch.end();

        if (Gdx.input.justTouched()) {
            camera.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(),
                    0));
            if (OverlapTester.pointInRectangle(playBounds, touchPoint.x, touchPoint.y))
                game.setScreen(new GameScreen(game));
            this.dispose();
        }

    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        dispose();

    }
}

