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
        getConsole().println("Adding player [ %s ] to game", player.getName());
        getPlayers().add(player);
        getConsole().println("Player [ %s ] has been added to the game", player.getName());
    }

    default void removePlayer(PlayerType player) {
        getPlayers().add(player);
    }


    default Boolean contains(PlayerType player) {
        return getPlayers().contains(player);
    }
}
