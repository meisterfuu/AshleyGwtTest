package com.mygdx.game;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.utils.Pool;

/**
 * Created by meisterfuu on 20.05.2016.
 */
public class TestComponent implements Component, Pool.Poolable {

    int x = 0;

    @Override
    public void reset() {
        x = 0;
    }

}
