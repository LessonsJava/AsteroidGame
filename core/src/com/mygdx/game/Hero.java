package com.mygdx.game;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Updater.HeroUpdater;
import java.util.ArrayList;
import java.util.List;

public class Hero extends StarBody {

    Texture bulletTexture;
    private List<StarBody> bullets;

    public Hero(){
        bulletTexture = new Texture("bullet.png");
        position = new Vector2(100, 328);
        bullets = new ArrayList<>();
        setHeroUpdater();
    }

    public void setHeroUpdater(){
        setUpdater(new HeroUpdater(bullets, speed, texture));
    }


    public List<StarBody> getBullets() {
        return bullets;
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        super.render(spriteBatch);
        for (StarBody b : bullets)
        spriteBatch.draw(bulletTexture, b.position.x, b.position.y);
    }
}

