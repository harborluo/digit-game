package com.harbor.digit.game;


import com.harbor.digit.game.rule.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by HLuo on 3/24/2019.
 */
public class GameApplication implements GameManager {

    private static final Logger logger = LoggerFactory.getLogger(GameApplication.class);

    private List<AbstractGameRule> ruleList = new ArrayList();

    private int currentDigit ;

    private String result = "";

    public static void main(String[] args) {

        GameApplication application = new GameApplication();
        application.addRule(new BuzzGameRule());
        application.addRule(new FizzGameRule());
        application.addRule(new DefaultGameRule());

        for (int i = 1; i < 50; i++) {
            String result = application.startRound(i);

            logger.info("Transfer digit {} to {}", i, result);

        }

    }

    public void addRule(AbstractGameRule rule) {
        ruleList.add(rule);
        Collections.sort(ruleList);
        logger.info("New rule with class name '{}' added, count of rules is {}.", rule.getClass().getCanonicalName(), ruleList.size());
    }

    public void deleteRule(AbstractGameRule rule) {
        ruleList.remove(rule);
        Collections.sort(ruleList);
    }

    public void play() {
        for(GameRule rule : ruleList){
           if (rule.isMatch(currentDigit)){
               result = rule.tranfer(currentDigit, result);
           }
        }
    }

    public String startRound(int digit) {

        this.currentDigit = digit;
        this.result = "";

        play();

        return this.result;

    }
}
