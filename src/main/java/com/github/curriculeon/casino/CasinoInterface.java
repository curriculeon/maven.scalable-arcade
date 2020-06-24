package com.github.curriculeon.casino;

import com.github.curriculeon.casino.profile.ProfileManagerInterface;

/**
 * Created by leon on 6/22/2020.
 */
public interface CasinoInterface extends Runnable {
    ProfileManagerInterface getProfileManager();
    void setProfileManager(ProfileManagerInterface profileManager);
    void run();
}
