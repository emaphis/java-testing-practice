
package sis.report;

import junit.framework.TestSuite;

/**
 *
 * @author emaph
 */
public class AllTests extends TestSuite {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(RosterReporterTest.class);
        return suite;
    }
}