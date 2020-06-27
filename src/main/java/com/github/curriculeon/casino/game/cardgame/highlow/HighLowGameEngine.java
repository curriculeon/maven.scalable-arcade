package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.utils.AbstractGameEngine;
import com.github.curriculeon.utils.InputOutputSocketInterface;

/**
 * Created by leon on 6/24/2020.
 */
public class HighLowGameEngine extends AbstractGameEngine<HighLowPlayer, HighLowGame> implements InputOutputSocketInterface {
    private HighLowPlayer highestScoringPlayer;

    public HighLowGameEngine() {
        this(new HighLowGame());
    }

    public HighLowGameEngine(HighLowGame game) {
        super(game);
    }

    @Override
    public void run() {
        super.run();
        getConsole().println(
                "The winner is [ %s ], with a card value of [ %s ]",
                highestScoringPlayer.getName(), highestScoringPlayer.getCard().getValue());
    }

    @Override
    public void evaluateTurn(HighLowPlayer currentPlayer) {
        if(highestScoringPlayer != null) {
            Integer highestScoringPlayerCardValue = highestScoringPlayer
                    .getCard()
                    .getValue();

            Integer currentPlayerCardValue = currentPlayer
                    .getCard()
                    .getValue();

            if (highestScoringPlayerCardValue < currentPlayerCardValue) {
                highestScoringPlayer = currentPlayer;
            }
        }
        this.highestScoringPlayer = currentPlayer;
    }
}
