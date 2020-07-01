package com.github.curriculeon.casino.game.cardgame.utils;

import com.github.curriculeon.casino.game.cardgame.CardGamePlayerInterface;
import com.github.curriculeon.casino.game.utils.GameInterface;

public interface CardGameInterface<
        CardGamePlayerType extends CardGamePlayerInterface>
        extends GameInterface<CardGamePlayerType> {
    DiscardPile getDiscardPile();

    Deck getDeck();
}
