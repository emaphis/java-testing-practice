package sis.studentinfo;

import junit.framework.TestCase;
import java.util.*;

/**
 * Tests the DateUtil class
 * @author emaph
 */
public class DateUtilTest extends TestCase {

    public DateUtilTest(String testName) {
        super(testName);
    }

    public void testCreateDate() {
        Date date = DateUtil.createDate(2000, 1, 1);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        assertEquals(2000, calendar.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
        assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
    }
}
