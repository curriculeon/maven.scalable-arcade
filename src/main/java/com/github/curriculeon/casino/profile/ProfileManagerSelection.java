package com.github.curriculeon.casino.profile;

import com.github.curriculeon.casino.CasinoInterface;
import com.github.curriculeon.casino.utils.DecisionInterface;
import com.github.curriculeon.utils.InputOutputConsole;

import java.util.function.Consumer;

/**
 * Created by leon on 2/25/18.
 */
public enum ProfileManagerSelection implements DecisionInterface {
    SELECT((casino) -> {
        InputOutputConsole console = new InputOutputConsole();
        int numberOfProfiles = console.getIntegerInput("How many player profiles would you like to create?");
        casino.getProfileManager().createProfiles(numberOfProfiles);
    }),

    CREATE((casino) -> {
        casino.getProfileManager().createProfile();
    });

    private final Consumer<CasinoInterface> profileConsumer;

    ProfileManagerSelection(Consumer<CasinoInterface> casinoConsumer) {
        this.profileConsumer = casinoConsumer;
    }

    public void perform(CasinoInterface casino) {
        profileConsumer.accept(casino);
    }
}
