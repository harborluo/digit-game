package com.harbor.digit.game.rule;

import com.harbor.digit.game.GameRound;

/**
 * Created by HLuo on 3/24/2019.
 */
public class FizzGameRule extends AbstractGameRule {

//    public boolean isMatch(int n) {
//        return n % 3 == 0;
//    }
//
//    public String tranfer(int n, String transferResult) {
//        return transferResult+ "Fizz";
//    }
//
//    public int getPriority() {
//        return 0;
//    }


    public FizzGameRule(GameRule successor) {
        super(successor);
    }

    public void play(GameRound round) {
        if (round.getDigit() % 3 ==0) {
            round.addResult("Fizz");
        }
        super.next(round);
    }
}
