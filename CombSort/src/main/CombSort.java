package main;

public class CombSort {
	
	public int getGapLength(int currentGap) {
		// The gap starts with a large value and shrinks by a factor of 1.3 in every iteration until it reaches the value 1
		int newGap;
		newGap = (currentGap*10)/13;
	       
		if (newGap < 1) {
			return 1;
		}
	    	return newGap;
	}
	
	public int[] combSort(int[] arr) {
		int gap = arr.length;
		
		// we set wasSwapped variable to true to get the ball rolling and start the while loop
		boolean wasSwapped = true;
		
		// swap is an auxiliary variable, which when stays false, means that the array is already sorted
		// a gap of one would mean two indices next to each other which means no literal gap between the indices
		
		while (gap != 1 || wasSwapped == true) {
			// while it is neither our first nor last move find a new gap length
            gap = getGapLength(gap);
 
            // reset the wasSwapped variable to then assess whether the variables were actually swapped or not
            wasSwapped = false;
 
            // Compare all elements that are a gap apart
            for (int i=0; i < arr.length-gap; i++) {
            	
            	// if the element on the left is larger than the right element, then swap the items
                if (arr[i] > arr[i+gap]) {
                    int valueI = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = valueI;
 
                    // Set wasSwapped to true again once we swapped the variables
                    wasSwapped = true;
                }
            }
		}
		
		return arr;

	}

}
