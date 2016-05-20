package com.mygdx.game;

import com.badlogic.ashley.core.ComponentMapper;

/**
 * Created by meisterfuu on 20.05.2016.
 */
public class Mapper {

    public static final ComponentMapper<TestComponent> test = ComponentMapper.getFor(TestComponent.class);

}
