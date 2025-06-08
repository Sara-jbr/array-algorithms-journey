package org.array.algorithms;

/**
 * Advanced array algorithms with tips and explanations:
 * Includes rearrangement, selection, sliding window, prefix sums,
 * Kadane's algorithm, and array rotations.
 */
public class AdvanceAlgorithms {

    /**
     * Rearranges the array so that all negative numbers come before positives.
     *
     * Algorithm: Two-pass rearrangement using extra space.
     * Pattern: Partitioning (similar to two-pointer, but here two separate loops).
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param arr Input array to rearrange
     */
    public static void rearrangePosNeg(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        // Collect negatives first
        for (int value : arr) {
            if (value < 0) temp[index++] = value;
        }

        // Collect positives next (including zero)
        for (int value : arr) {
            if (value >= 0) temp[index++] = value;
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    /**
     * Finds the second largest element in the array.
     *
     * Algorithm: Single pass with two variables tracking max and second max.
     * Pattern: Selection / Linear scan.
     * Time Complexity: O(n)
     *
     * @param arr Input array
     * @return The second largest element or Integer.MIN_VALUE if none
     */
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

    /**
     * Finds the second smallest element in the array.
     *
     * Algorithm: Single pass with two variables tracking min and second min.
     * Pattern: Selection / Linear scan.
     * Time Complexity: O(n)
     *
     * @param arr Input array
     * @return The second smallest element or Integer.MAX_VALUE if none
     */
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

    /**
     * Finds and prints all pairs in the array that sum to the target using brute force.
     *
     * Algorithm: Brute force nested loops.
     * Pattern: Pair search.
     * Time Complexity: O(n^2)
     *
     * @param arr Input array
     * @param target Target sum for pairs
     */
    public static void twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }

    /**
     * Finds the maximum sum of any subarray of size k using sliding window technique.
     *
     * Algorithm: Sliding window with fixed window size.
     *
     * Pattern: Sliding Window.
     * The Sliding Window is a common pattern used when you want to process a subset (window) of a sequence, like an array or string,
     * and move this subset step by step.
     * The "window" has a fixed size (k) or sometimes a variable size, and it slides over the array.
     *
     * Time Complexity: O(n)
     *
     * @param arr Input array
     * @param k Size of subarray window
     * @return Maximum sum of subarray of size k
     */
    public static int maxSumSlidingWindow(int[] arr, int k) {
        int windowSum = 0;
        // Initial window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // Remove left element, add right element
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    /**
     * Computes prefix sums for the array.
     *
     * Algorithm: Prefix sum computation.
     * Pattern: Cumulative sum array.
     * Time Complexity: O(n)
     *
     * @param arr Input array
     * @return New array of prefix sums where prefix[i] = sum(arr[0..i])
     */
    public static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    /**
     * Finds the maximum sum of any subarray using Kadane's algorithm.
     *
     * Algorithm: Dynamic Programming.
     * (Dynamic Programming = Solve small problems, remember their answers, and build up to the big answer.)
     * Pattern: Keep track of current max and global max.
     * Time Complexity: O(n)
     *
     * @param arr Input array
     * @return Maximum subarray sum
     */
    public static int kadaneMaxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // Decide whether to start new subarray or continue previous
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    /**
     * Rotates the array right by k steps using extra array.
     *
     * Algorithm: Rotation using auxiliary array.
     * Pattern: Index mapping with modulo.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param arr Input array
     * @param k Number of rotation steps
     */
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k %= n; // handle k > n
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }
        System.arraycopy(result, 0, arr, 0, n);
    }

    /**
     * Reverses a portion of the array in place.
     *
     * Algorithm: Two-pointer swapping.
     * Pattern: In-place reversal.
     * Time Complexity: O(n)
     *
     * @param arr Input array
     * @param start Start index
     * @param end End index
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    /**
     * Rotates the array left by k steps in-place using reversal algorithm.
     *
     * Algorithm: Rotation using triple reversal.
     * Pattern: Reverse parts of the array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param arr Input array
     * @param k Number of rotation steps
     */
    public static void rotateLeftInPlace(int[] arr, int k) {
        int n = arr.length;
        k %= n; // handle k > n

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);

        // Reverse whole array
        reverse(arr, 0, n - 1);
    }
}
