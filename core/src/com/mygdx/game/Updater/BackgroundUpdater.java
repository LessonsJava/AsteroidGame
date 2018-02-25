package com.mygdx.game.Updater;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.StarBody;

/**
 * Created by koteyka on 03.09.2017.
 */
public class BackgroundUpdater implements Updatable {

    private StarBody[] stars;
    private Vector2 position;

    public BackgroundUpdater(StarBody[] stars) {
        this.stars = stars;
        position = new Vector2(0,0);
    }

    @Override
    public void update() {
        for (StarBody star : stars){
            star.update();
        }
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }
}
