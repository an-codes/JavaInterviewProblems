package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 
 Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
 The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 
 
 */

public class BinarySearchApp {
	
	private int low;
	private int high;



	public int binarySearchIterative(ArrayList<Integer> list, int number) {
		// Sort the ArrayList
		Collections.sort(list);
		
		int result = -1;
		int low = 0;
		int high = list.size() - 1;
		int middle;
		
	
		
		for(int i = low; i <= high; i++) {
			
			middle = (low + high) / 2;
			
			// If the value of the search key is equal to the item then return an index of the search key
			if(number == list.get(middle)) {
				result = middle;
			} 
			// If the value of the number is higher than the middle element then search through the upper half of the list
			else if(number > list.get(middle)) {
				low = middle + 1;
				
			}
			// If the value of the number is lower than the middle element then search through the upper half of the list
			else if(number < list.get(middle)) {
				high = middle - 1;
			}
		}
		return result;
	}
	
	
	public boolean checkTheMiddle(int searchedNumber, int middleNumber) {
		boolean result;
		if(searchedNumber == middleNumber) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
	public int binarySearchRecursive(ArrayList<Integer> list, int number, int low, int high) {
		// Sort the ArrayList
		Collections.sort(list);
		
		int result=-1;
		this.low = low;
		this.high = high;
		int middle = ((low + high) / 2);
		
		System.out.print(list.get(middle));
		
			if (low > high) {
			return result;
			} else if(checkTheMiddle(number, list.get(middle)) == true) {
				// If the value of the search key is equal to the item then return an index of the search key
				result = middle;
				return result;
			} else if(number < list.get(middle)) {
				result = binarySearchRecursive(list, number, low, middle-1);
			} else if(number > list.get(middle)) {
				result = binarySearchRecursive(list, number, middle+1, high);
			}
		
			
			
		return result;
	}
	


}
