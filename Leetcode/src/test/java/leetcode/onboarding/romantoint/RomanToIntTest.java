package leetcode.onboarding.romantoint;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanToIntTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "hello", "MMMXXXCCCLLLDDDIIIIIII", "MMCXXIVP"})
    void romanToIntConstraintsTest(String romanNumeral) {

        assertThrows(IllegalArgumentException.class, () -> RomanToInt.romanToInt(romanNumeral));
    }

    @Test
    void validRomanLiteralTest() {
        assertEquals(2144, RomanToInt.romanToInt("MMCXLIV"));
        assertEquals(3, RomanToInt.romanToInt("III"));
        assertEquals(58, RomanToInt.romanToInt("LVIII"));
        assertEquals(1994, RomanToInt.romanToInt("MCMXCIV"));
        assertEquals(994, RomanToInt.romanToInt("CMXCIV"));
    }
}