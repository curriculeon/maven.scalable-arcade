package com.github.curriculeon.casino.game.utils;


import com.github.curriculeon.casino.game.PlayerInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by leon on 2/25/18.
 */
abstract public class AbstractGame<PlayerType extends PlayerInterface> implements GameInterface<PlayerType> {
    protected List<PlayerType> players;

    public AbstractGame(PlayerType... players) {
        this.players = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(players)));
    }

    @Override
    public List<PlayerType> getPlayers() {
        return players;
    }
}
