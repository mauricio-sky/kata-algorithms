package uk.sky.kata.algorithms;

public class LinearSearching implements IntArraySearching{

    @Override
    public int search(int[] input, int target) {

        var length = input.length;
        for (var i = 0; i < length; i++) {
            if (input[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
