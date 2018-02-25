package com.mygdx.game.Updater.ControlByButton;

import com.badlogic.gdx.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by koteyka on 03.09.2017.
 */
public class MoveCreator {

    private MoveCreator() {
    }

    private static Map<Integer, Movable> map = new HashMap<>();

    static{
        map.put(Input.Keys.A, new MoveToTheLeft());
        map.put(Input.Keys.W, new MoveToTheUp());
        map.put(Input.Keys.S, new MoveToTheDown());
        map.put(Input.Keys.D, new MoveToTheRight());
        map.put(Input.Keys.SPACE, new Fire());
        map.put(Input.Keys.DPAD_RIGHT, new MoveToTheRight());
        map.put(Input.Keys.DPAD_LEFT, new MoveToTheLeft());
        map.put(Input.Keys.DPAD_UP, new MoveToTheUp());
        map.put(Input.Keys.DPAD_DOWN, new MoveToTheDown());
    }

    public static Movable createMovie(int inputValue){
        return map.get(inputValue);
    }

    public static Set<Integer> getKeySet(){return map.keySet();}
}
