/*
 * Unit testing
 */
package com.scratch;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import java.io.*;
import java.util.*;
import org.hamcrest.CoreMatchers;
import static com.scratch.PointMatcher.isNear;

import org.junit.*;


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

    @Test
    public void depositIncreasesBalance_hamcrestAssertTrue() {
        account.deposit(50);
        assertThat(account.getBalance() > 0, is(true));
    }

    @Test
    @ExpectedToFail
    @Ignore
    public void assertFailure() {
       assertTrue(account.getName().startsWith("xyz"));
    }


    // This one is better
    @Test
    @ExpectedToFail
    @Ignore
    public void matchesFailure() {
       assertThat(account.getName(), startsWith("xyz"));
    }


    @Ignore
    @ExpectedToFail
    @Test
    public void comparesArraysFailing() {
       assertThat(new String[] {"a", "b", "c"}, equalTo(new String[] {"a", "b"}));
    }


    @Ignore
    @ExpectedToFail
    @Test
    public void comparesCollectionsFailing() {
       assertThat(Arrays.asList(new String[] {"a"}),
             equalTo(Arrays.asList(new String[] {"a", "ab"})));
    }

    @Test
    public void comparesArraysPassing() {
       assertThat(new String[] {"a", "b"}, equalTo(new String[] {"a", "b"}));
    }

    @Test
    public void comparesCollectionsPassing() {
       assertThat(Arrays.asList(new String[] {"a"}),
             equalTo(Arrays.asList(new String[] {"a"})));
    }

    @Test
    public void variousMatcherTests() {
        Account account2 = new Account("my big fat acct");

        assertThat(account2.getName(), is(equalTo("my big fat acct")));
        assertThat(account2.getName(), not(equalTo("plunderings")));

        assertThat(account2.getName(), is(not(nullValue())));
        assertThat(account2.getName(), is(notNullValue()));
        
        assertThat(account2.getName(), is(notNullValue())); // not helpful
        assertThat(account2.getName(), equalTo("my big fat acct"));

        assertThat(account2.getName(), allOf(startsWith("my"), endsWith("acct")));
        assertThat(account2.getName(), anyOf(startsWith("my"), endsWith("loot")));

        assertThat(account2.getName(), isA(String.class));
    }

    @Test
    public void sameInstance() {
        Account a = new Account("a");
        Account aPrime = new Account("a");
        // TODO why needs to be fully qualified??
        assertThat(a, not(org.hamcrest.CoreMatchers.sameInstance(aPrime)));
        assertThat(a, not(CoreMatchers.sameInstance(aPrime)));
        
    }

    @Test
    public void moreMatchersTests() {
        Account account2 = new Account(null);
        assertThat(account2.getName(), is(nullValue()));
    }

    @Test
    public void items() {
        List<String> names =  new ArrayList<>();
        names.add("Moe");
        names.add("Laryy");
        names.add("Curly");

        assertThat(names, hasItem("Curly"));

        assertThat(names, hasItems("Curly", "Moe"));

        assertThat(names, hasItem(endsWith("y")));

        assertThat(names, hasItems(endsWith("y"), startsWith("C"))); //warning!

        assertThat(names, not(everyItem(endsWith("y"))));
    }

    @Test
    public void location() {
        Point point = new Point(4, 5);

         // WTF why do JUnit matches not include closeTo
//      assertThat(point.x, closeTo(3.6, 0.2));
//      assertThat(point.y, closeTo(5.1, 0.2));

        assertThat(point, isNear(3.9, 5.1));
    }

    @Test
    public void classicAssertions() {
        Account account2 = new Account("acct name");
        assertEquals("acct name", account2.getName());
     }

    @Test(expected=Account.InsufficientFundsException.class)
    public void throwsWhenWithdrawingTooMuch() {
       account.withdraw(100);
    }

    @Test
    public void throwsWhenWithdrawingTooMuchTry() {
       try {
          account.withdraw(100);
          fail();
       }
       catch (Account.InsufficientFundsException expected) {
          assertThat(expected.getMessage(), equalTo("balance only 0"));
       }
    }
}
