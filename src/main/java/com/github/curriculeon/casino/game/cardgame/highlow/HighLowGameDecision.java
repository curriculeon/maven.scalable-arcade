package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.utils.GameDecisionInterface;
import com.github.curriculeon.utils.InputOutputConsoleInterface;

import java.util.function.BiConsumer;

/**
 * Created by leon on 6/24/2020.
 */
public enum HighLowGameDecision implements GameDecisionInterface<HighLowGame, HighLowPlayer> {
    DECIDE_HIGH((game, player)-> {
        String infoMessage = "[ %s ] has claimed their hand-value is `HIGHER` than th current face-up value.";
        InputOutputConsoleInterface console = game.getConsole();
        console.println(infoMessage, player.getName());
    }),
    DECIDE_LOW((game, player)-> {

    }),
    DECIDE_BLUFF((game, player)-> {

    });

    private final BiConsumer<HighLowGame, HighLowPlayer> operation;

    HighLowGameDecision(BiConsumer<HighLowGame, HighLowPlayer> operation) {
        this.operation = operation;
    }

    public BiConsumer<HighLowGame, HighLowPlayer> getProcedure() {
        return operation;
    }
}
