package leetcode.onboarding.ransomnote;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RansomNote {


    boolean canConstruct(String ransomNote, String magazine) {

        List<Integer> magazineCharList = new ArrayList<>(magazine.chars().boxed().toList());
        List<Integer> ransomNoteCharList = ransomNote.chars().boxed().toList();

        for (Integer ransomNoteChar : ransomNoteCharList) {
            if (!magazineCharList.contains(ransomNoteChar)) {
                return false;
            }
            magazineCharList.remove(ransomNoteChar);
        }

        return true;
    }
}
