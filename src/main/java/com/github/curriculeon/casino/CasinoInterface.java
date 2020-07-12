package com.github.curriculeon.casino;

import com.github.curriculeon.casino.profile.ProfileManagerInterface;

/**
 * Created by leon on 6/22/2020.
 * @ATTENTION_TO_STUDENTS - You are advised against modifying this class
 */
public interface CasinoInterface extends Runnable {
    ProfileManagerInterface getProfileManager();
    void setProfileManager(ProfileManagerInterface profileManager);
    void run();
}
