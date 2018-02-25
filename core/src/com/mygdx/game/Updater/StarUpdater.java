package com.mygdx.game.Updater;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by koteyka on 03.09.2017.
 */
public class StarUpdater implements Updatable {

    private Vector2 position;
    private float speed;

    public StarUpdater(){
        position = new Vector2((float) Math.random()*1366, (float) Math.random()*700);
        speed = 1.0f + (float) Math.random() * 4.0f;
    }

    @Override
    public void update() {
        position.x -= speed;
        if(position.x < -20) {
            replaceStarToTheRightSide();
        }
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }

    private void replaceStarToTheRightSide(){
        position.x = 1366;
        position.y = (float) Math.random() * 883;
        speed = 1.0f + (float) Math.random() * 4.0f;
    }
}
