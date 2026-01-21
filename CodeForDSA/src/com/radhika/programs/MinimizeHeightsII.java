package com.radhika.programs;

import java.util.Arrays;

public class MinimizeHeightsII {
    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
   
        int ans = arr[n-1] - arr[0]; // initial difference

        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i+1] - k);
            int max = Math.max(largest, arr[i] + k);

            if (min < 0) continue; // heights can't be negative

            ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        int n = arr.length;

        System.out.println("Minimum difference: " + getMinDiff(arr, n, k));
    }
}

