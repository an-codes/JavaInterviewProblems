package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ExponentialSearch;

class ExponentialSearchTest {

	ExponentialSearch exponentialSearch;

	@BeforeEach
	void setUp() throws Exception {
		exponentialSearch = new ExponentialSearch();
	}

	@Test
	void testFind6() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int number = 6;
		int expected = 5;
		int result = exponentialSearch.exponentialSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFind1MultipleOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 1, 1, 1, 1, 1};
		int number = 1;
		int expected = 0;
		int result = exponentialSearch.exponentialSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindEmptyArr() {
		// should return only the first occurrence
		int[] arr = {};
		int number = 1;
		int expected = -1;
		int result = exponentialSearch.exponentialSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindNoOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 5, 9, 13, 17, 21, 25};
		int number = 3;
		int expected = -1;
		int result = exponentialSearch.exponentialSearch(arr, number);
		
		assertEquals(expected, result);
	}

}
