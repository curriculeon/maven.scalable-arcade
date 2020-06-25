package com.github.curriculeon.casino.game.cardgame;

import com.github.curriculeon.casino.game.cardgame.utils.card.Card;
import com.github.curriculeon.casino.profile.ProfileInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 6/25/2020.
 */
public class AbstractCardGamePlayer implements CardGamePlayerInterface {
    private ProfileInterface profile;
    private List<Card> hand;

    public AbstractCardGamePlayer(ProfileInterface profile) {
        this.profile = profile;
        this.hand = new ArrayList<>();
    }

    @Override
    public ProfileInterface getProfile() {
        return this.profile;
    }

    @Override
    public List<Card> getHand() {
        return this.hand;
    }

    @Override
    public void setHand(List<Card> cardList) {
        if(cardList.size()>1) {
            throw new IllegalArgumentException("A HighLowPlayer's hand cannot exceed a size of `1`");
        }
        this.hand = cardList;
    }
}
