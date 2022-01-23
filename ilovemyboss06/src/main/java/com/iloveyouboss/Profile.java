/*
 * The ILoveYouBoss App
 */
package com.iloveyouboss;

import java.util.*;


/**
 * A Profile captures answers to relevant questions one might ask about
 * a company or a job seeker
 * @author emaph
 */
public class Profile {
    private Map<String,Answer> answers = new HashMap<>();
    private int score;
    private String name;

    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Add Answer objects to a Profile
     * @param answer
     */
    public void add(Answer answer) {
        answers.put(answer.getQuestionText(), answer);
    }

    /**
     * The matches() method takes a Criteria object and iterates through each
     * Criterion in an effort to determine whether or not the criteria are a
     * match for the answers in the profile (line 30).
     * @param criteria
     * @return
     */
    public boolean matches(Criteria criteria) {
        score = 0;

        boolean kill = false;
        boolean anyMatches = false;

        for(Criterion criterion : criteria) {
            Answer answer = answers.get(criterion.getAnswer().getQuestionText());

            boolean match =
                    criterion.getWeight() == Weight.DontCare ||
                    answer.match(criterion.getAnswer());

            if (!match && criterion.getWeight() == Weight.MustMatch) {
                kill = true;
            }
            if (match) {
                score += criterion.getWeight().getValue();
            }
            anyMatches |= match;
        }
        if (kill)
            return false;
        return anyMatches;
    }

    public int score() {
        return score;
    }
}
