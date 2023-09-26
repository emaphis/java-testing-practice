
package examples.strings;

import junit.framework.TestCase;

/**
 * String tests
 * @author emaph
 */
public class StringsTest extends TestCase {

    public StringsTest(String testName) {
        super(testName);
    }

    public void testString() {
        assertEquals("hello", "hello");
        String a = "abc";    // do this
        //String b = new String("abc");  // DONT do this
        String z = "\t\n";
    }

    public void testStringConcat() {
        //assertEquals(true, false);
        assertEquals("abcd", "ab".concat("cd"));
        assertEquals("abcdef", "abc" + "def");
        assertEquals("123456", "12" + "3" + "456");
    }

    public void testStringBuilder() {

    }
}
