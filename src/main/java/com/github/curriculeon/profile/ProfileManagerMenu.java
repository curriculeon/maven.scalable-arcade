package com.github.curriculeon.profile;

import com.github.curriculeon.AbstractDecisionMenu;

/**
 * Created by leon on 2/25/18.
 */
public class ProfileManagerMenu extends AbstractDecisionMenu<ProfileManagerSelection> {
    public ProfileManagerMenu() {
        super(ProfileManagerSelection.values());
    }

}
