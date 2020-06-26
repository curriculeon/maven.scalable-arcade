package com.github.curriculeon.casino.game.cardgame.utils;

import com.github.curriculeon.casino.game.cardgame.CardGamePlayerInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 6/26/2020.
 */
abstract public class AbstractCardGame<
        CardGamePlayerType extends CardGamePlayerInterface>
        implements CardGameInterface<CardGamePlayerType> {

    private DiscardPile discardPile;
    private List<CardGamePlayerType> players;


    public AbstractCardGame(DiscardPile discardPile, List<CardGamePlayerType> players) {
        this.discardPile = discardPile;
        this.players = players;
    }

    public AbstractCardGame() {
        this(new DiscardPile(), new ArrayList<>());
    }

    @Override
    public DiscardPile getDiscardPile() {
        return discardPile;
    }

    @Override
    public List<CardGamePlayerType> getPlayers() {
        return players;
    }
}
