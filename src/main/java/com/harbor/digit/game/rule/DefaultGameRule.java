package com.harbor.digit.game.rule;

import com.harbor.digit.game.GameRound;

/**
 * Created by HLuo on 3/24/2019.
 */
public class DefaultGameRule extends AbstractGameRule {

    public DefaultGameRule(GameRule successor) {
        super(successor);
    }

    public void play(GameRound round) {
        if (round.getResult()==null||round.getResult().length()==0){
            round.addResult(round.getDigit()+"");
        }
        super.next(round);
    }
}
