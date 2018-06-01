package com.sort;

public class InsertionSort {

	private InsertionSort() {}
	
	public static void main(String[] args) {
		int[] intArray = {25, -35, 70, -25, 8, 2, -10};
		
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];
			
			int i = firstUnsortedIndex;
			
			while(i > 0 && intArray[i - 1] > newElement) {
				intArray[i] = intArray[i - 1];
				i--;
			}
			
			intArray[i] = newElement;
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
}
