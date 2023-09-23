
package org.letstest.junit5.disabled;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.letstest.junit5.lifecycle.SUT;

/**
 *
 * @author emaph
 */
public class DisabledMethodTest {
     private final SUT systemUnderTest = new SUT("Our system under test");

    @Test
    @Disabled("Feature still under construction")
    public void testRegularWork() {
        boolean canRecieveRegularWrok = systemUnderTest.canReceiveRegularWork();
        assertTrue(canRecieveRegularWrok);
    }

    @Test
    @Disabled("Feature still under construction")
    public void testAdditionalWork() {
        boolean canReceiveAdditionalWork =
            systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }

}
