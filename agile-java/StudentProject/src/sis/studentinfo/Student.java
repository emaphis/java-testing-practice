package sis.studentinfo;

/**
 *
 * @author emaph
 */
public class Student {
    public static final int CREDITS_REQURED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";

    private final String name;
    private int credits;
    private String state;

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
        state.toUpperCase();
        this.state = state;
    }
}
