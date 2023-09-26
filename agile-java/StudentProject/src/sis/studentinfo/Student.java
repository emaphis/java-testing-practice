package sis.studentinfo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaph
 */
public class Student {
    public static final int CREDITS_REQURED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";

    public enum Grade { A, B, C, D, F };

    private final String name;
    private int credits;
    private String state;
    private GradingStrategy gradingStrategy = new RegularGradingStrategy();
    private final List<Grade> grades = new ArrayList<Grade>();;

    /**
     * Creates a Student given a name.
     * @param name of student
     */
    public Student(String name) {
        this.name = name;
        this.credits = 0;
        this.state = "";
    }

    /**
     * Returns Student name;
     * @return name of Student
     */
    public String getName() {
        return name;
    }

    /**
     * Return student credits
     * @return true if student is full time.
     */
    public boolean isFullTime() {
        return credits >= CREDITS_REQURED_FOR_FULL_TIME;
    }

    public int getCredits() {
        return credits;
    }

    void addCredits(int credits) {
        this.credits += credits;
    }

    boolean isInState() {
        return state.equals(Student.IN_STATE);
    }

    public void setState(String state) {
        state = state.toUpperCase();
        this.state = state;
    }

    public double getGpa() {
        if (grades.isEmpty())
            return 0.0;

        double total = 0.0;
        for (Grade grade : grades)
            total += gradePointsFor(grade);

        return total / grades.size();
    }

    private int gradePointsFor(Grade grade) {
        return gradingStrategy.getGradePointsFor(grade);
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public void setGradingStratagy(HonorsGradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }
}
