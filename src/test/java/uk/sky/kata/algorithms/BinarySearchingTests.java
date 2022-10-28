package uk.sky.kata.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchingTests {

    @Test
    void shouldReturnNegativeOneForNotFoundValue() {
        // Arrange
        var input = new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        var target = 100;

        // Act
        int result = new BinarySearching().search(input, target);

        // Assert
        Assertions.assertEquals(-1, result);
    }

    @Test
    void shouldReturnThePositionWhenTheValueIsFoundOneTheRightSide() {
        // Arrange
        var input = new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        var target = 23;
        var expectedPosition = 5;

        // Act
        int result = new BinarySearching().search(input, target);

        // Assert
        Assertions.assertEquals(expectedPosition, result);
    }

    @Test
    void shouldReturnThePositionWhenTheValueIsFoundOnTheLeftSide() {
        // Arrange
        var input = new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        var target = 12;
        var expectedPosition = 3;

        // Act
        int result = new BinarySearching().search(input, target);

        // Assert
        Assertions.assertEquals(expectedPosition, result);
    }

    @Test
    void shouldReturnThePositionWhenTheValueIsFoundInFirstPosition() {
        // Arrange
        var input = new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        var target = 2;
        var expectedPosition = 0;

        // Act
        int result = new BinarySearching().search(input, target);

        // Assert
        Assertions.assertEquals(expectedPosition, result);
    }

    @Test
    void shouldReturnThePositionWhenTheValueIsFoundInLastPosition() {
        // Arrange
        var input = new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        var target = 91;
        var expectedPosition = 9;

        // Act
        int result = new BinarySearching().search(input, target);

        // Assert
        Assertions.assertEquals(expectedPosition, result);
    }
}
