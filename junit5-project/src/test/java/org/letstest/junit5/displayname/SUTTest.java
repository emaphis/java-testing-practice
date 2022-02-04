
package org.letstest.junit5.displayname;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author emaph
 */
@DisplayName("Test class showing the @DisplayName annotation.")
public class SUTTest {
    private final SUT systemUnderTest = new SUT();

    @Test
    @DisplayName("Out system test says hello.")
    public void testHello() {
        assertEquals("Hello",systemUnderTest.hello());
    }


    @Test
    @DisplayName("😱")
    void testTalking() {
        assertEquals("How are you?", systemUnderTest.talk());
    }

    @Test
    void testBye() {
        assertEquals("Bye", systemUnderTest.bye());
    }
}
