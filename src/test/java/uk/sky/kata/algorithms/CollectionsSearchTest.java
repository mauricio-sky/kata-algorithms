package uk.sky.kata.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class CollectionsSearchTest {

    @Test
    void shouldReturnNegativeOneForNotFoundValue() {
        // Arrange
        var input = Arrays.asList(2, 5, 8, 12, 16, 23, 38, 56, 72, 91);
        var target = 100;

        // Act
        int result = Collections.binarySearch(input, target);

        // Assert
        Assertions.assertEquals(-11, result);
    }

    @Test
    void shouldReturnThePositionWhenTheValueIsFoundOneTheRightSide() {
        // Arrange
        var input = Arrays.asList(2, 5, 8, 12, 16, 23, 38, 56, 72, 91);
        var target = 23;
        var expectedPosition = 5;

        // Act
        var result = Collections.binarySearch(input, target);

        // Assert
        Assertions.assertEquals(expectedPosition, result);
    }

}
