package main;

public class QuickSort {
	
	public static void swapTwoElements(int[] arr, int i, int j) {
		// i and j are indices
		// swap values under i and j indices
		// also, move the pointers towards the middle
		
		int iValue = arr[i];
		arr[i] = arr[j];
		arr[j] = iValue;
		i++;
		j--;
	}
	
	
	
	public static int partition(int[] arr, int leftIndex, int rightIndex) {
		/*
		 This function chooses and sets the partition (a partition element is called a pivot) against which all other elements are compared and then positioned.
		 Every element less than pivot should be placed before every element larger than pivot. 
		 
		 With every single pass of the partition function, a new partition is decided and placed.
		 Every time that a partition function is called is decides and places a new partition that is always the last element of the array (in this example, but in general it can be any element).
	
		 */
		
		
		/*
		 Set the pivot element. The pivot element here is the last element
		 It can also be a random element, first one or the middle one
		 */
		int pivot = arr[rightIndex];
		
		// set partition index to the starting index (leftIndex) and this way it scans all elements until arr.length-1
		int pIndex = leftIndex;
		
		for(int i = leftIndex; i < rightIndex; i++) {
			if(arr[i] <= pivot) {
				swapTwoElements(arr, i, pIndex);
				pIndex++;
			}
		}
		swapTwoElements(arr, pIndex, rightIndex);
		return pIndex;
	}
	
	
	
	public int[] quickSort(int[] arr, int leftIndex, int rightIndex) {
		// Out of range/invalid/ 1-el array
		// We can exit the algorithm only when we have one element in the segment
		if(leftIndex >= rightIndex) { return arr;} //base case
		
		
		if(leftIndex < rightIndex) {
			int partitionIndex = partition(arr, leftIndex, rightIndex);
			
			/* once the first partition is set in the correct place, we need to work on the array segments before and after partition*/
			//quick sort on the left side of the partition
			quickSort(arr, leftIndex, partitionIndex-1); 
			
			//quick sort on the right side of the partition
			quickSort(arr, partitionIndex+1, rightIndex);

		}
		return arr;
		
	}

}
