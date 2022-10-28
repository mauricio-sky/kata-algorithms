package uk.sky.kata.algorithms;

public class BinarySearching implements IntArraySearching {

//    @Override
//    public int search(int[] input, int target) {
//        var startIndex = 0;
//        var endIndex = input.length - 1;
//
//        while (startIndex <= endIndex) {
//            var middle = (startIndex + endIndex) / 2;
//
//            if (input[middle] == target) {
//                return middle;
//            }
//
//            if (target > input[middle]) {
//                startIndex = middle + 1;
//            } else {
//                endIndex = middle - 1;
//            }
//        }
//
//        return -1;
//    }

    @Override
    public int search(int[] input, int target) {
        return binarySearch(input, 0, input.length - 1, target);
    }

    public static int binarySearch(int[] array, int startIndex, int endIndex, int target) {
        if (startIndex <= endIndex) {
            var middle = (startIndex + endIndex) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] > target) {
                return binarySearch(array, startIndex, middle - 1, target);
            }

            return binarySearch(array, middle + 1, endIndex, target);
        }

        return -1;
    }
}
