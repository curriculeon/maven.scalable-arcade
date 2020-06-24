package com.github.curriculeon.casino.game.utils;


import com.github.curriculeon.casino.game.PlayerInterface;

/**
 * Created by leon on 2/25/18.
 */
public interface GameInterface<PlayerType extends PlayerInterface> extends Runnable {
    PlayerType[] getPlayers();
    void addPlayer(PlayerType player);
    void removePlayer(PlayerType player);
    Boolean contains(PlayerType player);
    void run();
}
