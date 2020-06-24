package com.github.curriculeon.casino.game.utils;


import com.github.curriculeon.casino.game.cardgame.highlow.HighLowGameEngine;
import com.github.curriculeon.casino.utils.DecisionInterface;

import java.util.function.Supplier;

/**
 * Created by leon on 2/25/18.
 */
public enum GameSelection implements DecisionInterface {
    HIGH_LOW(HighLowGameEngine::new);

    private final Supplier<GameEngineInterface> gameConstructor;

    GameSelection(Supplier<GameEngineInterface> gameConstructor) {
        this.gameConstructor = gameConstructor;
    }

    public void perform() {
        create().run();
    }

    public GameEngineInterface create() {
        return gameConstructor.get();
    }
}
