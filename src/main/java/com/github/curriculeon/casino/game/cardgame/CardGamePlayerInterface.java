package com.github.curriculeon.casino.game.cardgame;

import com.github.curriculeon.casino.game.PlayerInterface;
import com.github.curriculeon.casino.game.cardgame.utils.card.Card;

import java.util.List;

public interface CardGamePlayerInterface extends PlayerInterface {
    default void addCard(Card card) {
        getHand().add(card);
    }

    default void removeCard(Card card) {
        getHand().remove(card);
    }

    List<Card> getHand();

    void setHand(List<Card> cardList);
}
