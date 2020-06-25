package com.github.curriculeon.casino.game.utils;

import com.github.curriculeon.casino.game.PlayerInterface;
import com.github.curriculeon.casino.profile.ProfileManager;
import com.github.curriculeon.utils.InputOutputSocketInterface;

import java.util.List;

/**
 * Created by leon on 2/25/18.
 */
public interface GameInterface<PlayerType extends PlayerInterface> extends Runnable, InputOutputSocketInterface {
    List<PlayerType> getPlayers();
    void addPlayer(PlayerType player);
    void removePlayer(PlayerType player);
    Boolean contains(PlayerType player);
    void run();
    void createPlayers();
}
