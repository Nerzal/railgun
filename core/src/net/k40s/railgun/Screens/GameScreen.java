package net.k40s.railgun.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import net.k40s.railgun.Assets;
import net.k40s.railgun.World;
import net.k40s.railgun.WorldRenderer;

/**
 * Created by k40s on 10/10/14.
 */
public class GameScreen implements Screen, InputProcessor {

    final RailgunMain game;
    World world; //TODO Man könnte auch die box2D World benutzen hat evtl vorteile
    WorldRenderer worldRenderer;
    OrthographicCamera camera;
    float stateTime;
    TextureRegion currentFrame;
    int lastPosX;
    int lastPosY;
    int halfWidth;
    int halfHeight;
	private Vector3 touchPoint;

    public GameScreen(final RailgunMain game) {
        touchPoint = new Vector3();
        this.game = game;
        world = new World();
        worldRenderer = new WorldRenderer(game.batch);
        touchPoint = new Vector3();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        stateTime = 0f;
        halfWidth = Gdx.graphics.getWidth()/2;
        halfHeight = Gdx.graphics.getHeight()/2;
        lastPosX = 50;
        lastPosY = 50;

    }

    @Override
    public void render(float delta) {
        
        if(Gdx.input.justTouched()){
            camera.unproject(touchPoint);
            if(world.ship.velocity.y > 0 && world.ship.getCenterY() > touchPoint.y ||
                    world.ship.velocity.y < 0 && world.ship.getCenterY() < touchPoint.y)
                world.ship.velocity.y *= -1;

        }
        world.updateWorld(delta);
        worldRenderer.drawWorld(world.enemies, world.ship);
        game.batch.setProjectionMatrix(camera.combined);
        camera.update();
        /**
        game.batch.begin();
        game.batch.draw(Assets.gameBackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        stateTime += Gdx.graphics.getDeltaTime();
        currentFrame = Assets.spa.getKeyFrame(stateTime, true);
		
        if(Gdx.input.isTouched()){
			touchPoint.x = Gdx.input.getX()-32;
			touchPoint.y = Gdx.input.getY()-32;
            camera.unproject(touchPoint); // Hier werden die screenKoordinaten mit den openGL koordinaten auf einen Nenner gebracht
            game.batch.draw(currentFrame, touchPoint.x, touchPoint.y, 128, 128);
        } else {
            game.batch.draw(currentFrame, touchPoint.x, touchPoint.y, 128, 128);

            if(lastPosX < halfWidth-32){
                lastPosX++;
            } else if(lastPosX > halfWidth-32){
                lastPosX--;
            }

            if(lastPosY < halfHeight-32){
                lastPosY++;
            } else if (lastPosY > halfHeight-32){
                lastPosY--;
            }
        }
        game.batch.end();
         */
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
        this.dispose();
    }

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}
