package com.harbor.digit.game;

/**
 * Created by HLuo on 3/24/2019.
 */
public class GameRound {

    private int digit;

    private String result = "";

    public int getDigit() {
        return digit;
    }

    public String getResult() {
        return result;
    }

    public GameRound(int digit, String result) {
        this.digit = digit;
        this.result = result;
    }

    public void addResult(String result) {
        this.result += result;
    }
}
