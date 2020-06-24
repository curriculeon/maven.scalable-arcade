package com.github.curriculeon.casino.game.utils;


import com.github.curriculeon.casino.game.Player;
import com.github.curriculeon.casino.utils.DecisionInterface;

/**
 * Created by leon on 2/25/18.
 * this class is used in conjunction with Enums to ensure Game has finite interactions with player
 */
public interface GameDecisionInterface<
        GameType extends GameInterface,
        PlayerType extends Player> extends DecisionInterface {
    void perform(GameType game, PlayerType player);
}
