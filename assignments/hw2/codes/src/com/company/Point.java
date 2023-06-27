package com.company;

import java.util.HashSet;
import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point)) {
            return false;
        }
        Point p = (Point) other;
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        HashSet<Point> set = new HashSet<>();
        set.add(new Point(1, 2));
        set.add(new Point(3, 4));
        set.add(new Point(1, 2)); // This is a duplicate point
        System.out.println(set.size()); // Prints 3 instead of 2
    }
}
