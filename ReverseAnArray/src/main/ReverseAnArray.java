package main;

public class ReverseAnArray {

	
	public int [] reverseAnArray(int [] arr) {
		int[] arrReversed = new int[arr.length];
		
		for(int i = arr.length-1; i >=0; i--) {
			arrReversed[arr.length-1-i] = arr[i];
		}
		
		return arrReversed;	
	}
}
