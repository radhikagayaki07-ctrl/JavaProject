package com.radhika.programs;

import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1; // guaranteed majority exists, so this won't happen
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println("Majority element: " + majorityElement(nums));
    }
}

