package com.github.curriculeon.casino.game.cardgame.utils;

import com.github.curriculeon.casino.game.cardgame.CardGamePlayerInterface;
import com.github.curriculeon.casino.game.cardgame.utils.card.Card;
import com.github.curriculeon.utils.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by leon on 6/26/2020.
 */
public class DiscardPile<CardGamePlayerType extends CardGamePlayerInterface> {
    private Stack<Pair<CardGamePlayerType, Card>> cardMap;

    public DiscardPile() {
        this.cardMap = new Stack<>();
    }

    public void add(CardGamePlayerType player, Card card) {
        cardMap.push(new Pair<>(player, card));
        player.getHand().remove(card);
    }

    public List<Card> getAllCards() {
        return cardMap
                .stream()
                .map(Pair::getValue)
                .collect(Collectors.toList());
    }

    public List<Card> getAllCardsDiscardedByPlayer(CardGamePlayerType player) {
        return cardMap
                .stream()
                .filter(pair -> pair.getKey().equals(player))
                .map(Pair::getValue)
                .collect(Collectors.toList());
    }

    public Card getTopCard() {
        return cardMap.pop().getValue();
    }

    public CardGamePlayerType getOwnerOfTopCard() {
        return cardMap.pop().getKey();
    }
}
