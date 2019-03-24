package com.harbor.digit.game.rule;

import com.harbor.digit.game.GameRound;

import java.util.Comparator;

/**
 * Created by HLuo on 3/24/2019.
 */
public class BuzzGameRule extends AbstractGameRule {

    public BuzzGameRule(GameRule successor) {
        super(successor);
    }

    public void play(GameRound round) {

        if (round.getDigit() % 5 == 0 ) {
            round.addResult("Buzz");
        }

        super.next(round);

    }

}
