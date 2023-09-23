package studentinfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
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
    
   
    
}
