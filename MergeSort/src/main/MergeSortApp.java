package main;

import java.util.Arrays;

public class MergeSortApp {

	public static void main(String[] args) {

		int[] arr = {5,2,1,6,0,3,4,7};
		int leftIndex = 0;
		int rightIndex = arr.length-1;
		
		MergeSort mergeSort = new MergeSort();
		
		mergeSort.mergeSort(arr, leftIndex, rightIndex);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
