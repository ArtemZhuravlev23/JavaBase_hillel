package ua.hillel.home_work_16;

import java.util.Objects;

public class Point implements Cloneable {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Point(Point point) {
        if (point == null) {
            return;
        }
        this.x = point.x;
        this.y = point.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceToPoint(Point point) {return Point.distanceBetweenPoints(this, point);}

    public static double distanceBetweenPoints(Point from, Point to) {
        if (from == null || to == null) {
            return -1;
        }
        if (from == to) {
            return 0;
        }
        return Math.abs(Math.min(from.x - to.x, 2) + Math.min(from.y - to.y, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point point)) {
            return false;
        }

        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y + ";";
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
