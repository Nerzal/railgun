package net.k40s.railgun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

import net.k40s.gameutils.OutOfBoundingException;
import net.k40s.gameutils.OverlapTester;

/**
 * Created by k40s on 10/10/14.
 */
public class MainMenu implements Screen {
    final RailgunMain game;
    OrthographicCamera camera;
    Rectangle playBounds;
    Rectangle exitBounds;
    Vector3 touchPoint;
    public MainMenu(final RailgunMain game) {
        this.game  = game;
        touchPoint = new Vector3();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1280, 768);
        playBounds = new Rectangle(80, 494, 150, 150);
        exitBounds = new Rectangle(80, 34, 150, 150);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glEnable(GL20.GL_TEXTURE_2D);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(Assets.menuBackground, 0, 0);
        game.batch.draw(Assets.exitRegion, 80, 34, 150, 150);
        game.batch.draw(Assets.playRegion, 80, 494, 150, 150);
        game.batch.end();

        if(Gdx.input.justTouched()) {
            camera.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(),
                    0));
            if(OverlapTester.pointInRectangle(playBounds, touchPoint.x,touchPoint.y))
                game.setScreen(new GameScreen(game));
            this.dispose();

            if(OverlapTester.pointInRectangle(exitBounds, touchPoint.x, touchPoint.y)){
                System.exit(0);
                this.dispose();
            }
        }
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
