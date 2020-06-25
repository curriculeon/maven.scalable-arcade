package com.github.curriculeon.casino.game.utils;

import com.github.curriculeon.casino.game.PlayerInterface;
import com.github.curriculeon.utils.InputOutputConsole;

/**
 * Created by leon on 2/25/18.
 */
public abstract class AbstractGameEngine<
        GameTypePlayer extends PlayerInterface,
        GameType extends GameInterface<GameTypePlayer>>
        implements GameEngineInterface<GameTypePlayer, GameType> {

    private final GameType game;

    public AbstractGameEngine(GameType game) {
        this.game = game;
    }

    @Override
    public GameType getGame() {
        return game;
    }
}
