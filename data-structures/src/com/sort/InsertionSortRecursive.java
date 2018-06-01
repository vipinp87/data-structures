package com.sort;

public class InsertionSortRecursive {
	
	private InsertionSortRecursive() {}
	
	public static void main(String[] args) {
		int[] intArray = {25, -35, 70, -25, 8, 2, -10};
		
		insertionSort(intArray, intArray.length);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
	
	private static void insertionSort(int[] input, int elements) {
		if(elements < 2) {
			return;
		}
		
		insertionSort(input, elements - 1);
		
		int newElement = input[elements - 1];
		
		int i = elements - 1;
		
		while(i > 0 && input[i - 1] > newElement) {
			input[i] = input[i - 1];
			i--;
		}
		
		input[i] = newElement;
		
		System.out.println("Result of call when elements are " + elements);
		for(int j = 0; j < input.length; j++) {
			System.out.print(input[j] + ", ");
		}
		System.out.println();
		System.out.println("========================================");
	}
}
