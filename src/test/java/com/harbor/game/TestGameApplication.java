package com.harbor.game;

import com.harbor.digit.game.GameApplication;
import com.harbor.digit.game.rule.BuzzGameRule;
import com.harbor.digit.game.rule.DefaultGameRule;
import com.harbor.digit.game.rule.FizzGameRule;
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

    @Before
    public void init(){
        application = new GameApplication();
        application.addRule(new BuzzGameRule());
        application.addRule(new FizzGameRule());
        application.addRule(new DefaultGameRule());
    }

    @Test
    public void test(){

        for (int i = 1; i < 50; i++) {
            String result = application.startRound(i);

            logger.info("Transfer digit {} to {}", i, result);

        }

    }
}
