package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.BucketSort;

class BucketSortTest {

	private static BucketSort bucketSortInstance;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		bucketSortInstance = new BucketSort();
	}


	@Test
	void testFiveElementsArray() {
		float[] fiveElementsArray = {(int) 0.90, (int) 0.7, (int) 0.100, (int) 0.5, (int) 0.45};
		float[] expected = {(int) 0.5, (int) 0.7, (int) 0.45, (int) 0.90, (int) 0.100};
		float[] result = bucketSortInstance.bucketSort(fiveElementsArray);
		
		// expected == result will not work because expected and result rerefence different objects, they will not be equal even if the contents are the same
		assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	void testFifteenElementsArray() {
		float[] fifteenElementsArray = {(int) 0.4, (int) 0.6, (int) 0.1, (int) 0.65, (int) 0.87, (int) 0.23, (int) 0.56, (int) 0.66, (int) 0.14, (int) 0.0, (int) 0.9, (int) 0.34, (int) 0.43, (int) 0.90, (int) 0.123};
		float[] expected = {(int) 0.0, (int) 0.1, (int) 0.4, (int) 0.6, (int) 0.9, (int) 0.14, (int) 0.23, (int) 0.34, (int) 0.43, (int) 0.56, (int) 0.65, (int) 0.66, (int) 0.87, (int) 0.90, (int) 0.123};
		float[] result = bucketSortInstance.bucketSort(fifteenElementsArray);
		
		assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	void testDuplicateValueArray() {
		float[] duplicateValueArray = {(int) 0.1, (int) 0.4, (int) 0.4, (int) 0.5, (int) 0.4};
		float[] expected = {(int) 0.1, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.5};
		float[] result = bucketSortInstance.bucketSort(duplicateValueArray);
		
		assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	void testManyDuplicateValuesArray() {
		float[] duplicateValueArray = {(int) 0.1, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.1};
		float[] expected = {(int) 0.1, (int) 0.1, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4 };
		float[] result = bucketSortInstance.bucketSort(duplicateValueArray);
		
		assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	void testSameValue() {
		float[] duplicateValueArray = {(int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4};
		float[] expected = {(int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4, (int) 0.4 };
		float[] result = bucketSortInstance.bucketSort(duplicateValueArray);
		
		assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	void testOneElement() {
		float[] duplicateValueArray = {(int) 0.4};
		float[] expected = {(int) 0.4};
		float[] result = bucketSortInstance.bucketSort(duplicateValueArray);
		
		assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	void testEmptyArray() {
		float[] duplicateValueArray = {};
		float[] expected = {};
		float[] result = bucketSortInstance.bucketSort(duplicateValueArray);
		
		assertTrue(Arrays.equals(expected, result));
	}


}
