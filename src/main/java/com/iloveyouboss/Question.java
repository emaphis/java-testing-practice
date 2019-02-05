/*
 * I Love You Boss App;
 */
package com.iloveyouboss;

/**
 *
 * @author emaphis
 */
public abstract class Question {
    private final String text;
    private final String[] answerChoices;
    private final int id;

    public Question(int id, String text, String[] answerChoices) {
        this.id = id;
        this.text = text;
        this.answerChoices = answerChoices;
    }

    String getText() {
        return text;
    }

    public String getAnswerChoice(int i) {
        return answerChoices[i];
    }

    public boolean match(Answer answer) {
        return false;
    }

    abstract public boolean match(int expected, int actual);

    int indexOf(String matchingAnswerChoice) {
        for (int i = 0; i < answerChoices.length; i++) {
            if (answerChoices[i].equals(matchingAnswerChoice))
                return i;
        }
        return -1;
    }
}
