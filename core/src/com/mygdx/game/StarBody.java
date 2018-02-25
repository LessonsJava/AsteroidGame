package com.mygdx.game;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Updater.Updatable;

/**
 * Created by Zver on 10.07.2017.
 */
public class StarBody {

    protected Texture texture;
    protected Vector2 position;
    protected float speed;
    private Updatable updater;

    public StarBody(){
    }

    public void setUpdater(Updatable updater) {
        this.updater = updater;
        position = updater.getPosition();
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return texture;
    }

    void render(SpriteBatch spriteBatch){
        spriteBatch.draw(texture, position.x, position.y);
    }

    public void update(){
        updater.update();
    }

    public Rectangle getRect(){
        return new Rectangle(position.x, position.y, texture.getWidth(), texture.getHeight());
    }

}
