package com.harbor.digit.game;

import com.harbor.digit.game.rule.AbstractGameRule;
import com.harbor.digit.game.rule.GameRule;

/**
 * Created by HLuo on 3/24/2019.
 */
public interface GameManager {

    void addRule(AbstractGameRule rule);

    void deleteRule(AbstractGameRule rule);

    void play();

    String startRound(int digit);

}
