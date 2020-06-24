package com.github.curriculeon.casino.game.utils;

import com.github.curriculeon.casino.game.PlayerInterface;

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
    public void run() {
        for(GameTypePlayer player : getGame().getPlayers()) {
            evaluateTurn(player);
        }
    }

    @Override
    public GameType getGame() {
        return game;
    }

}
