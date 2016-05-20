package com.mygdx.game;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class MyGdxGame extends ApplicationAdapter {

	private PooledEngine engine;
	
	@Override
	public void create () {
        System.out.println("1.7.2 test");

		engine = new PooledEngine();
		engine.addSystem(new TestSystem());

        initEntities();
	}

    private void initEntities() {
        Entity entity = engine.createEntity();
        entity.add(engine.createComponent(TestComponent.class));
        engine.addEntity(entity);

        entity = engine.createEntity();
        entity.add(engine.createComponent(TestComponent.class));
        engine.addEntity(entity);
    }

    @Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		engine.update(Gdx.graphics.getDeltaTime());
	}
}
