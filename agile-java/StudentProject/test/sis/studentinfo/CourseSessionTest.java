package sis.studentinfo;


import java.util.*;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class CourseSessionTest extends TestCase {

    private static final int CREDITS = 3;

    CourseSession session1;
    CourseSession session2;
    Date startDate;

    public CourseSessionTest(String testName) {
        super(testName);
    }

    @Override
    public void setUp() {
        startDate = DateUtil.createDate(2003, 1, 6);
        session1 = createCourseSession();
        session2 = CourseSession.create("MATH", "102", startDate);
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

        Student student1 = new Student("Cain DiVoe");
        session1.enroll(student1);
        assertEquals(CREDITS, student1.getCredits());
        assertEquals(1, session1.getNumberOfStudents());
        assertEquals(student1, session1.getStudent(0));

        Student student2 = new Student("Coralee DeVaughn");
        session1.enroll(student2);
        assertEquals(CREDITS, student2.getCredits());
        assertEquals(2, session1.getNumberOfStudents());
        assertEquals(student1, session1.getStudent(0));
        assertEquals(student2, session1.getStudent(1));
    }

    public void testCourseDates() {
        Date sixteenWeeksOut = DateUtil.createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session1.getEndDate());
    }

    public void testCourseCount() {
        CourseSession.resetCount();
        createCourseSession();
        assertEquals(1, CourseSession.getCount());
        createCourseSession();
        assertEquals(2, CourseSession.getCount());
    }

    private CourseSession createCourseSession() {
        CourseSession session = CourseSession.create("ENGL", "101", startDate);
        session.setNumberOfCredits(CREDITS);
        return session;
    }
}
