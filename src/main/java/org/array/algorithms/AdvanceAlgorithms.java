package org.array.algorithms;

public class AdvanceAlgorithms {

    public static void rearrangePosNeg(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        // First negatives
        for (int value : arr) {
            if (value < 0) temp[index++] = value;
        }

        // Then positives
        for (int value : arr) {
            if (value >= 0) temp[index++] = value;
        }

        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    // Find the second largest element in array
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }
        return second;
    }

    // Find the second smallest element in array
    public static int secondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                second = min;
                min = num;
            } else if (num < second && num != min) {
                second = num;
            }
        }
        return second;
    }

    // Brute-force approach to find pairs with target sum
    public static void twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }

    // Maximum sum of subarray of size k using sliding window
    public static int maxSumSlidingWindow(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    // Prefix sum of array
    public static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    // Kadane's algorithm: max sum of any subarray
    public static int kadaneMaxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    // Rotate array right by k steps
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        System.arraycopy(result, 0, arr, 0, n);
    }

    // Reverse part of array in-place
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    // Rotate array left in-place by k steps
    public static void rotateLeftInPlace(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
}
