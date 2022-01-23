/*
 * The ILoveYouBoss App
 */
package com.iloveyouboss;

/**
 * A Criterion (first referenced on line 27) represents what an employer
 * seeks in an employee, or vice versa. It encapsulates an Answer object and a
 * Weight object, which represents how important the right answer to a question is.
 * @author emaph
 */
public class Criterion implements Scoreable {
    private final Weight weight;
    private final Answer answer;
    private int score;

    public Criterion(Answer answer, Weight weight) {
        this.weight = weight;
        this.answer = answer;
    }

    public Answer getAnswer() { return answer; }
    public Weight getWeight() { return  weight; }

    public void setScore(int score) { this.score = score; }

    @Override
    public int getScore() { return score; }
}
