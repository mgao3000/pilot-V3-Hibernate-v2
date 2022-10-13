package com.devmountain.training.algorithm.binarysearch;

import java.util.Arrays;

public class FindTargetNumberUsingBinarySearch {

    public int findIndexOfArray(int [] intArray, int targetValue) {
        if(intArray == null || intArray.length == 0)
            return -1;
        int beginningIndex = 0;
        int endingIndex = intArray.length - 1;

        while (beginningIndex <= endingIndex) {
            int middleIndex = (beginningIndex + endingIndex) / 2;
            if(intArray[middleIndex] == targetValue)
                return middleIndex;
            if(intArray[middleIndex] < targetValue)
                beginningIndex = middleIndex + 1;
            else
                endingIndex = middleIndex - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = {3, 6, 9, 11, 15, 16, 19, 22, 25, 35, 41, 55, 58, 66, 77, 88, 99, 101};
        int targetNumber = 100;

        FindTargetNumberUsingBinarySearch findTargetNumberUsingBinarySearch = new FindTargetNumberUsingBinarySearch();
        int arrayIndex = findTargetNumberUsingBinarySearch.findIndexOfArray(intArray, targetNumber);

        System.out.println("The int array is: " + Arrays.toString(intArray));
        System.out.println("The target number is: " + targetNumber);
        System.out.println("The returned array Index is: " + arrayIndex);
    }
}
