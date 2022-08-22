package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.LinearSearch;

class LinearSearchTest {
	LinearSearch linearSearch;

	@BeforeEach
	void setUp() throws Exception {
		linearSearch = new LinearSearch();
	}

	@Test
	void testFind6() {
		int[] arr = {1, 5, 9, 11, 4, 6, 2};
		int number = 6;
		int expected = 5;
		int result = linearSearch.linearSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFind1MultipleOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 1, 1, 1, 1, 1};
		int number = 1;
		int expected = 0;
		int result = linearSearch.linearSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindEmptyArr() {
		// should return only the first occurrence
		int[] arr = {};
		int number = 1;
		int expected = -1;
		int result = linearSearch.linearSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindNoOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 5, 9, 11, 4, 6, 2};
		int number = 3;
		int expected = -1;
		int result = linearSearch.linearSearch(arr, number);
		
		assertEquals(expected, result);
	}

}
