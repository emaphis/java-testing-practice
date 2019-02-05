/*
 * I Love You Boss App
 */
package com.iloveyouboss;

/**
 *
 * @author emaphis
 */
public enum Weight {
    MustMatch(Integer.MAX_VALUE),
    VeryInportant(5000),
    Important(1000),
    WouldPrefer(100),
    DontCare(0);

    private final int value;

    Weight(int value) { this.value = value; }
    public int getValue() { return value; }
}
