package com.radhika.programs;

import java.util.*;

public class UnionWithDuplicates {
    public static int[] unionWithDuplicates(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();

        // Add all elements from arr1
        for (int num : arr1) {
            result.add(num);
        }

        // Add all elements from arr2
        for (int num : arr2) {
            result.add(num);
        }

        // Convert list back to array
        int[] union = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            union[i] = result.get(i);
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 3, 4};

        int[] union = unionWithDuplicates(arr1, arr2);
        System.out.println("Union with duplicates: " + Arrays.toString(union));
    }
}

