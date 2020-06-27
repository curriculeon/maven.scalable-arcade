package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.cardgame.utils.card.Card;
import com.github.curriculeon.casino.game.utils.GameDecisionInterface;
import com.github.curriculeon.utils.InputOutputConsole;

import java.util.function.BiConsumer;

/**
 * Created by leon on 6/24/2020.
 */
public enum HighLowGameDecision implements GameDecisionInterface<HighLowGame, HighLowPlayer> {
    DECIDE_HIGH((game, player) -> {
        String infoMessage = "[ %s ] has claimed their hand-value is `HIGHER` than the current face-up value of [ %s ]";
        Card currentFaceUpCard = game.getCurrentFaceUpValue();
        game
                .getConsole()
                .println(infoMessage, player.getName(), currentFaceUpCard);
        game
                .getDiscardPile()
                .add(player, player.getCard());
    }),


    DECIDE_LOW((game, player) -> {

    }),

    DECIDE_BLUFF((game, player) -> {
        String infoMessage = "[ %s ] believes the previous player's hand was not [ %s ]";
        Card previousCard = game
                .getDiscardPile()
                .getTopCard();

        HighLowPlayer previousPlayer = game
                .getDiscardPile()
                .getOwnerOfTopCard();

        game
                .getConsole()
                .println(infoMessage, player.getName(), previousCard);
        game
                .getDiscardPile()
                .add(player, player.getCard());
    }),

    VIEW_DISCARD_PILE((game, player)-> {

    }),

    VIEW_HAND((game, player)-> {
        game
                .getConsole()
                .println(player.getHand().toString());
    });

    private final BiConsumer<HighLowGame, HighLowPlayer> operation;

    HighLowGameDecision(BiConsumer<HighLowGame, HighLowPlayer> operation) {
        this.operation = operation;
    }

    @Override
    public BiConsumer<HighLowGame, HighLowPlayer> getProcedure() {
        return operation;
    }
}
