package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.utils.AbstractDecisionMenu;

/**
 * Created by leon on 6/27/2020.
 */
public class HighLowGameDecisionMenu extends AbstractDecisionMenu<HighLowGameDecision> {
    public HighLowGameDecisionMenu() {
        super(HighLowGameDecision.values());
    }
}
