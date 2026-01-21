package com.radhika.programs;

import java.util.HashSet;

public class CheckDoubleExists {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
        int[] arr2 = {7, 1, 14, 11};

        System.out.println(checkIfExist(arr1)); // true
        System.out.println(checkIfExist(arr2)); // true (14 is double of 7)
    }
}


