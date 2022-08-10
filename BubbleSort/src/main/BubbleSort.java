package main;

import java.util.Arrays;

public class BubbleSort {
	
	public int[] bubbleSort(int[] arr) {
		
		
		
		/*
		 Sorting an array in an ascending order will take a few iterations (depending on the case).
		 
		 QUESTION: This method has to repeat the code below but how many times?  
		 ANSWER: We can keep track of the swaps - whether an iteration swapped any variables. If yes then go on another time, if not we can consider an array sorted.
		 Idea by Coding with John https://www.youtube.com/watch?v=g8qeaEd2jTc
		 */
		boolean didItSwap = true;
		
		while(didItSwap) {
			
			didItSwap = false;
			
		for(int i = 0; i < arr.length-1; i++) {
			/* "i < arr.length-1" because we will compare an element i withe the following element,
			so we do not want the loop to go to the last element as there would not be anything to compare it with and it would be 'out of bounds' */
			
			if(arr[i] > arr[i+1]) {
				didItSwap = true;
				
				//create variables (can just use "temp")
				int valueI = arr[i];
				int valueI1 = arr[i+1];
				
				//swap
				arr[i] = valueI1;
				arr[i+1] = valueI;
			}
		}
	}
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}

}
