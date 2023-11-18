package ua.hillel.home_work_20;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SquareArrayTest {

    @Test
    void calculateAverageMatrix() {
        double expectedAverageMatrix = 4.0;
        double actualAverageMatrix = SquareArray.calculateAverageMatrix(new int[][]{{1, 6, 4},
                {7, 3, 5}, {2, 5, 3}});
        Assertions.assertEquals(expectedAverageMatrix, actualAverageMatrix);
    }

    @Test
    void calculateAverageOtherMatrix() {
        double expectedAverageMatrix = 6.5;
        double actualAverageMatrix = SquareArray.calculateAverageMatrix(new int[][]{{7, 4, 6},
                {5, 9}, {8}});
        Assertions.assertEquals(expectedAverageMatrix, actualAverageMatrix);
    }

    @Test
    void calculateAverageMatrixNull() {
        double actualAverageMatrix = SquareArray.calculateAverageMatrix(null);
        Assertions.assertTrue(Double.isNaN(actualAverageMatrix));
    }

    @Test
    void calculateAverageOtherMatrixNull() {
        double actualAverageMatrix = SquareArray.calculateAverageMatrix(null);
        Assertions.assertTrue(Double.isNaN(actualAverageMatrix));
    }

    @Test
    void calculateAverageMatrixEmpty() {
        double actualAverageMatrix = SquareArray.calculateAverageMatrix(new int[][]{});
        Assertions.assertTrue(Double.isNaN(actualAverageMatrix));
    }

    @Test
    void calculateAverageOtherMatrixEmpty() {
        double actualAverageMatrix = SquareArray.calculateAverageMatrix(new int[][]{});
        Assertions.assertTrue(Double.isNaN(actualAverageMatrix));
    }


    @Test
    void SquareMatrix() {
        Assertions.assertTrue(SquareArray.squareMatrix(new int[][]{{2, 4, 6}, {1, 3, 5},
                {7, 3, 6}}));
    }

    @Test
    void SquareOtherMatrix() {
        Assertions.assertTrue(SquareArray.squareMatrix(new int[][]{{3, 5, 1}, {7, 2, 4},
                {6, 7, 9}}));
    }

    @Test
    void notSquareMatrix() {
        Assertions.assertFalse(SquareArray.squareMatrix(new int[][]{{7, 3, 5}, {1, 4, 2}, {8}}));
    }

    @Test
    void notSquareOtherMatrix() {
        Assertions.assertFalse(SquareArray.squareMatrix(new int[][]{{3, 2, 1}, {7, 4}, {5}}));
    }

    @Test
    void nullSquareMatrix() {
        Assertions.assertFalse(SquareArray.squareMatrix(null));
    }

    @Test
    void nullSquareOtherMatrix() {
        Assertions.assertFalse(SquareArray.squareMatrix(null));
    }

    @Test
    void emptySquareMatrix() {
        Assertions.assertFalse(SquareArray.squareMatrix(new int[][]{}));
    }

    @Test
    void emptySquareOtherMatrix() {
        Assertions.assertFalse(SquareArray.squareMatrix(new int[][]{}));
    }

}
