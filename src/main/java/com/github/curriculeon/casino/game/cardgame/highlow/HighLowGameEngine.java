package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.utils.AbstractGameEngine;
import com.github.curriculeon.utils.InputOutputConsole;

/**
 * Created by leon on 6/24/2020.
 */
public class HighLowGameEngine extends AbstractGameEngine<HighLowPlayer, HighLowGame> {
    private HighLowPlayer highestScoringPlayer;
    private InputOutputConsole console;

    public HighLowGameEngine() {
        this(new HighLowGame());
        this.highestScoringPlayer = getGame().getPlayers()[0];
        this.console = new InputOutputConsole();
    }

    public HighLowGameEngine(HighLowGame game) {
        super(game);
    }
    @Override
    public void run() {
        super.run();
        console.println(
                "The winner is [ %s ], with a card value of [ %s ]",
                highestScoringPlayer.getName(), highestScoringPlayer.getCard().getValue());
    }

    @Override
    public void evaluateTurn(HighLowPlayer currentPlayer) {
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
}
