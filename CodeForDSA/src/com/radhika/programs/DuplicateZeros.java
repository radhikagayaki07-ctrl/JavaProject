package com.radhika.programs;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        // Count zeros to be duplicated
        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                // Edge case: zero at boundary
                if (i == length - possibleDups) {
                    arr[length] = 0; // duplicate only once
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards
        int last = length - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

        System.out.print("Array after duplicating zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
