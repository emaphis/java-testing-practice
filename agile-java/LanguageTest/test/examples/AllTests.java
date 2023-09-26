package examples;

import examples.collections.TestCollections;
import examples.strings.*;
import junit.framework.TestSuite;

/**
 *
 * @author emaph
 */

public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StringsTest.class);
        suite.addTestSuite(CharsTest.class);
        suite.addTestSuite(TestCollections.class);
        return suite;
    }

}
