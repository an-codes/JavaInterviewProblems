package main;

import java.util.Arrays;

public class SelectionSort {

	
	public int[] selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int iElement = arr[i];
			int minElIndex = i;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j] < arr[minElIndex]) {
					minElIndex = j;
				}
			}
			
			arr[i] = arr[minElIndex]; 
			arr[minElIndex] = iElement;
			}
		System.out.println(Arrays.toString(arr));
		return arr;
		}
	}


