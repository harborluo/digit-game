package com.harbor.game.rule;

import com.harbor.digit.game.GameRound;
import com.harbor.digit.game.rule.BuzzGameRule;
import com.harbor.digit.game.rule.DefaultGameRule;
import com.harbor.digit.game.rule.FizzGameRule;
import com.harbor.digit.game.rule.GameRule;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by HLuo on 3/24/2019.
 */
public class TestGameRule {

    private static final Logger logger = LoggerFactory.getLogger(TestGameRule.class);

    @Test
    public void testBuzzRule(){

        GameRule rule = new BuzzGameRule(null);
        GameRound round = new GameRound(1,"");
        rule.play(round);

        logger.debug("Transfer {} to '{}'", round.getDigit(), round.getResult());

        Assert.assertTrue(round.getResult().length()==0);

        round = new GameRound(5,"");
        rule.play(round);
        logger.debug("Transfer {} to '{}'", round.getDigit(), round.getResult());

        Assert.assertTrue("Buzz".equals(round.getResult()));

    }

    @Test
    public void testFizzRule(){

        GameRound round = new GameRound(1,"");
        GameRule rule = new FizzGameRule(null);
        String initResult="";
        rule.play(round);
        logger.debug("Transfer {} to '{}'", round.getDigit(), round.getResult());

        Assert.assertTrue(round.getResult().length()==0);

         round = new GameRound(3,"");
        rule.play(round);
        logger.debug("Transfer {} to '{}'", round.getDigit(), round.getResult());

        Assert.assertTrue("Fizz".equals(round.getResult()));

    }

    @Test
    public void testDefaultRule(){

        GameRound round = new GameRound(1,"");
        GameRule rule = new DefaultGameRule(null);
        String initResult="";
        rule.play(round);
        logger.debug("Transfer {} to '{}'", round.getDigit(), round.getResult());

        Assert.assertTrue("1".equals(round.getResult()));

    }


}
