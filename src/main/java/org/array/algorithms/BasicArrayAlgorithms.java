package org.array.algorithms;

/**
 * Basic algorithms for array processing:
 * - printing
 * - summing
 * - finding min/max
 * - calculating average
 * - reversing array
 */
public class BasicArrayAlgorithms {

    /**
     * Print all elements of the array.
     *
     * Pattern: Traversal (visit every element).
     *
     * @param arr the array to print
     *
     * Time complexity: O(n) → because we read the whole array once.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Calculate the sum of all elements in the array.
     *
     * Algorithm type: Accumulation.
     *
     * Pattern: initialize → loop → update → return.
     * ✅ You can use it to compute:
     * Sum
     * Max / Min
     * Count
     * Prefix sum
     * Product
     * any time you need to compute something from a dataset
     *
     * @param arr the array whose elements to sum
     * @return the sum of all elements
     *
     * Time complexity: O(n).
     */
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Find and print the minimum and maximum element in the array.
     *
     * Algorithm type: Selection → at each step, keep track of current best (max or min).
     * Pattern: initialize → compare → update.
     * Example of Greedy Algorithm → make a greedy choice for max/min at each step.
     *
     * Greedy algorithm means:
     * At each step → I choose the best option that looks good right now → and move forward.
     *
     * @param arr the array to process
     *
     *  Time complexity: O(n).
     *  Space complexity: O(1)
     */
    public static void findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }

    /**
     * Calculate the average of the array elements.
     *
     * Follows Separation of Concerns: sum calculation is separate from average calculation.
     *
     * @param arr the array whose average to compute
     * @return the average value
     *
     * Time complexity: O(n) → because sumArray is O(n).
     */
    public static double averageArray(int[] arr) {
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }

    /**
     * Reverse the array in-place.
     *
     * In-place reversal algorithm → reverses the array without using an extra array.
     * Uses small, fixed amount of extra memory (a few variables), not another array of the same size.
     *
     * Uses the Two-pointer technique → a very popular technique in algorithms
     * (used in string problems, array problems, linked lists, etc.).
     *
     * @param arr the array to reverse
     *
     *  Time complexity: O(n/2) ≈ O(n).
     *  Space complexity: O(1) → only a single temporary variable temp is used.
     */
    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
