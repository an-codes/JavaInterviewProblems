package main;

public class InterpolationSearch {
	
	public int findProbePosition(int[] arr, int targetNumber, int low, int high) {
		/*
		probe: the new probe position that will be used for the searching purpose by "interpolationSearch" method
		low: the index of an element the farthest on the left side of the array "arr"
		high: the index of an element the farthest on the right side of the array "arr"
		arr[]: the original array we started with and are working on
		targetNumber: the element that we are looking for
		 */
		int probe;
		
		/* I am adding that condition here in case there is an array that has only one number from start to finish,
		   in which case "arr[high] - arr[low]" would throw an error while diving by 0 */
		if (arr[low] == arr[high]) {
			probe = low;
			return probe;
		}
		
		
		probe = low + ( ( (high - low) * (targetNumber - arr[low]) ) / (arr[high] - arr[low]));
		return probe;
	}

	public int interpolationSearch(int[] arr, int targetNumber, int lowIndex, int highIndex) {
		
		int result = -1;


		if (lowIndex <= highIndex && targetNumber >= arr[lowIndex] && targetNumber <=arr[highIndex]) {
		int probeIndex = findProbePosition(arr, targetNumber, lowIndex, highIndex);
		
		if(arr[probeIndex] == targetNumber) {
			result = probeIndex;
		} else if(arr[probeIndex] > targetNumber) {
			interpolationSearch(arr, targetNumber, lowIndex, probeIndex-1);
		} else if(arr[probeIndex] < targetNumber) {
			interpolationSearch(arr, targetNumber, probeIndex+1, highIndex);
		}
		}
		
		return result;
		
	}
	
}
