package sis.studentinfo;

import java.util.*;

/**
 * Provides a representation of a single-semester
 * session of a specific university course
 * @author emaph
 */
public class CourseSession implements Comparable<CourseSession>{

    private String department;
    private String CourseNumber;
    private int numberOfCredits;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;
    private static int count;

    /**
     * Constructs a CourseSession starting on a specific date
     *
     * @param department the department number
     * @param number the Section number
     * @param startDate the date on which the CourseSession begins
     */
   private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.CourseNumber = number;
        this.startDate = startDate;
    }

    public static CourseSession create(String department, String number, Date startDate) {

        CourseSession.incrementCount();
        return new CourseSession(department, number, startDate);
    }

    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getDepartment() {
        return department;
    }

    /**
     * Return the session number
     * @return session number
     */
    public String getNumber() {
        return CourseNumber;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    /**
     * Enroll a Student in the course session
     * @param student enrolled
     */
    public void enroll(Student student) {
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    /**
     * Return the student given an index
     * @param i the index
     * @return  the Student
     */
    public Student getStudent(int i) {
        return students.get(i);
    }

    /**
     * Return the start date of the session
     * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Return the end date of the session.
     * @return endDate
     */
    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;  // weeks * days per week - 3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    /**
     * Return the count of the sessions.
     * @return
     */
    public static int getCount() {
        return count;
    }

    static void resetCount() {
        count = 0;
    }

    private static void incrementCount() {
        count++;
    }

    public int compareTo(CourseSession that) {
        int compare = this.getDepartment().compareTo(that.getDepartment());
        if (compare == 0)
            compare = this.getNumber().compareTo(that.getNumber());
        return compare;
    }
}
