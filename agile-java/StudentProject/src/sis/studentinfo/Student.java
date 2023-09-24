package sis.studentinfo;

/**
 *
 * @author emaph
 */
public class Student {
    private final String name;

    /**
     * Creates a Student given a name.
     * @param name of student
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Returns Student name;
     * @return name of Student
     */
    public String getName() {
        return name;
    }
}
