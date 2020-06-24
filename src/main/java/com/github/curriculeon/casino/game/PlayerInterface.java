package com.github.curriculeon.casino.game;

import com.github.curriculeon.casino.profile.ProfileInterface;

/**
 * Created by leon on 2/25/18.
 */
public interface PlayerInterface {
    ProfileInterface getProfile();

    default String getName() {
        return getProfile().getName();
    }
}