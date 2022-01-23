/*
 * The ILoveYouBoss App
 */
package com.iloveyouboss;

/**
 * Answer object references the corresponding Question and contains an appropriate
 * value for the answer
 * @author emaph
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

    public String getQuestionText() {
        return question.getText();
    }

    boolean match(Object answer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return String.format("%s %s", question.getText(), question.getAnswerChoice(i));
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
}
