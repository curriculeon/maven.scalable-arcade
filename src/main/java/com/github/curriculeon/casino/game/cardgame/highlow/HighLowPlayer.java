package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.cardgame.AbstractCardGamePlayer;
import com.github.curriculeon.casino.game.cardgame.utils.card.Card;
import com.github.curriculeon.casino.game.cardgame.utils.card.CardInterface;
import com.github.curriculeon.casino.profile.ProfileInterface;

/**
 * Created by leon on 6/24/2020.
 */
public class HighLowPlayer extends AbstractCardGamePlayer {
    enum DecisionState {
        HIGH,LOW,BLUFF;
    }
    private DecisionState decision;
    private int numberOfPoints;

    public HighLowPlayer(ProfileInterface profile) {
        super(profile);
    }

    @Override
    public void removeCard(CardInterface card) {
        super.removeCard(card);
        increasePoints(1);
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void increasePoints(int numberOfPointsToIncreaseBy) {
        this.numberOfPoints = getNumberOfPoints()+numberOfPointsToIncreaseBy;
    }

    public void setDecision(DecisionState decision) {
        this.decision = decision;
    }

    public DecisionState getDecision() {
        return decision;
    }

    public CardInterface getCard() {
        return getHand().get(0);
    }
}
