package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.cardgame.AbstractCardGamePlayer;
import com.github.curriculeon.casino.game.cardgame.utils.card.Card;
import com.github.curriculeon.casino.profile.ProfileInterface;

/**
 * Created by leon on 6/24/2020.
 */
public class HighLowPlayer extends AbstractCardGamePlayer {
    private ProfileInterface profile;

    public HighLowPlayer(ProfileInterface profile) {
        super(profile);
    }

    public Card getCard() {
        return getHand().get(0);
    }
}
