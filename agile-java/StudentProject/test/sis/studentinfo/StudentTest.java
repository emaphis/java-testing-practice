package sis.studentinfo;


import junit.framework.TestCase;

/**
 * Test the Student class
 * @author emaph
 */
public class StudentTest extends TestCase {

    public StudentTest(String testName) {
        super(testName);
    }

    public void testCreateStudent() {
        final String firstStudentName = "Jane Doe";
        Student firstStudent = new Student(firstStudentName);
        assertEquals(firstStudentName, firstStudent.getName());

        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, firstStudent.getName());
    }

    public void testFullTime() {
        Student student = new Student("a");
        assertFalse(student.isFullTime());
    }

    public void testNewStudentShouldHave0Credits() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
    }

    public void testStudentStatus() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(4);
        assertEquals(7, student.getCredits());
        assertFalse(student.isFullTime());


        student.addCredits(5);
        assertEquals(Student.CREDITS_REQURED_FOR_FULL_TIME, student.getCredits());
        assertTrue(student.isFullTime());
    }

    public void testInState() {
        Student student = new Student("a");
        assertFalse(student.isInState());
        student.setState(Student.IN_STATE);
        assertTrue(student.isInState());
        student.setState("MD");
        assertFalse(student.isInState());
    }
}
