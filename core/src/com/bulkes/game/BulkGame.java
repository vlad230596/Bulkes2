package com.bulkes.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.bulkes.game.screens.GameScreen;
import com.bulkes.game.screens.MenuScreen;
import com.sun.javafx.scene.paint.GradientUtils;

import static java.awt.SystemColor.window;


public class BulkGame extends Game {

	@Override
	public void create () {
		//Gdx.app.log("BulkGame","@Create");
		setScreen(new GameScreen());
		//setScreen(new MenuScreen());
	}
}
