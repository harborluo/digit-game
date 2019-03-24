package com.harbor.game;

import com.harbor.digit.game.GameApplication;
import com.harbor.digit.game.GameRound;
import com.harbor.digit.game.rule.BuzzGameRule;
import com.harbor.digit.game.rule.DefaultGameRule;
import com.harbor.digit.game.rule.FizzGameRule;
import com.harbor.digit.game.rule.GameRule;
import com.harbor.game.rule.TestGameRule;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by HLuo on 3/24/2019.
 */
public class TestGameApplication {

    private GameApplication application ;

    private static final Logger logger = LoggerFactory.getLogger(TestGameRule.class);

    @Test
    public void test(){

        GameRule defaultRule = new DefaultGameRule(null);
        GameRule buzzRule = new BuzzGameRule(defaultRule);

        GameRule fizzRule = new FizzGameRule(buzzRule);

        for (int i = 1; i < 50; i++) {
            GameRound round = new GameRound(i, "");
            fizzRule.play(round);

            logger.info("Transfer digit {} to {}", round.getDigit(), round.getResult());

        }

    }
}
