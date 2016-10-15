package com.bulkes.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.bulkes.game.model.GameWorld;
import com.bulkes.game.view.GameRenderer;

/**
 * Created by Igor on 13.10.2016.
 */

public class GameScreen implements Screen {

    private GameWorld gameWorld;
    private GameRenderer gameRender;

    public GameScreen(){
       // Gdx.app.log("GameScreen", "Hear");
        gameWorld = new GameWorld();
        gameRender = new GameRenderer(gameWorld);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        gameWorld.update(delta);
        gameRender.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
