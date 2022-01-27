/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scratch;

/**
 *
 * @author emaph
 */
import org.hamcrest.*;

public class PointMatcher extends TypeSafeMatcher<Point> {

    public static final double TOLERANCE = 0.2;
    private double x;
    private double y;

    public PointMatcher(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(String.format("a point near (%s, %s)", x, y));
    }

    @Override
    protected boolean matchesSafely(Point point) {
        return Math.abs(x - point.x) <= TOLERANCE
                && Math.abs(y - point.y) <= TOLERANCE;
    }

    //@Factory
    public static <T> Matcher<Point> isNear(double x, double y) {
        return new PointMatcher(x, y);
    }
}
