package main;


public class ExponentialSearch {
	
	
	public boolean checkTheMiddle(int searchedNumber, int middleNumber) {
		boolean result;
		if(searchedNumber == middleNumber) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	public int binarySearch(int[] arr, int number, int low, int high) {
		
		int result=-1;
		int middle = ((low + high) / 2);
		
		System.out.print(arr[middle]);
		
			if (low > high) {
			return result;
			} else if(checkTheMiddle(number, arr[middle]) == true) {
				// If the value of the search key is equal to the item then return an index of the search key
				result = middle;
				return result;
			} else if(number < arr[middle]) {
				result = binarySearch(arr, number, low, middle-1);
			} else if(number > arr[middle]) {
				result = binarySearch(arr, number, middle+1, high);
			}
		return result;
	}
	
	public int exponentialSearch(int[] arr, int targetNumber) {
		int result = -1;
		
		if(arr.length != 0) {
		
			for(int i = 1; i < arr.length; i = i*2) {
				
				if(arr[0] == targetNumber) {
					result = 0;
					break;
				}
				
				if (arr[i] == targetNumber) {
					result = i;
				}
				
				if (arr[i] > targetNumber) {
					result = binarySearch(arr, targetNumber, i/2, i);
				}
			}
		}
		return result;
		
	}

}
