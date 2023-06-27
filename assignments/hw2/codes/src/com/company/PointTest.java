package com.company;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PointTest {

    @DataPoints
    public static Point[] points = {
            new Point(0, 0),
            new Point(1, 1),
            new Point(2, 2),
            new Point(3, 3)
    };

    @Theory
    public void testEqualsAndHashCode(Point p1, Point p2) {
        Assume.assumeTrue(p1.equals(p2));
        assertTrue(p1.hashCode() == p2.hashCode());
    }
}
