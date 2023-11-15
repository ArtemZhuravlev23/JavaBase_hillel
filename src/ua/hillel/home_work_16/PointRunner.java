package ua.hillel.home_work_16;

public class PointRunner {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point firstPoint = new Point(10, 60);
        Point secondPoint = new Point(5, 40);

        System.out.println("Coordinates of the first point: " + firstPoint);
        System.out.println("Coordinates of the second point: " + secondPoint);

        System.out.println("\n" + "Distance from the first point to the second point: " + firstPoint.distanceToPoint(secondPoint) + ";");
        System.out.println("Distance between the first point and the second point: " + Point.distanceBetweenPoints(firstPoint, secondPoint) + ";");


        System.out.println("\n" + "Updated coordinates of points:");
        firstPoint.setX(5);
        firstPoint.setY(45);
        secondPoint.setX(15);
        secondPoint.setY(60);
        System.out.println("Coordinates of the first point: " + firstPoint);
        System.out.println("Coordinates of the Second point: " + secondPoint);

        System.out.println();
        Point clonedPoint = firstPoint.clone();
        System.out.println("Cloned point: " + clonedPoint);
        System.out.println("Cloned point == first point: " + (clonedPoint == firstPoint));
        System.out.println("Cloned point EQUALS the first point: " + clonedPoint.equals(firstPoint));


        System.out.println();
        Point copiedPoint = new Point(firstPoint);
        System.out.println("Copied point: " + copiedPoint);
        System.out.println("Copied point == first point: " + (copiedPoint == firstPoint));
        System.out.println("Copied point EQUALS the first point: " + copiedPoint.equals(firstPoint));

    }

}