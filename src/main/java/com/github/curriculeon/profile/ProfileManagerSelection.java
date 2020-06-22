package com.github.curriculeon.profile;

import com.github.curriculeon.CasinoInterface;
import com.github.curriculeon.DecisionInterface;
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
