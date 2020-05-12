package com.iloveyouboss;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ProfileTest {

    private Profile profile;
    private BooleanQuestion question;
    private Criteria criteria;

    @Before
    public void create() {
        profile = new Profile("Bull Hockey, Inc.");
        question = new BooleanQuestion(1, "Got bonuses?");
        criteria = new Criteria();
    }

    @Test
    public void matches() {
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion(1, "Got milk?");

        // answers false when must-match criteria not met
        profile.add(new Answer(question, Bool.FALSE));
        Criteria criteria = new Criteria();
        criteria.add(
                new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));

        assertFalse(profile.matches(criteria));

        // answers true for any don't care criteria
        profile.add(new Answer(question, Bool.FALSE));
        criteria = new Criteria();
        criteria.add(
                new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));

        assertTrue(profile.matches(criteria));
    }

    @Test
    public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
        profile.add(new Answer(question, Bool.FALSE));
        criteria.add(
                new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));

        boolean matches = profile.matches(criteria);

        assertFalse(matches);
    }

    @Test
    public void matchAnswersTrueForAnyDontCareCriteria() {
        profile.add(new Answer(question, Bool.FALSE));
        criteria.add(
                new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));

        boolean matches = profile.matches(criteria);

        assertTrue(matches);
    }


    @Test
    public void matchAnswersFalseForAnyDontCareCriteria() {
        profile.add(new Answer(question, Bool.FALSE));
        criteria.add(
                new Criterion(new Answer(question, Bool.FALSE), Weight.DontCare));

        boolean matches = profile.matches(criteria);

        assertTrue(matches);
    }

}
