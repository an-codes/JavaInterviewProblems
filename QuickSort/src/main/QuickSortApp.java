package main;

import java.util.Arrays;

public class QuickSortApp {

	public static void main(String[] args) {

		QuickSort quickSortInstance = new QuickSort();
		int[] arr = { 7, 4, 6, 9, 2, 0, 3, 1, 5, 8 };
		int leftIndex = 0;
		int rightIndex = arr.length-1;
				
		quickSortInstance.quickSort(arr, leftIndex, rightIndex);
		
		System.out.println(Arrays.toString(arr));

	}

}
