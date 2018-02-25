package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Updater.BackgroundUpdater;

public class Background extends StarBody {

    StarBody[] stars;
    StarBodiesDirector director;

    public Background() {
        director = new StarBodiesDirector();
        stars = new StarBody[240];
        for(int i = 0; i < stars.length; i++){
            stars[i] = director.constructStar();
        }
        setUpdater(new BackgroundUpdater(stars));
    }


    public void render(SpriteBatch spriteBatch){
        super.render(spriteBatch);
        for(StarBody s : stars) {
            if (Math.random() < 0.99) {
                float scale = s.speed * 0.2f + 0.5f;
                spriteBatch.draw(s.getTexture(), s.position.x, s.position.y, 6, 6, 12, 12, scale, scale, 0, 0, 0, 12, 12, false, false);

            }
        }
    }
}
