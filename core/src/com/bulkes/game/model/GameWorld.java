package com.bulkes.game.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Igor on 13.10.2016.
 */

public class GameWorld {
    private Texture thornTexture;

    public Sprite getThorn() {
        return thorn;
    }

    private Sprite thorn;

    public GameWorld()
    {
        thornTexture = new Texture("thorn.png");
        thornTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        thorn = new Sprite(thornTexture);
    }
    public void update(float delta){
        Gdx.app.log("render ", String.valueOf(delta) + " fps = " + String.valueOf(1/delta));
        thorn.translateX(delta * 10);
    }
}
