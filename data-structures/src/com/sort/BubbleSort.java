package com.sort;

public class BubbleSort {

	private BubbleSort() {}
	
	public static void main(String[] args) {
		int[] intArray = {25, -35, 70, -25, 8, 2, -10};
		
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for(int i = 0; i < lastUnsortedIndex; i++) {
				if(intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}
			}
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
	
	private static void swap(int[] intArray, int i, int j) {
		if (i == j) {
			return;
		}
		
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}