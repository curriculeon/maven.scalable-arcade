package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.cardgame.CardGamePlayerInterface;
import com.github.curriculeon.casino.game.cardgame.utils.card.Card;
import com.github.curriculeon.casino.profile.ProfileInterface;

import java.util.List;

/**
 * Created by leon on 6/24/2020.
 */
public class HighLowPlayer implements CardGamePlayerInterface {
    @Override
    public ProfileInterface getProfile() {
        return null;
    }

    @Override
    public List<Card> getHand() {
        return null;
    }

    @Override
    public void setHand(List<Card> cardList) {
        if(cardList.size()>1) {
            throw new IllegalArgumentException("A HighLowPlayer's hand cannot exceed a size of `1`");
        }
    }

    public Card getCard() {
        return getHand().get(0);
    }
}
