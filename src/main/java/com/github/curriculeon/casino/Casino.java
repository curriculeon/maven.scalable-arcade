package com.github.curriculeon.casino;

import com.github.curriculeon.casino.profile.ProfileManager;
import com.github.curriculeon.casino.profile.ProfileManagerInterface;
import com.github.curriculeon.casino.utils.AbstractDecisionMenu;

/**
 * Created by leon on 6/25/2020.
 * @ATTENTION_TO_STUDENTS - You are advised against modifying this class
 */
public final class Casino extends AbstractDecisionMenu<CasinoDecision> implements CasinoInterface {
    private ProfileManagerInterface profileManager = ProfileManager.INSTANCE;

    public Casino() {
        super(CasinoDecision.values());
    }

    @Override
    public final ProfileManagerInterface getProfileManager() {
        return profileManager;
    }

    @Override
    public void setProfileManager(ProfileManagerInterface profileManager) {
        this.profileManager = profileManager;
    }

    @Override
    public void run() {
        while (true) {
            getInput().perform(this);
        }
    }
}