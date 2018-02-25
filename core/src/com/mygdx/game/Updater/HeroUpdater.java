package com.mygdx.game.Updater;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.StarBody;
import com.mygdx.game.Updater.ControlByButton.MoveCreator;
import com.mygdx.game.Updater.ControlByButton.Movies;
import java.util.List;

/**
 * Created by koteyka on 03.09.2017.
 */
public class HeroUpdater implements Updatable {

    private List<StarBody> bullets;
    private Vector2 position;
    private float speed;
    private Texture texture;


    public HeroUpdater(List<StarBody> bullets, float speed, Texture texture) {
        this.bullets = bullets;
        this.speed = speed;
        this.texture = texture;
        position = new Vector2(100, 328);
    }

    @Override
    public void update() {
        updateBullets();
        moveFromButtons();
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }

    private void moveFromButtons(){
        for (Integer key : MoveCreator.getKeySet()){
            if(Gdx.input.isKeyPressed(key)) ((Movies) MoveCreator.createMovie(key)) .setBullets(bullets)
                    .setPosition(position)
                    .setSpeed(speed)
                    .setTexture(texture)
                    .getMovie();
        }
    }

    private void updateBullets(){
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).update();
            if (bullets.get(i).getPosition().x > 1366) bullets.remove(i);
        }
    }
}
