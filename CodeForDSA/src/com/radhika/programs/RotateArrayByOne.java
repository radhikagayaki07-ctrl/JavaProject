package com.radhika.programs;

import java.util.Arrays;

public class RotateArrayByOne {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1]; // store last element

        // shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // put last element at the front
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateByOne(arr);

        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}