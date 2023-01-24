package leetcode.onboarding.romantoint;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.Set;

final class RomanToInt {

    private static final Map<Character, Integer> romanToIntMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);
    private static final Set<String> romanSubstractionsSet = Set.of("IV", "IX", "XL", "XC", "CD", "CM");

    private static final String ROMAN_NUMERALS_REGEX = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

    private RomanToInt() {
    }

    public static int romanToInt(String roman) {
        if (StringUtils.isBlank(roman) || roman.length() > 15 || !roman.matches(ROMAN_NUMERALS_REGEX)) {
            throw new IllegalArgumentException("Roman numeral is not valid.");
        }

        char[] romanChars = roman.toUpperCase().toCharArray();
        int intValue = 0;

        for (int romanLiteralIndex = romanChars.length - 1; romanLiteralIndex >= 0; romanLiteralIndex--) {
            Character romanCharacter = romanChars[romanLiteralIndex];
            intValue += romanToIntMap.get(romanCharacter);
            if (romanLiteralIndex > 0 && romanSubstractionsSet.contains(String.valueOf(new char[]{romanChars[romanLiteralIndex - 1], romanCharacter}))) {
                intValue -= romanToIntMap.get(romanChars[romanLiteralIndex - 1]);
                romanLiteralIndex -= 1;
            }
        }
        return intValue;
    }
}
