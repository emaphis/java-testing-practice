/*
 * Let's test with Junit 5
 */

package org.letstest.junit5.project;

/**
 * A main class to run experiments
 * @author emaph
 */
public class TestApp {

    /**
     * Let's run the Calculator
     */
    static void testAdd() {
        var calc = new Calculator();
        double result = calc.add(3, 4);
        if (result != 7.0) {
            System.err.println("Bad result: " + result);
        }
    }

    public static void main(String[] args) {
        System.out.println("Let's test!!");
        testAdd();
    }
}
