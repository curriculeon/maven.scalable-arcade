package com.github.curriculeon.casino.profile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon.hunter on 2/1/2017.
 */
public class ProfileManager implements ProfileManagerInterface {
    public List<ProfileInterface> profiles;

    public ProfileManager(List<ProfileInterface> profiles) {
        this.profiles = profiles;
    }

    public ProfileManager() {
        this(new ArrayList<>());
    }

    @Override
    public List<ProfileInterface> getProfiles() {
        return profiles;
    }

    @Override
    public void setProfiles(List<ProfileInterface> profileList) {
        this.profiles = profileList;
    }
}
