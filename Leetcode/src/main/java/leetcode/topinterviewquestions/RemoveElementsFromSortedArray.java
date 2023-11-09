package leetcode.topinterviewquestions;

import java.util.Arrays;

public class RemoveElementsFromSortedArray {

    private int removeDuplicates(int[] array) {
        int numberOfUniqueElements = 1;
        int previousUniqueIndex = 0;
        int previousUniqueValue = array[0];
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            int currentValue = array[currentIndex];
            if (previousUniqueValue < currentValue) {
                previousUniqueValue = currentValue;
                previousUniqueIndex++;
                array[previousUniqueIndex] = array[currentIndex];
                numberOfUniqueElements++;
            }
        }

        return numberOfUniqueElements;
    }

    public static void main(String[] args) {
        RemoveElementsFromSortedArray removeElementsFromSortedArray = new RemoveElementsFromSortedArray();
        int array[] = {0,0,1,1,1,2,2,3,3,4};
        int numberOfUniqueElements = removeElementsFromSortedArray.removeDuplicates(array);
        System.out.println("Number of unique elements is: " + numberOfUniqueElements);
        System.out.println(Arrays.toString(array));

    }
}
