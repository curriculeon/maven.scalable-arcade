package com.github.curriculeon.casino.game.cardgame.highlow;

import com.github.curriculeon.casino.game.cardgame.utils.Deck;
import com.github.curriculeon.casino.game.utils.AbstractGame;
import com.github.curriculeon.casino.profile.ProfileInterface;
import com.github.curriculeon.casino.profile.ProfileManager;

/**
 * Created by leon on 6/24/2020.
 */
public class HighLowGame extends AbstractGame<HighLowPlayer> {
    @Override
    public void createPlayers() {
        int numberOfPlayers = 2;
        for (int i = 0; i < numberOfPlayers; i++) {
            Long playerId = getConsole().getLongInput("Enter id of player %s", i);
            ProfileInterface profile = ProfileManager.INSTANCE.getProfileById(playerId);
            HighLowPlayer highLowPlayer = new HighLowPlayer(profile);
            addPlayer(highLowPlayer);
        }
    }

    @Override
    public void run() {
        Deck deck = new Deck();
        deck.shuffle();
        getPlayers().forEach(player -> player.addCard(deck.pop()));
    }
}
