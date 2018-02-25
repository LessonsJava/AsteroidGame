package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Updater.AsteroidUpdater;
import com.mygdx.game.Updater.BulletsUpdater;
import com.mygdx.game.Updater.StarUpdater;

/**
 * Created by koteyka on 03.09.2017.
 */
public class StarBodiesDirector {

    private StarBody starBody;

    public StarBody constructAsteroid(){
        starBody = new StarBody();
        starBody.setTexture(Textures.ASTEROID);
        starBody.setUpdater(new AsteroidUpdater());
        return starBody;
    }

    public StarBody constructBullet(Vector2 position){
        starBody = new StarBody();
        starBody.setTexture(Textures.BULLET);
        starBody.setPosition(position);
        starBody.setUpdater(new BulletsUpdater(position, 10.0f));
        return starBody;
    }

    public StarBody constructHero(){
        starBody = new Hero();
        starBody.setTexture(Textures.HERO);
        starBody.setSpeed(10.0f);
        ((Hero) starBody).setHeroUpdater();
        return starBody;
    }

    public StarBody constructBackground(){
        starBody = new Background();
        starBody.setTexture(Textures.BACGROUND);
        starBody.setPosition(new Vector2(0,0));
        return starBody;
    }

    public StarBody constructStar(){
        starBody = new StarBody();
        starBody.setTexture(Textures.STAR);
        starBody.setUpdater(new StarUpdater());
        return starBody;
    }
}
