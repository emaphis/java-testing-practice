package sis.studentinfo;

import java.util.*;

/**
 * Provides a representation of a single-semester
 * session of a specific university course
 * @author emaph
 */
public class CourseSession {

    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;

    /**
     * Constructs a CourseSession starting on a specific date
     *
     * @param department the department number
     * @param number the Section number
     * @param startDate the date on which the CourseSession begins
     */
    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }

    /**
     * Return the session number
     * @return session number
     */
    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    /**
     * Enroll a Student in the course session
     * @param student enrolled
     */
    public void enroll(Student student) {
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

}
