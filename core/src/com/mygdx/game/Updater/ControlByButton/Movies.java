package com.mygdx.game.Updater.ControlByButton;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.StarBody;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by koteyka on 03.09.2017.
 */
public abstract class Movies implements Movable {

    protected List<StarBody> bullets;
    protected Calendar calendar = new GregorianCalendar();
    protected Vector2 position;
    protected float speed;
    protected Texture texture;

    public Movies setBullets(List<StarBody> bullets) {
        this.bullets = bullets;
        return this;
    }

    public Movies setPosition(Vector2 position) {
        this.position = position;
        return this;
    }

    public Movies setSpeed(float speed) {
        this.speed = speed;
        return this;
    }

    public Movies setTexture(Texture texture) {
        this.texture = texture;
        return this;
    }

    public abstract void getMovie();
}
