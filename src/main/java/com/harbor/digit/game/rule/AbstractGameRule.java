package com.harbor.digit.game.rule;

/**
 * Created by HLuo on 3/24/2019.
 */
public abstract class AbstractGameRule implements GameRule, Comparable<GameRule>  {

    public int compareTo(GameRule o) {
        return o.getPriority() - this.getPriority();
    }

}
