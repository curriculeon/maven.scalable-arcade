package com.github.curriculeon.casino.game;


import com.github.curriculeon.casino.profile.ProfileInterface;

/**
 * Created by leon on 5/11/17.
 */
public class Player implements PlayerInterface {
    private final ProfileInterface profile;

    public Player(ProfileInterface profile) {
        this.profile = profile;
    }

    public ProfileInterface getProfile() {
        return profile;
    }

    public String getName() {
        return profile.getName();
    }
}
