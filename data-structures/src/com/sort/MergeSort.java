package com.sort;

public class MergeSort {
	
	private MergeSort() {}
	
	public static void main(String[] args) {
		int[] intArray = {25, -35, 70, -25, 8, 2, -10};
		
		mergeSort(intArray, 0, 7);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
	
	public static void mergeSort(int[] input, int start, int end) {
		if(end - start < 2) {
			return;
		}
		
		int mid = (start + end)/2;
		
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		
		merge(input, start, mid, end);
	}

	private static void merge(int[] input, int start, int mid, int end) {
		if(input[mid -1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		
		while(i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j]? input[i++]: input[j++];
		}
		
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}
}
