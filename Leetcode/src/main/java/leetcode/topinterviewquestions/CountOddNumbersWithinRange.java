package leetcode.topinterviewquestions;

import java.util.stream.IntStream;

class CountOddNumbersWithinRange {

    int countOdds(int low, int high) {
        if (high < low || low < 0) {
            throw new IllegalArgumentException("Range constraints are not met.");
        }

        return (int) IntStream.rangeClosed(low, high).parallel().filter(number -> number % 2 != 0).count();
    }

    int countOddsFast(int low, int high) {
        if (high < low || low < 0) {
            throw new IllegalArgumentException("Range constraints are not met.");
        }

        int oddCount = (high + 1) / 2 - low / 2;
        return oddCount;
    }
}
