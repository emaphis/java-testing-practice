

package util;

/**
 * Class to hold String utilities
 * @author emaph
 */
public class StringUtil {
    public static char NEWLINE = '\n';
    private StringUtil() { }

    public static String appendNewLine(String str) {
        return str + NEWLINE;
    }
}
