package com.mygdx.game.Updater.ControlByButton;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.StarBodiesDirector;

import java.util.GregorianCalendar;

/**
 * Created by koteyka on 03.09.2017.
 */
public class Fire extends Movies {

    private StarBodiesDirector director = new StarBodiesDirector();

    @Override
    public void getMovie() {
        long timeToCompare = calendar.getTimeInMillis() + 100;
        if (timeToCompare <= new GregorianCalendar().getTimeInMillis()) {
            bullets.add(director.constructBullet(new Vector2(position.x + texture.getWidth(), position.y + texture.getHeight()/2)));
            calendar = new GregorianCalendar();
        }
    }
}
