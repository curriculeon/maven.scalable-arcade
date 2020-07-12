package com.github.curriculeon.casino;

import com.github.curriculeon.casino.game.utils.GameSelection;
import com.github.curriculeon.casino.game.utils.GameSelectionMenu;
import com.github.curriculeon.casino.profile.ProfileManagerMenu;
import com.github.curriculeon.casino.profile.ProfileManagerSelection;
import com.github.curriculeon.casino.utils.DecisionInterface;

import java.util.function.Consumer;

/**
 * Created by leon on 6/25/2020.
 * @ATTENTION_TO_STUDENTS - You are advised against modifying this class
 */
public enum CasinoDecision implements DecisionInterface {
    MANAGE_PROFILE((casino) -> {
        ProfileManagerMenu profileManagerMenu = new ProfileManagerMenu();
        ProfileManagerSelection profileManagerSelection = profileManagerMenu.getInput();
        profileManagerSelection.perform(casino);
    }),

    SELECT_GAME((casino) -> {
        GameSelectionMenu gameSelectionMenu = new GameSelectionMenu();
        GameSelection gameSelection = gameSelectionMenu.getInput();
        gameSelection.perform();
    }),

    EXIT((casino) -> {
        casino.getProfileManager().printProfilesInformation();
    });


    private final Consumer<CasinoInterface> casinoConsumer;

    CasinoDecision(Consumer<CasinoInterface> casinoConsumer) {
        this.casinoConsumer = casinoConsumer;
    }

    public void perform(CasinoInterface casino) {
        casinoConsumer.accept(casino);
    }
}