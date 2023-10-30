package leetcode.topinterviewquestions;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int unmatched = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[unmatched];
                nums[unmatched] = nums[j];
                nums[j] = temp;
                unmatched++;
            }
        }
        return unmatched;
    }

    public static void main(String[] args) {

    }
}
