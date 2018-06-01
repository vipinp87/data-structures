package com.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] intArray = {25, -35, 70, -25, 8, 2, -10};
		
		quickSort(intArray, 0, 7);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	private static void quickSort(int[] input, int start, int end) {
		
		if(end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}

	private static int partition(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while(i < j) {
			while(i < j && input[--j] >= pivot);
			input[i] = input[j];
			
			while(i < j && input[++i] <= pivot);
			input[j] = input[i];
		}
		
		input[j] = pivot;
		return j;
	}
}
