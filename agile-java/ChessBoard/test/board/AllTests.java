/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board;

import piece.*;

import junit.framework.TestSuite;
import util.StringUtil;

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
