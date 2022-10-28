package uk.sky.kata.algorithms;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        var array = IntStream.rangeClosed(1, 20_000).toArray();

        run(new LinearSearching(),array, 9000);
        run(new BinarySearching(),array, 9000);
    }

    private static void run(IntArraySearching algorithm, int[] input, int target) {
        var start = Instant.now();
        var result = algorithm.search(input, target);
        var end = Instant.now();

        var duration = Duration.between(start, end);
        System.out.printf("Result: %d. Took: %s millis or %s seconds.\n", result, duration.toMillis(), duration.toSeconds());
    }

//    try {
//        Thread.sleep(1);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    }
}
