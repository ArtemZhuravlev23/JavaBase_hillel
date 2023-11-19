package home_work_20;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SquareArrayTest {

    private int[][] squareMatrix;
    private int[][] notSquareMatrix;
    private int[][] squareNullValueMatrix;
    private int[][] squareEmptyMatrix;
    private double expectedAverage;
    boolean expectedIsNullMatrix;
    boolean expectedIsEmptyMatrix;
    boolean expectedIsSquare;

    @BeforeEach
    void setUp() {
        squareMatrix = new int[][]{{1, 6, 4}, {7, 3, 5}, {2, 5, 3}};
        notSquareMatrix = new int[][]{{7, 4, 6}, {5, 9}, {8}};
        squareNullValueMatrix = new int[][]{{1, 2, 3}, null, {5, 6}};
        squareEmptyMatrix = new int[][]{{1, 2, 3}, {}, {4}, {}, {}, {7, 8, 9}};
        expectedIsNullMatrix = false;
        expectedIsEmptyMatrix = false;
        expectedAverage = 4.0;
        expectedIsSquare = true;
    }

    @Test
    void calculateAverageMatrix() {
        double actualAverage = SquareArray.calculateAverageMatrix(squareMatrix);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void calculateAverageNullValueTest() {
        boolean expectedIsNullMatrix = false;
        boolean actualAverage = SquareArray.squareMatrix(squareNullValueMatrix);
        Assertions.assertEquals(expectedIsNullMatrix, actualAverage);
    }

    @Test
    void calculateAverageEmptyValueTest() {
        boolean expectedIsEmptyMatrix = false;
        boolean actualAverage = SquareArray.squareMatrix(squareEmptyMatrix);
        Assertions.assertEquals(expectedIsEmptyMatrix, actualAverage);
    }

    @Test
    void SquareMatrix() {
        boolean actualSquare = SquareArray.squareMatrix(squareMatrix);
        Assertions.assertEquals(expectedIsSquare, actualSquare);
    }

    @Test
    void notSquareMatrixTest() {
        boolean expectedIsSquare = false;
        boolean actualSquare = SquareArray.squareMatrix(notSquareMatrix);
        Assertions.assertEquals(expectedIsSquare, actualSquare);
    }

}
