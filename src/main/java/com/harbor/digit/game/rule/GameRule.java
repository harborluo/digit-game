package com.harbor.digit.game.rule;

/**
 * Created by HLuo on 3/24/2019.
 */
public interface GameRule {

    public boolean isMatch(int n);

    public String tranfer(int n, String transferedResult);

    public int getPriority();

}
