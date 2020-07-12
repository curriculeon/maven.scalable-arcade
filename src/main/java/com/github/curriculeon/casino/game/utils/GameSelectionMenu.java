package com.github.curriculeon.casino.game.utils;

import com.github.curriculeon.casino.utils.AbstractDecisionMenu;

/**
 * Created by leon on 2/25/18.
 * @ATTENTION_TO_STUDENTS - You are advised against modifying this class
 */
public class GameSelectionMenu extends AbstractDecisionMenu<GameSelection> {
    public GameSelectionMenu() {
        super(GameSelection.values());
    }
}