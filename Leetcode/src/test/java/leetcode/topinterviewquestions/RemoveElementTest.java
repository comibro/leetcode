package leetcode.topinterviewquestions;

import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void simpleTest(){
        removeElement.removeElement(new int[]{3,2,2,3}, 3);
    }

    @Test
    void largerArrayTest(){
        removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
    }
}
