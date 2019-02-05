/*
 * The I Love You Boss App
 */
package com.iloveyouboss;

/**
 *
 * @author emaphis
 */
public class PrecentileQuestion extends Question {

    public PrecentileQuestion(int id, String text, String[] answerChoices) {
        super(id, text, answerChoices);
    }

    @Override
    public boolean match(int expected, int actual) {
        return expected <= actual;
    }
}
