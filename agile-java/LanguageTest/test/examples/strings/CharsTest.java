
package examples.strings;

import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class CharsTest extends TestCase {

    public CharsTest(String testName) {
        super(testName);
    }

    public void testChars() {
        assertEquals('B', 'B');
        char capitalA = 'A';
        assertEquals('A', capitalA);
        assertEquals(65, capitalA);
        assertEquals('\u0041', capitalA);
        assertEquals('\101', capitalA);
    }


    public void testWhitespace() {
        assertEquals(true, Character.isWhitespace('\t'));
        assertEquals(true, Character.isWhitespace('\n'));
        assertEquals(true, Character.isWhitespace(' '));
        assertEquals(false, Character.isWhitespace('A'));
        assertEquals(false, Character.isWhitespace('8'));
        assertEquals(false, Character.isWhitespace('*'));
    }

    /*  pg 156
    it is a letter
    it is a currency symbol (such as '$')
    it is a connecting punctuation character (such as '_')
    it is a digit
    it is a numeric letter (such as a Roman numeral character)
    it is a combining mark
    it is a non-spacing mark
    isIdentifierIgnorable returns true for the character
    */
    public void testIdentifierCharacter() {
        assertFalse(Character.isJavaIdentifierPart('^'));
        assertTrue(Character.isJavaIdentifierPart('k'));
    }
}
