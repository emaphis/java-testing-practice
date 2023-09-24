package sis.studentinfo;


import java.util.*;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class CourseSessionTest extends TestCase {

    CourseSession session1;
    CourseSession session2;
    Student student1;
    Student student2;
    Date startDate;

    public CourseSessionTest(String testName) {
        super(testName);
    }

    @Override
    public void setUp() {
        startDate = DateUtil.createDate(2003, 1, 6);
        session1 = new CourseSession("ENGL", "101", startDate);
        session2 = new CourseSession("MATH", "102", startDate);
        student1 = new Student("Cain DiVoe");
        student2 = new Student("Coralee DeVaughn");
    }

    public void testCreate() {
        assertEquals("ENGL", session1.getDepartment());
        assertEquals("101", session1.getNumber());
        assertEquals(0, session1.getNumberOfStudents());
        assertEquals(startDate, session1.getStartDate());

        assertEquals("MATH", session2.getDepartment());
        assertEquals("102", session2.getNumber());
    }

    public void testEnrollStudents() {
        assertEquals(0, session1.getNumberOfStudents());

        session1.enroll(student1);
        assertEquals(1, session1.getNumberOfStudents());
        assertEquals(student1, session1.getStudent(0));

        session1.enroll(student2);
        assertEquals(2, session1.getNumberOfStudents());
        assertEquals(student1, session1.getStudent(0));
        assertEquals(student2, session1.getStudent(1));
    }

    public void testCourseDates() {
        Date sixteenWeeksOut = DateUtil.createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session1.getEndDate());
    }
}
