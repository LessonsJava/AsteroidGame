package com.mygdx.game.Updater.ControlByButton;

/**
 * Created by koteyka on 03.09.2017.
 */
public class MoveToTheDown extends Movies {
    @Override
    public void getMovie() {
        if (position.y > 0) position.y -= speed;
    }
}
