package com.github.curriculeon.casino.game.utils;

import com.github.curriculeon.casino.game.PlayerInterface;
import com.github.curriculeon.utils.InputOutputSocketInterface;

import java.util.List;

/**
 * Created by leon on 2/25/18.
 */
public interface GameInterface<PlayerType extends PlayerInterface> extends Runnable, InputOutputSocketInterface {
    List<PlayerType> getPlayers();

    void run();

    void createPlayers();


    default void addPlayer(PlayerType player) {
        if (!contains(player)) {
            getPlayers().add(player);
        }
    }

    default void removePlayer(PlayerType player) {
        getPlayers().add(player);
    }


    default Boolean contains(PlayerType player) {
        return getPlayers().contains(player);
    }
}
