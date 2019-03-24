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
public class GameApplication {

    private static final Logger logger = LoggerFactory.getLogger(GameApplication.class);

    public static void main(String[] args) {

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
