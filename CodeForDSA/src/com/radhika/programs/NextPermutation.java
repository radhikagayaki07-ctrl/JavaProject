package com.radhika.programs;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find successor
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap pivot and successor
            swap(nums, i, j);
        }

        // Step 4: Reverse suffix
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        nextPermutation(nums1);
        System.out.println("Next permutation: " + Arrays.toString(nums1));

        int[] nums2 = {3,2,1};
        nextPermutation(nums2);
        System.out.println("Next permutation: " + Arrays.toString(nums2));
    }
}
