package com.harbor.digit.game.rule;

import java.util.Comparator;

/**
 * Created by HLuo on 3/24/2019.
 */
public class BuzzGameRule extends AbstractGameRule {

    public boolean isMatch(int n) {
        return n % 5 == 0;
    }

    public String tranfer(int n, String transferResult) {
        return transferResult+ "Buzz";
    }

    public int getPriority() {
        return 1;
    }

}
