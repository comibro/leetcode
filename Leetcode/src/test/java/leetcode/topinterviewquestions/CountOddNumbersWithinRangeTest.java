package leetcode.topinterviewquestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOddNumbersWithinRangeTest {

    private CountOddNumbersWithinRange countOddNumbersWithinRange = new CountOddNumbersWithinRange();

    @Test
    void testCountOddsConstraints() {
        assertThrows(IllegalArgumentException.class, ()-> countOddNumbersWithinRange.countOdds(5, 3));
        assertThrows(IllegalArgumentException.class, ()-> countOddNumbersWithinRange.countOdds(-1, 3));
    }

    @Test
    void testCountOddsRangeInclusive() {
        assertEquals(3, countOddNumbersWithinRange.countOdds(3,7));
        assertEquals(1, countOddNumbersWithinRange.countOdds(8,10));
        assertEquals(1, countOddNumbersWithinRange.countOdds(3,3));
        assertEquals(37600997, countOddNumbersWithinRange.countOdds(806545180,881747173));
    }

    @Test
    void testCountOddsRangeInclusive2() {
        assertEquals(3, countOddNumbersWithinRange.countOddsFast(3,7));
        assertEquals(1, countOddNumbersWithinRange.countOddsFast(8,10));
        assertEquals(1, countOddNumbersWithinRange.countOddsFast(3,3));
        assertEquals(37600997, countOddNumbersWithinRange.countOddsFast(806545180,881747173));
    }
}