package com.harbor.digit.game.rule;

import com.harbor.digit.game.GameRound;

/**
 * Created by HLuo on 3/24/2019.
 */
public interface GameRule {

   public void play(GameRound round);

   void next(GameRound round);

}
