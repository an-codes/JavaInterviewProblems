package main;

import java.util.Arrays;

public class BucketSortApp {

	public static void main(String[] args) {
		
		float[] arr = {(float) 0.05, (float) 0.1, (float) 0.8, (float) 0.9, (float) 0.054, (float) 0.29};
		
		BucketSort bucketSort = new BucketSort();

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(bucketSort.bucketSort(arr)));
	}

}
