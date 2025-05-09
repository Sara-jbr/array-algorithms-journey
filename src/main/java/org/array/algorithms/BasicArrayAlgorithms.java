package org.array.algorithms;

public class BasicArrayAlgorithms {

    // Print all elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Calculate the sum of all elements
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Find and print the minimum and maximum element
    public static void findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }

    // Calculate the average of array elements
    public static double averageArray(int[] arr) {
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }

    // Reverse the array in-place
    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
