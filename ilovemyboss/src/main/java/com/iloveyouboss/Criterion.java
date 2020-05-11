/*
 * I Love You Boss App.
 */
package com.iloveyouboss;

/**
 *
 * @author emaphis
 */
public class Criterion implements Scoreable {
    private final Weight weight;
    private final Answer answer;
    private int score;

    public Criterion(Answer answer, Weight weight) {
        this.answer = answer;
        this.weight = weight;
    }

    public Answer getAnswer() { return answer; }
    public Weight getWeight() { return weight; }

    public void setScore(int score) { this.score = score; }

    @Override
    public int getScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
