package com.mygdx.game.Updater.ControlByButton;

/**
 * Created by koteyka on 03.09.2017.
 */
public class MoveToTheLeft extends Movies {
    @Override
    public void getMovie() {
        if (position.x > 0) position.x -= speed;
    }
}
