package com.harbor.digit.game.rule;

/**
 * Created by HLuo on 3/24/2019.
 */
public class DefaultGameRule extends AbstractGameRule {

    public boolean isMatch(int n) {
        return true;
    }

    public String tranfer(int n, String transferResult) {

        if (transferResult == null || transferResult.length()==0) {
            return n+"";

        }

        return transferResult;
    }

    public int getPriority() {
        return -1;
    }

}
