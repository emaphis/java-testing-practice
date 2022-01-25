/*
 * Unit testing
 */
package com.scratch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

import org.junit.Test;

/**
 *
 * @author emaph
 */
public class AssertTest {
    private Account account;

    @Before
    public void createAccount() {
        account = new Account("an account name");
    }

    @Test
    public void hasPositiveBalance() {
        account.deposit(50);
        assertTrue(account.hasPositiveBallance());
    }

    @Test
    public void depositIncIncreasesBalance() {
        int initialBalance = account.getBalance();
        account.deposit(100);
        assertTrue(account.getBalance() > initialBalance);
        assertThat(account.getBalance(), equalTo(100));
    }
}


