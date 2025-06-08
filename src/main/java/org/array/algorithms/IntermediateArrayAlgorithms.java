package org.array.algorithms;

/**
 * Intermediate array algorithms:
 * - Searching
 * - Sorting
 * - Shifting
 * - Duplicates checking
 * - Merging arrays
 */
public class IntermediateArrayAlgorithms {

    /**
     * Performs linear search for the target in the given array.
     * <p>
     * Algorithm type: Brute-force search. (Brute-force search = Try everything, one by one.)
     * Time complexity: O(n).
     * Pattern: Traversal → visit each element one by one.
     *
     * @param arr    the array to search in
     * @param target the value to search for
     * @return index of target if found, else -1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    /**
     * Sorts the array in ascending order using Bubble Sort.
     * <p>
     * Algorithm type: Simple sorting.
     * Time complexity: O(n^2).
     * Pattern: Repeatedly swap adjacent out-of-order elements.
     *
     * @param arr the array to sort
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Sorts the array in ascending order using Selection Sort.
     * <p>
     * Algorithm type: Selection-based sorting.
     * Time complexity: O(n^2).
     * Pattern: Find the smallest remaining element and move it to its correct place.
     *
     * @param arr the array to sort
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    /**
     * Sorts the array in ascending order using Insertion Sort.
     * <p>
     * Algorithm type: Incremental sorting.
     * Time complexity: O(n^2).
     * Pattern: Insert each element into its correct position in the sorted portion.
     *
     * @param arr the array to sort
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift larger elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Performs binary search for the target in a sorted array.
     * <p>
     * Algorithm type: Divide and conquer. (don’t search the entire array,
     * divide it into smaller parts, and search only in the correct part.)
     *
     * Time complexity: O(log n).
     * Precondition: The array must be sorted.
     * Pattern: Repeatedly divide the search space in half.
     *
     * @param arr    the sorted array to search in
     * @param target the value to search for
     * @return index of target if found, else -1
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Safe midpoint calculation
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    /**
     * Shifts all elements in the array one position to the right.
     * <p>
     * Algorithm type: Rotation.
     * Time complexity: O(n).
     * Pattern: Move last element to front and shift others right.
     *
     * @param arr the array to shift
     */
    public static void shiftRight(int[] arr) {
        if (arr.length == 0) return;
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    /**
     * Shifts all elements in the array one position to the left.
     * <p>
     * Algorithm type: Rotation.
     * Time complexity: O(n).
     * Pattern: Move first element to end and shift others left.
     *
     * @param arr the array to shift
     */
    public static void shiftLeft(int[] arr) {
        if (arr.length == 0) return;
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    /**
     * Checks if the array contains any duplicate values.
     * <p>
     * Algorithm type: Brute-force check.
     * Time complexity: O(n^2).
     * Pattern: Compare each element with all following elements.
     *
     * @param arr the array to check
     * @return true if duplicates found, false otherwise
     */
    public static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    /**
     * Merges two arrays into one new array.
     * <p>
     * Algorithm type: Merge operation.
     * Time complexity: O(n + m).
     * Pattern: Copy all elements from both arrays into a new array.
     *
     * @param arr1 the first array
     * @param arr2 the second array
     * @return merged array
     */
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        return merged;
    }

    /**
     * Helper method to swap two elements in the array.
     * <p>
     * Pattern: Basic utility function used in many sorting algorithms.
     *
     * @param arr the array
     * @param i   index of first element
     * @param j   index of second element
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
