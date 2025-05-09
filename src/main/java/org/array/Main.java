package org.array;

import org.array.algorithms.AdvanceAlgorithms;
import org.array.algorithms.BasicArrayAlgorithms;
import org.array.algorithms.IntermediateArrayAlgorithms;

import java.util.Arrays;

import static org.array.algorithms.CompetitiveAlgorithms.*;

public class Main {
    public static void main(String[] args) {

        // ===== Basic Algorithms =====
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.print("Original array: ");
        BasicArrayAlgorithms.printArray(numbers);

        int sum = BasicArrayAlgorithms.sumArray(numbers);
        System.out.println("Sum of array: " + sum);

        double avg = BasicArrayAlgorithms.averageArray(numbers);
        System.out.println("Average of array: " + avg);

        BasicArrayAlgorithms.findMinMax(numbers);

        BasicArrayAlgorithms.reverseArray(numbers);
        System.out.print("Reversed array: ");
        BasicArrayAlgorithms.printArray(numbers);

        System.out.println(); // Spacer between sections


        // ===== Intermediate Algorithms =====
        int[] searchArray = {7, 3, 9, 2, 5, 3};
        int[] mergeWithArray = {10, 20, 30};

        int index = IntermediateArrayAlgorithms.linearSearch(searchArray, 5);
        System.out.println("Index of 5: " + index);

        IntermediateArrayAlgorithms.bubbleSort(searchArray);
        System.out.print("Bubble Sorted: ");
        BasicArrayAlgorithms.printArray(searchArray);

        int[] selectionArray = {7, 4, 2, 8};
        IntermediateArrayAlgorithms.selectionSort(selectionArray);
        System.out.print("Selection Sorted: ");
        BasicArrayAlgorithms.printArray(selectionArray);

        int[] insertionArray = {9, 1, 6, 3};
        IntermediateArrayAlgorithms.insertionSort(insertionArray);
        System.out.print("Insertion Sorted: ");
        BasicArrayAlgorithms.printArray(insertionArray);

        int binaryIndex = IntermediateArrayAlgorithms.binarySearch(searchArray, 9);
        System.out.println("Binary search for 9: " + binaryIndex);

        IntermediateArrayAlgorithms.shiftRight(searchArray);
        System.out.print("Shift Right: ");
        BasicArrayAlgorithms.printArray(searchArray);

        IntermediateArrayAlgorithms.shiftLeft(searchArray);
        System.out.print("Shift Left: ");
        BasicArrayAlgorithms.printArray(searchArray);

        boolean hasDuplicates = IntermediateArrayAlgorithms.hasDuplicates(searchArray);
        System.out.println("Has duplicates: " + hasDuplicates);

        int[] mergedArray = IntermediateArrayAlgorithms.mergeArrays(searchArray, mergeWithArray);
        System.out.print("Merged array: ");
        BasicArrayAlgorithms.printArray(mergedArray);

        System.out.println(); // Spacer between sections


        // ===== Advanced Algorithms =====
        int[] posNegArray = {1, -2, 3, -4, 5};
        AdvanceAlgorithms.rearrangePosNeg(posNegArray);
        System.out.println("Rearranged pos-neg: " + Arrays.toString(posNegArray));

        int[] secondLargestArray = {3, 5, 2, 9, 5};
        System.out.println("Second largest: " + AdvanceAlgorithms.secondLargest(secondLargestArray));

        int[] secondSmallestArray = {8, 1, 3, 2, 2};
        System.out.println("Second smallest: " + AdvanceAlgorithms.secondSmallest(secondSmallestArray));

        int[] twoSumArray = {2, 7, 11, 15};
        System.out.print("Pairs for sum 9: ");
        AdvanceAlgorithms.twoSumBruteForce(twoSumArray, 9);

        int[] slidingWindowArray = {1, 2, 3, 4, 5};
        System.out.println("Max sum of window size 3: " + AdvanceAlgorithms.maxSumSlidingWindow(slidingWindowArray, 3));

        int[] prefixArray = {1, 2, 3, 4};
        int[] prefixSum = AdvanceAlgorithms.prefixSum(prefixArray);
        System.out.println("Prefix sum: " + Arrays.toString(prefixSum));

        int[] kadaneArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max subarray sum (Kadane's): " + AdvanceAlgorithms.kadaneMaxSubArraySum(kadaneArray));

        int[] rotateRightArray = {1, 2, 3, 4, 5};
        AdvanceAlgorithms.rotateRight(rotateRightArray, 2);
        System.out.println("Rotated right by 2: " + Arrays.toString(rotateRightArray));

        int[] reverseArray = {1, 2, 3, 4, 5};
        AdvanceAlgorithms.reverse(reverseArray, 0, 4);
        System.out.println("Reversed: " + Arrays.toString(reverseArray));

        int[] rotateLeftArray = {1, 2, 3, 4, 5};
        AdvanceAlgorithms.rotateLeftInPlace(rotateLeftArray, 2);
        System.out.println("Rotated left by 2: " + Arrays.toString(rotateLeftArray));

        System.out.println(); // Spacer between sections


        // ===== Competitive Algorithms =====
        int[] sortedTwoSumArray = {1, 2, 3, 4, 6};
        twoPointerSum(sortedTwoSumArray, 7);

        int[] dutchFlagArray = {2, 0, 2, 1, 1, 0};
        sort012(dutchFlagArray);
        System.out.println("Sorted 0s,1s,2s: " + Arrays.toString(dutchFlagArray));

        int[] subArraySumInput = {1, 4, 20, 3, 10, 5};
        subarraySum(subArraySumInput, 33);

        int[] mergeInPlaceA = {1, 3, 5, 0, 0, 0};
        int[] mergeInPlaceB = {2, 4, 6};
        mergeSortedInPlace(mergeInPlaceA, 3, mergeInPlaceB, 3);
        System.out.println("Merged in-place: " + Arrays.toString(mergeInPlaceA));

        int[] missingNumberArray = {1, 2, 4, 5, 6};
        int missingNumber = findMissing(missingNumberArray, 6);
        System.out.println("Missing number: " + missingNumber);

        int[] majorityElementArray = {2, 2, 1, 1, 2, 2, 2};
        int majority = majorityElement(majorityElementArray);
        System.out.println("Majority element: " + majority);
    }
}
