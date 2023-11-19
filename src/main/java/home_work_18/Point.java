package home_work_18;

import java.util.Objects;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceToPoint(Point another) {
        return distanceBetweenPoints(this, another);

    }

    public static double distanceBetweenPoints(Point one, Point another) {
        if (one == null || another == null) {
            return -1;
        }
        double deltaX = one.x - another.x;
        double deltaY = one.y - another.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    @Override
    public String toString() {
        return "point: (" + x + ", " + y + ")";
    }

}


