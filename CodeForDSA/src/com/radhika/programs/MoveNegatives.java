package com.radhika.programs;

import java.util.Arrays;

public class MoveNegatives {
    public static void moveNegativesToEnd(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // First add positives
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }

        // Then add negatives
        for (int num : arr) {
            if (num < 0) {
                result[index++] = num;
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6, -7};
        moveNegativesToEnd(arr);
        System.out.println("Array after moving negatives: " + Arrays.toString(arr));
    }
}