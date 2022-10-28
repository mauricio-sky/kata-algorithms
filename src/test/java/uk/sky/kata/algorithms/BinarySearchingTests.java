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
    void shouldReturnThePositionWhenTheValueIsFound() {
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
    void wheTheArrayIsNotSortedShouldSortAndReturnThePositionWhenTheValueIsFound() {
        // Arrange
        var input = new int[]{12, 16, 56, 23, 72, 91, 38, 2, 8, 5};
        var target = 23;
        var expectedPosition = 5;

        // Act
        int result = new BinarySearching().search(input, target);

        // Assert
        Assertions.assertEquals(expectedPosition, result);
    }
}
