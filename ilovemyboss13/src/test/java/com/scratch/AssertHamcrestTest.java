
package com.scratch;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.*;
import org.junit.*;


/**
 *
 * @author emaph
 */
public class AssertHamcrestTest {

    @Test
    @ExpectedToFail
    @Ignore
    public void assertDoublEqual() {
        assertThat(2.32 * 3, equalTo(6.96));
    }

    @Test
    public void assertWithTolerance() {
        assertTrue(Math.abs((2.32 * 3) - 6.96) < 0.0005);
    }

    @Test
    public void assertDoublesCloseTo() {
       assertThat(2.32 * 3, closeTo(6.96, 0.0005));
    }
}

