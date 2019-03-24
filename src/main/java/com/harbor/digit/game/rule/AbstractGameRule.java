package com.harbor.digit.game.rule;

import com.harbor.digit.game.GameRound;

/**
 * Created by HLuo on 3/24/2019.
 */
public abstract class AbstractGameRule implements GameRule  {

    private GameRule successor = null;

    public AbstractGameRule(GameRule successor) {
        this.successor = successor;
    }

    public void next(GameRound round) {

        if (this.successor != null) {
            this.successor.play(round);
        }

    }
}
