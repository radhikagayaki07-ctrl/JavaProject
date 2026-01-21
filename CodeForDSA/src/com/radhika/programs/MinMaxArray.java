package com.radhika.programs;

public class MinMaxArray {
	    public static void main(String[] args) {
	        int[] arr = {12, 5, 8, 130, 45, 2, 99};

	        int min = arr[0];
	        int max = arr[0];

	        // Traverse the array
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }
	}

