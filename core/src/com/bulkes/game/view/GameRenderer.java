package com.bulkes.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bulkes.game.model.GameWorld;

/**
 * Created by Igor on 13.10.2016.
 */

public class GameRenderer {

    private GameWorld world;
    private OrthographicCamera gameCamera;
    private float ortoWidth;
    private float ortoHeight;
    private float screenRatio;
    //--------------------------------
    private SpriteBatch spriteBatch;
    private Texture thornTexture;
    private Sprite thorn;

    public GameRenderer(GameWorld world){
        this.world = world;
        spriteBatch = new SpriteBatch();

        thornTexture = new Texture("thorn.png");
        thornTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        thorn = new Sprite(thornTexture);
       // thorn = new Sprite(new Texture("thorn.png"));


        ortoHeight = 480f;
     //   ortoHeight = 1080f;
        float screenHeght = Gdx.graphics.getHeight();
        float screenWidth = Gdx.graphics.getWidth();
        screenRatio = screenWidth/screenHeght;
        ortoWidth = ortoHeight * screenRatio;
        Gdx.app.log("WIDTH", String.valueOf(Gdx.graphics.getWidth()));
        Gdx.app.log("HEIGHT", String.valueOf(Gdx.graphics.getHeight()));
        Gdx.app.log("WIDTH", String.valueOf(ortoWidth));
        Gdx.app.log("HEIGHT", String.valueOf(ortoHeight));
        Gdx.app.log("ScreenRatio", String.valueOf(screenRatio));
        gameCamera = new OrthographicCamera(ortoWidth, ortoHeight);
        gameCamera.position.set(gameCamera.viewportWidth * .5f,gameCamera.viewportHeight * .5f, 0f);
        gameCamera.update();
    }

    public void render(){
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT| GL20.GL_DEPTH_BUFFER_BIT);
        gameCamera.update();
        spriteBatch.setProjectionMatrix(gameCamera.combined);
        spriteBatch.begin();
        //spriteBatch.draw(thorn, 200, 200,200,200);//рисуем спрайт заданной ширины и высоты
        thorn = world.getThorn();
        float scale = 0.25f;
        for(int i = 0; i < 100; ++i)
            spriteBatch.draw(thorn, thorn.getX(), thorn.getY() + i * 0.25f , thorn.getWidth() * scale, thorn.getHeight() * scale);
        spriteBatch.end();
    }

    public void dispose(){
        thornTexture.dispose();
        spriteBatch.dispose();
    }
}
