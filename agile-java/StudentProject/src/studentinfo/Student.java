package studentinfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    String getName() {
        return name;
    }
    
}
