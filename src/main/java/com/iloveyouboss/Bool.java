/*
 * I Love You Boss App.
 */
package com.iloveyouboss;

/**
 *
 * @author emaphis
 */
public enum Bool {
    False(0),
    True(1);
    public static final int FALSE = 0;
    public static final int TRUE = 1;
    private final int value;
    private Bool(int value) { this.value = value; }
    public int getValue() { return value; }
}
