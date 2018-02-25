package com.mygdx.game.Updater;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by koteyka on 03.09.2017.
 */
public class AsteroidUpdater implements Updatable{

    private Vector2 position;
    private float speed;

    public AsteroidUpdater() {
        recreate();
    }

    @Override
    public void update() {
        position.x -= speed;
        if(position.x < -100) {
            replaceAsteroidToTheRightSide();
        }
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }

    private void recreate() {
        position = new Vector2(1366 + (float) Math.random()*1366, (float) Math.random()*700);
        speed = 4.0f + (float) Math.random() * 4.0f;
    }

    private void replaceAsteroidToTheRightSide(){
        position.x = 1366 + (float) Math.random()*1366;
        position.y = (float) Math.random()*700;
        speed = 4.0f + (float) Math.random() * 4.0f;
    }

}
