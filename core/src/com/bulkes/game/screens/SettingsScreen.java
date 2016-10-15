package com.bulkes.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by Igor on 14.10.2016.
 */

public class SettingsScreen implements Screen {

    private OrthographicCamera settingsCamera;
    private float ortoWidth;
    private float ortoHeight;
    private float screenRatio;

    private SpriteBatch spriteBatch;
    private Skin skin;
    private Table table;
    private Stage stage;
    private TextButton buttonExit, buttonPlay;
    private Label heading;

    public SettingsScreen(){

        settingsCamera = new OrthographicCamera();
        ortoHeight = 480f;
        float screenHeght = Gdx.graphics.getHeight();
        float screenWidth = Gdx.graphics.getWidth();
        screenRatio = screenWidth/screenHeght;
        ortoWidth = ortoHeight * screenRatio;
        settingsCamera = new OrthographicCamera(ortoWidth, ortoHeight);
        settingsCamera.position.set(settingsCamera.viewportWidth * .5f,settingsCamera.viewportHeight * .5f, 0f);
        settingsCamera.update();
    }

    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        skin = new Skin(Gdx.files.internal("settingsUISkin.json"));
        stage = new Stage();
        table = new Table();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        settingsCamera.update();

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
