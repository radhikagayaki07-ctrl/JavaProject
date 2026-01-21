package com.radhika.programs;

public class ReverseAnArray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int start=0;
		int end=arr.length-1;
		//swap
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		//print reversed array
		System.out.println("The reversed array is");
		for (int num : arr) {
            System.out.print(num + " ");
        }

		}
	
}
