package uk.sky.kata.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearSearchingTests {

    @Test
    void shouldReturnNegativeOneForNotFoundValue() {
        // Arrange
        var input = new int[]{49, 30, 32, 102, 65};
        var target = 100;

        // Act
        int result = new LinearSearching().search(input, target);

        // Assert
        Assertions.assertEquals(-1, result);
    }

    @Test
    void shouldReturnThePositionWhenTheValueIsFound() {
        // Arrange
        var input = new int[]{10, 50, 30, 79, 80, 60, 20, 90, 40};
        var target = 20;
        var expectedPosition = 6;

        // Act
        int result = new LinearSearching().search(input, target);

        // Assert
        Assertions.assertEquals(expectedPosition, result);
    }
}
