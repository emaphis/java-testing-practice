package sis.studentinfo;

import java.util.*;

/**
 *
 * @author emaph
 */
public class DateUtil {

    public static Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(GregorianCalendar.YEAR, year);
        calendar.set(GregorianCalendar.MONTH, month - 1);
        calendar.set(GregorianCalendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}
