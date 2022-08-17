package main;

import java.util.Arrays;

public class CombSortApp {

	public static void main(String[] args) {

		int[] arr = {5,2,1,6,0,3,4,7, -5, -99, 99};
		
		CombSort combSort = new CombSort();
		
		combSort.combSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
