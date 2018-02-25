package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class MyGdxGame extends ApplicationAdapter {

	private SpriteBatch batch;
	private StarBody background;
	private StarBody hero;
	private List<StarBody> asteroids;
	private StarBodiesDirector director = new StarBodiesDirector();


	@Override
	public void create () {
		batch = new SpriteBatch();
		background = director.constructBackground();
		hero = director.constructHero();
		asteroids = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			asteroids.add(director.constructAsteroid());
		}
	}

	@Override
	public void render () {
		update();
		batch.begin();
		background.render(batch);
		hero.render(batch);
		for (StarBody a : asteroids){
			a.render(batch);
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
	}

	private void update(){
		background.update();
		hero.update();
		for (int i = 0; i < asteroids.size(); i++){
			StarBody a = asteroids.get(i);
			a.update();

			if (isAsteroidGainedStarBody(hero.getRect(), a.getRect())){
				System.out.println("Попал в героя");
				hero = null;
			}

			for (StarBody b : ((Hero)hero).getBullets()){
				if (isAsteroidGainedStarBody(b.getRect(), a.getRect())){
					System.out.println("Попал в астероид");
					asteroids.remove(i);
				}
			}

			if (asteroids.isEmpty()){
				System.out.println("Подбиты все астероиды");
				hero = null;
			}
		}
	}

	public boolean isAsteroidGainedStarBody(Rectangle starRectangle, Rectangle asteroidRectangle){
		return starRectangle.overlaps(asteroidRectangle);
	}
}
