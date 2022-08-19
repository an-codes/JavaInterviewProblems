package main;

import java.util.Collections;
import java.util.Vector;

public class BucketSort {
	
	public float[] bucketSort(float[] arr) {
		int arrLength = arr.length;
		int bucketIndex = 0;
		
		// base case
		if(arrLength <= 0) {
			return arr;
		}
		
		// the only case left: arrLength > 0
		// create buckets a.k.a a vector of vectors of floats (as many buckets as there are elements)
	
        @SuppressWarnings("unchecked")
		Vector<Float>[] buckets = new Vector[arrLength];
        
        for (int i = 0; i < arrLength; i++) {
            buckets[i] = new Vector<Float>();
        }

		// place array elements in the correct buckets
          for (int i = 0; i < arrLength; i++) {
            float floatIndex = arr[i] * arrLength;
            bucketIndex = (int)floatIndex;
            buckets[bucketIndex].add(arr[i]);
            
        }

          
        // sort the elements within the buckets by collections
        // the sort can be also done either by insertion sort/ other suitable sorting algorithm/ or recursion
          for (int i = 0; i < arrLength; i++) {
              Collections.sort(buckets[i]);
          }
          
       // recursive
          for (int i = 0; i < arrLength; i++) {
              
          }
        
       // concatenate the buckets the buckets
          int index = 0;
          for (int i = 0; i < arrLength; i++) {
              for (int j = 0; j < buckets[i].size(); j++) {
                  arr[index++] = buckets[i].get(j);
              }
          }
		return arr;
	}
	
}
