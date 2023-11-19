package home_work_18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {
    private final double expected_distance = 1.4142135623730951;
    private Point Point_a;
    private Point Point_b;

    @BeforeEach
    void setUp() {
        Point_a = new Point(2, 3);
        Point_b = new Point(1, 4);
    }

    @Test
    void distanceToPointTest() {
        double actualDistance = Point_a.distanceToPoint(Point_b);
        Assertions.assertEquals(expected_distance, actualDistance);
    }

    @Test
    void distanceToNullTest() {
        double actualDistance = Point_a.distanceToPoint(null);
        Assertions.assertEquals(-1, actualDistance);
    }

    @Test
    void distanceBetweenPointsTest() {
        double actualDistance = Point.distanceBetweenPoints(Point_a, Point_b);
        Assertions.assertEquals(expected_distance, actualDistance);
    }

    @Test
    void distanceBetweenPointsNullATest() {
        double actualDistance = Point.distanceBetweenPoints(null, Point_b);
        Assertions.assertEquals(-1, actualDistance);

    }

    @Test
    void distanceBetweenPointsNullBTest() {
        double actualDistance = Point.distanceBetweenPoints(Point_a, null);
        Assertions.assertEquals(-1, actualDistance);
    }

    @Test
    void distanceBetweenNullPointsTest() {
        double actualDistance = Point.distanceBetweenPoints(null, null);
        Assertions.assertEquals(-1, actualDistance);
    }
}





