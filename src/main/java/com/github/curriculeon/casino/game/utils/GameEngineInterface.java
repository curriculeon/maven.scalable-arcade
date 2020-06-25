package com.github.curriculeon.casino.game.utils;

import com.github.curriculeon.casino.game.PlayerInterface;

/**
 * Created by leon on 2/25/18.
 */
public interface GameEngineInterface<
        GameTypePlayer extends PlayerInterface,
        GameType extends GameInterface<GameTypePlayer>>
        extends Runnable {

    GameType getGame();

    void evaluateTurn(GameTypePlayer player);

    default void run() {
        getGame().run();
        for(GameTypePlayer player : getGame().getPlayers()) {
            evaluateTurn(player);
        }
    }
}
