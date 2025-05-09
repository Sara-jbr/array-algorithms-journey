package org.array.algorithms;

public class CompetitiveAlgorithms {

    // Two-pointer technique to find a pair with a given sum in a sorted array
    public static void twoPointerSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found");
    }

    // Sort array containing only 0s, 1s, and 2s (Dutch National Flag problem)
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

    // Utility method to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Find a contiguous subarray that sums to a target value
    public static void subarraySum(int[] arr, int target) {
        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
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

    // Merge two sorted arrays in-place (assumes arr1 has enough buffer at end)
    public static void mergeSortedInPlace(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            arr1[k--] = arr1[i] > arr2[j] ? arr1[i--] : arr2[j--];
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }

    // Find the missing number in a sequence from 0 to n
    public static int findMissing(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        for (int num : arr) {
            total -= num;
        }
        return total;
    }

    // Find the majority element using Boyer-Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate; // Assumes that majority element always exists
    }
}
