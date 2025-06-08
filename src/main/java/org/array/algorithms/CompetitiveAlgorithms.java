package org.array.algorithms;

public class CompetitiveAlgorithms {

    /**
     * Two-pointer technique to find a pair with a given sum in a sorted array.
     *
     * Pattern: Two pointers (start and end), moving inward based on sum comparison.
     * Time complexity: O(n)
     *
     * @param arr sorted input array
     * @param target target sum to find
     */
    public static void twoPointerSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                return;
            } else if (sum < target) {
                left++;  // Need a larger sum, move left pointer right
            } else {
                right--; // Need a smaller sum, move right pointer left
            }
        }
        System.out.println("No pair found");
    }

    /**
     * Sort an array containing only 0s, 1s, and 2s (Dutch National Flag problem).
     *
     * Pattern: Three pointers to partition array into three parts.
     * (means I move through the array using 3 pointers to split it into 3 parts at the same time.)
     * Time complexity: O(n), in-place sort.
     *
     * @param arr input array containing only 0, 1, 2
     */
    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high--);
                    break;
            }
        }
    }

    // Utility method to swap two elements in an array.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Find a contiguous subarray that sums to a target value.
     *
     * Pattern: Sliding window / two pointers with dynamic window size.
     * Time complexity: O(n)
     *
     * Works for non-negative integers.
     *
     * @param arr input array
     * @param target target sum to find in subarray
     */
    public static void subarraySum(int[] arr, int target) {
        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            // Shrink window from left while sum > target
            while (sum > target && start <= end) {
                sum -= arr[start++];
            }
            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray found");
    }

    /**
     * Merge two sorted arrays in-place (assumes arr1 has enough buffer at the end).
     *
     * Pattern: Merge from the end to avoid overwriting elements in arr1.
     * Time complexity: O(m + n)
     *
     * @param arr1 first sorted array with buffer space at the end
     * @param m number of valid elements in arr1
     * @param arr2 second sorted array
     * @param n number of elements in arr2
     */
    public static void mergeSortedInPlace(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            arr1[k--] = arr1[i] > arr2[j] ? arr1[i--] : arr2[j--];
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }

    /**
     * Find the missing number in a sequence from 0 to n.
     *
     * Pattern: Use sum formula to find the missing number by subtraction.
     * Time complexity: O(n)
     *
     * @param arr array of numbers containing all from 0 to n except one missing
     * @param n upper bound of sequence (inclusive)
     * @return the missing number
     */
    public static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2; // Sum of 0 to n
        for (int num : arr) {
            total -= num;  // Subtract each present number
        }
        return total; // What remains is missing
    }

    /**
     * Find the majority element using Boyer-Moore Voting Algorithm.
     * (The element that appears more than n/2 times in the array (where n = array length).)
     *
     *
     * Pattern: Candidate selection and count adjustment.
     * Time complexity: O(n), space: O(1)
     *
     * Assumes majority element always exists (appears more than n/2 times).
     *
     * @param nums input array
     * @return majority element
     */
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;  // Pick new candidate
            count += (num == candidate) ? 1 : -1; // Increment or decrement count
        }
        return candidate;
    }
}
