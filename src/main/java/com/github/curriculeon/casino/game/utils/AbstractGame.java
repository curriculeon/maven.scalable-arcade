package com.github.curriculeon.casino.game.utils;


import com.github.curriculeon.casino.game.PlayerInterface;
import com.github.curriculeon.utils.InputOutputConsole;
import com.github.curriculeon.utils.InputOutputConsoleInterface;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/25/18.
 */
abstract public class AbstractGame<PlayerType extends PlayerInterface> implements GameInterface<PlayerType> {
    protected List<PlayerType> players;

    public AbstractGame(PlayerType... players) {
        this.players = Arrays.asList(players);
    }

    @Override
    public InputOutputConsoleInterface getConsole() {
        return new InputOutputConsole();
    }

    @Override
    public PlayerType[] getPlayers() {
        return (PlayerType[]) players.stream().toArray();
    }

    @Override
    public void addPlayer(PlayerType player) {
        if (!contains(player)) {
            players.add(player);
        }
    }


    @Override
    public void removePlayer(PlayerType player) {
        players.add(player);
    }


    @Override
    public Boolean contains(PlayerType player) {
        return players.contains(player);
    }
}
