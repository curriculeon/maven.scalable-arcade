package com.github.curriculeon;

import com.github.curriculeon.profile.ProfileInterface;

/**
 * Created by leon on 2/25/18.
 */
public interface PlayerInterface {
    ProfileInterface getProfile();
    String getName();
}