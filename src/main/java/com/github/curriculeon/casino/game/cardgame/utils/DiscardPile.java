package com.github.curriculeon.casino.game.cardgame.utils;

import com.github.curriculeon.casino.game.cardgame.CardGamePlayerInterface;
import com.github.curriculeon.casino.game.cardgame.utils.card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by leon on 6/26/2020.
 */
public class DiscardPile {
    private List<Pair<CardGamePlayerInterface, Card>> cardMap;

    public DiscardPile() {
        this.cardMap = new ArrayList<>();
    }

    public void add(CardGamePlayerInterface player, Card card) {
        cardMap.add(new Pair<>(player, card));
        player.getHand().remove(card);
    }

    public List<Card> getAllCards() {
        return cardMap
                .stream()
                .map(Pair::getValue)
                .collect(Collectors.toList());
    }

    public List<Card> getAllCardsDiscardedByPlayer(CardGamePlayerInterface player) {
        return cardMap
                .stream()
                .filter(pair -> pair.getKey().equals(player))
                .map(Pair::getValue)
                .collect(Collectors.toList());
    }
}
