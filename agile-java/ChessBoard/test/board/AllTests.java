package board;

import piece.*;

import junit.framework.TestSuite;


/**
 *
 * @author emaph
 */
public class AllTests extends TestSuite {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PieceTest.class);
        suite.addTestSuite(BoardTest.class);
       // suite.addTestSuite(StringUtil.class);
        return suite;
    }

}
