package com.mygdx.game.Updater.ControlByButton;

/**
 * Created by koteyka on 03.09.2017.
 */
public class MoveToTheUp extends Movies {
    @Override
    public void getMovie() {
        if (position.y < 700) position.y += speed;
    }
}
