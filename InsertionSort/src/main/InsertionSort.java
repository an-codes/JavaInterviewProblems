package main;

import java.util.Arrays;

public class InsertionSort {
	
	public int[] insertionSort(int[] arr) {
		int keyValue, j;
		
		for(int i = 1; i < arr.length; ++i) {
			// i - initial index of the key value we are sorting atm
			
			/*
			 outer loop (i) goes left from 1 to the right end
			 and inner loop (j) goes right from i element excluding
			 (so essentially from i-1 including - we want to compare element i to the element on the left)
			 to the left
			 */
			
			keyValue = arr[i];
			j = i - 1;		
			
			while (j >= 0 && keyValue < arr[j] ) {
				/*  NOTE: put "j >= 0" condition first because when "keyValue < arr[j]" is placed first AND when j = -1 then "keyValue < arr[j]" (so: keyValue < arr[-1]) will throw an excepton
				    loop through, while our keyValue (on index i) is smaller than the value from an index before (on index j = i -1)
					AND keyValue's index is not less than 0 
				*/
				
				arr[j+1] = arr[j];
				
				// now substract one from our current j so we can go to the left and check if out keyValue is less than the next left value
				j--;
			}
			arr[j+1] = keyValue;
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}
}
