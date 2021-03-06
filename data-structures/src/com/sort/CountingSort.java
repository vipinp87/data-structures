package com.sort;

public class CountingSort {

	public static void main(String[] args) {
		int[] intArray = {4, 2, 6, 8, 3, 2, 7, 9, 10, 4, 6, 3};
		
		countingSort(intArray, 1, 10);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void countingSort(int[] input, int min, int max) {
		int[] countArray = new int[max - min + 1];
		
		for(int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}
		
		int j = 0;
		for(int i = min; i <= max; i++) {
			while(countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
	}

}
