package main;

public class JumpSearch {
	
	public int linearSearch(int[] arr, int low, int targetNumber) {
		int result=-1;
		for (int i = low; i < arr.length; i++) {
			if(arr[i] == targetNumber) {
				result = i;
			}
		}
		return result;
	}
	
	public int jumpSearch (int[] arr, int targetNumber) {
		int result = -1;
		// The block size is √arr.length
		int jump = (int)Math.floor(Math.sqrt(arr.length));
		int low = 0;
		
		for(int i = 0; i < arr.length; i = i+jump) {
			/* we loop through the array with "i+jump" increase, until we either find an element (e.g. in the first if statement),
			 or we find a block where the said element resides. In the latter case we will have a new 'low' value to start from and
			 we can loop linearly from low to the end of the array in order to find the desired value */
			
			if (arr[i] == targetNumber) {
				result = i;
				break;
			} else if (arr[i] < targetNumber) {
				low = i;
			} else if (arr[i] > targetNumber) {
				/* This 'else if' block contains a linearSearch and then break,
				  because if there was an array with the same numbers e.g. [1, 1, 1],
				  it would return an index of the last number if the loop wasn't broken in here
				*/
				result = linearSearch(arr, low, targetNumber);
				break;
			}	
		}
		
		return result;
		
	}

}
