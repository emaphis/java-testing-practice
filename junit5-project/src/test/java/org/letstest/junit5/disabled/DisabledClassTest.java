
package org.letstest.junit5.disabled;

import org.letstest.junit5.lifecycle.SUT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 * Use the @Disabled feature
 * @author emaph
 */
@Disabled("Feature is still under construction.")
public class DisabledClassTest {

    private final SUT systemUnderTest = new SUT("Our system under test");

    @Test
    public void testRegularWork() {
        boolean canRecieveRegularWrok = systemUnderTest.canReceiveRegularWork();
        assertTrue(canRecieveRegularWrok);
    }

    @Test
    public void testAdditionalWork() {
        boolean canReceiveAdditionalWork =
            systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
}
