package leetcode.onboarding.ransomnote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    private RansomNote ransomNote = new RansomNote();

    @Test
    void testRansomNoteStrings() {

        String water = "water";
        String tower = "tower";

        assertFalse(ransomNote.canConstruct(water, tower));

        String aaac = "aaac";
        String caaa = "caaa";

        assertTrue(ransomNote.canConstruct(aaac, caaa));
    }

}