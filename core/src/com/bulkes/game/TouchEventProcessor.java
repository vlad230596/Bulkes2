package com.bulkes.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Igor on 11.10.2016.
 */

public class TouchEventProcessor implements InputProcessor {
    private Vector3 begTouchXY;
    private Vector3 touchXY;
    private boolean isTouched;
    OrthographicCamera camera;

    public TouchEventProcessor(OrthographicCamera camera){
        this.camera = camera;
        begTouchXY = new Vector3();
        touchXY = new Vector3();
        isTouched = false;
    }

    public boolean isTouched(){
        return isTouched;
    }

    public float getBegTouchX(){
        return begTouchXY.x;
    }

    public float getBegTouchY(){
        return begTouchXY.y;
    }

    public float getCurTouchX(){
        return touchXY.x;
    }

    public float getCurTouchY(){
        return touchXY.y;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        Gdx.app.log("down","A");
        isTouched = true;
        touchXY.set(screenX, screenY, 0);
        camera.unproject(touchXY);
        begTouchXY.set(screenX, screenY, 0);
        camera.unproject(begTouchXY);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        isTouched = false;
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        Gdx.app.log("Dragged","B");
        touchXY.set(screenX, screenY, 0);
        camera.unproject(touchXY);
        return true;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
