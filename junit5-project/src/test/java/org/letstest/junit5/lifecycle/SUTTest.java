
package org.letstest.junit5.lifecycle;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 *
 * @author emaph
 */
public class SUTTest {
    private static ResourceForAllTests resourceForAllTests;
    private SUT systemUnderTest;

    @BeforeAll
    public static void setUpClass() {
        resourceForAllTests =
            new ResourceForAllTests("Our resource for all tests");
    }

    @AfterAll
    public static void tearDownClass() {
        resourceForAllTests.close();
    }

    @BeforeEach
    public void setUp() {
        systemUnderTest = new SUT("Our system under test");
    }

    @AfterEach
    public void tearDown() {
        systemUnderTest.close();
    }

    @Test
    public void testRegularWork() {
        boolean canreceiveRegularWork =
            systemUnderTest.canReceiveRegularWork();
        assertTrue(canreceiveRegularWork);
    }

    @Test
    public void testAdditionalWork() {
        boolean canReceiveAdditionalWork =
            systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
}

/*
  Prints out:
    Our resource for all tests from class ResourceForAllTests is initializing.
    Our system under test from class SUT is initializing.
    Our system under test from class SUT can receive regular work.
    Our system under test from class SUT is closing.

    Our system under test from class SUT is initializing.
    Our system under test from class SUT cannot receive additional work.
    Our system under test from class SUT is closing.
    Our resource for all tests from class ResourceForAllTests is closing.
*/