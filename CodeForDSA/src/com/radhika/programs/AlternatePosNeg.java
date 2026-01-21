package com.radhika.programs;

import java.util.*;

public class AlternatePosNeg {
    public static void rearrange(int[] arr) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Separate positives and negatives
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        int i = 0, p = 0, n = 0;
        boolean turnPositive = true; // start with positive

        // Alternate merge
        while (p < positives.size() && n < negatives.size()) {
            if (turnPositive) {
                arr[i++] = positives.get(p++);
            } else {
                arr[i++] = negatives.get(n++);
            }
            turnPositive = !turnPositive;
        }

        // Append remaining positives
        while (p < positives.size()) {
            arr[i++] = positives.get(p++);
        }

        // Append remaining negatives
        while (n < negatives.size()) {
            arr[i++] = negatives.get(n++);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, -5, 6, -7};
        rearrange(arr);
        System.out.println("Array after rearrangement: " + Arrays.toString(arr));
    }
}
