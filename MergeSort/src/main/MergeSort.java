package main;

import java.util.Arrays;

public class MergeSort {
	
	// 2-WAY MERGE METHOD
	public void mergeTwoArrays(int[] arr, int leftIndex, int midIndex, int rightIndex) {
		// we want to merge two arrays which sizes are sizeArrLeft and sizeArrRight
		// we will loop through arrLeft, arrRight and arr which will be the overwritten final sorted array 
		
		
		 	int sizeArrLeft = midIndex - leftIndex + 1;
	        int sizeArrRight = rightIndex - midIndex;
	 
	        /* arrLeft and arrRight are temporary arrays to which we will copy the left and right parts
	        from the main arr (boundaries are indicated by sizeArrLeft and sizeArrRight) */
	        int arrLeft[] = new int[sizeArrLeft];
	        int arrRight[] = new int[sizeArrRight];
	 
	        // copy
	        for (int i = 0; i < sizeArrLeft; ++i)
	        	arrLeft[i] = arr[leftIndex + i];
	        for (int j = 0; j < sizeArrRight; ++j)
	        	arrRight[j] = arr[midIndex + 1 + j];
	        
	        
	        // merge temporary arrays (sizeArrLeft and sizeArrRight)
		int i = 0, j = 0, k = leftIndex;


		
		while(i < sizeArrLeft && j < sizeArrRight) {
			if(arrLeft[i] < arrRight[j]) {
				arr[k] = arrLeft[i];
				i++;
				k++;
			} else if(arrLeft[i] > arrRight[j]) {
				arr[k] = arrRight[j];
				j++;
				k++;
			} else if (arrLeft[i] == arrRight[j]) {
				j++;
				k++;
			}
		}
		
		// for-loop for when we finish one array and just need to copy the rest of the other one
		// Copy the remaining elements from array1
		for(; i < sizeArrLeft; i++) {
			arr[k++] = arrLeft[i];
		}
		
		// Copy the remaining elements from array2
		for(; j < sizeArrRight; j++) {
			arr[k++] = arrRight[j];
		}
	}
	
	
	public int[] mergeSort(int[] arr, int leftIndex, int rightIndex) {
		// left and right index can also be called low and high elements
		
		int midIndex;
				
		if (leftIndex < rightIndex) {
			
			midIndex = (leftIndex + rightIndex)/2;
			mergeSort(arr, leftIndex, midIndex);
			mergeSort(arr, midIndex+1, rightIndex);

			mergeTwoArrays(arr, leftIndex, midIndex, rightIndex);
			
		}
		return arr;
	}

}

