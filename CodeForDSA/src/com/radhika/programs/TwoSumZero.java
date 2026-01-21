package com.radhika.programs;

import java.util.*;

public class TwoSumZero {
    public static void findPairs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(-num)) {
                System.out.println("Pair with 0 sum: (" + num + ", " + -num + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, -2, 3, -3, 4, -4, 5};
        findPairs(arr);
    }
}

