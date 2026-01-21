package com.radhika.programs;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // index for placing non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k; // new length
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 3};
        int val = 3;

        int newLength = removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.println("Array after removal: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
