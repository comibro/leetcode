package leetcode.topinterviewquestions;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m, j=0; i<nums1.length; i++, j++)
        {
            if(j < n) {
                nums1[i] = nums2[j];
            }
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}
