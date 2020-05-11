/*
 *  I Love You Boss App.
 */
package com.iloveyouboss;

/**
 *
 * @author emaphis
 */
public class Answer {
    private final int i;
    private final Question question;

    public Answer(Question question, int i) {
        this.question = question;
        this.i = i;
    }

    public Answer(Question characteristic, String matchingValue) {
        this.question = characteristic;
        this.i = characteristic.indexOf(matchingValue);
    }

    String getQuestionText() {
        return question.getText();
    }

    public boolean match(int expected) {
        return question.match(expected, i);
    }

    public boolean match(Answer otherAnswer) {
        return question.match(i, otherAnswer.i);
    }

    public Question getCharacteristic() {
        return question;
    }

    @Override
    public String toString() {
        return String.format("%s %s", question.getText(), question.getAnswerChoice(i));
    }
}
