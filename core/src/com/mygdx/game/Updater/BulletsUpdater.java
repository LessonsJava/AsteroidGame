package com.mygdx.game.Updater;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by koteyka on 03.09.2017.
 */
public class BulletsUpdater implements Updatable {

    private Vector2 position;
    private float speed;

    public BulletsUpdater(Vector2 position, float speed) {
        this.position = position;
        this.speed = speed;
    }

    @Override
    public void update() {
        position.x = position.x + speed;
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }
}
