package com.harbor.game.rule;

import com.harbor.digit.game.rule.BuzzGameRule;
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

        GameRule rule = new BuzzGameRule();
        String initResult="";
        int digit = 1;
        String result = testRule(digit, initResult, rule);
        logger.debug("Transfer {} to '{}'", digit, result);

        Assert.assertTrue(result.length()==0);

        digit = 5;
        initResult="";
        result = testRule(digit, initResult, rule);
        logger.debug("Transfer {} to '{}'", digit, result);

        Assert.assertTrue("Buzz".equals(result));

    }

    @Test
    public void testFizzRule(){

        GameRule rule = new FizzGameRule();
        String initResult="";
        int digit = 1;
        String result = testRule(digit, initResult, rule);
        logger.debug("Transfer {} to '{}'", digit, result);

        Assert.assertTrue(result.length()==0);

        digit = 3;
        initResult="";
        result = testRule(digit, initResult, rule);
        logger.debug("Transfer {} to '{}'", digit, result);

        Assert.assertTrue("Fizz".equals(result));

    }

    private String testRule(int digit, String result,GameRule rule){

        if (rule.isMatch(digit)){
            return rule.tranfer(digit, result);
        }

        return result;

    }
}
