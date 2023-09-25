
package util;

import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class StringUtilTest extends TestCase {

    public StringUtilTest(String testName) {
        super(testName);
    }

    public void testAppendNewLine() {
        String given = "aaaa";
        String expected = "aaaa\n";
        String produced = StringUtil.appendNewLine(given);
        assertEquals(expected, produced);
    }

}
