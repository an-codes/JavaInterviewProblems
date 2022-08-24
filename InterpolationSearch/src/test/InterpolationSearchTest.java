package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.InterpolationSearch;

class InterpolationSearchTest {
	InterpolationSearch interpolationSearch;

	@BeforeEach
	void setUp() throws Exception {
		interpolationSearch = new InterpolationSearch();
	}

	@Test
	void testFind6() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int lowIndex = 0;
		int highIndex = arr.length-1;
		int number = 6;
		int expected = 5;
		int result = interpolationSearch.interpolationSearch(arr, number, lowIndex, highIndex);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFind1MultipleOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 1, 1, 1, 1, 1};
		int lowIndex = 0;
		int highIndex = arr.length-1;
		int number = 1;
		int expected = 0;
		int result = interpolationSearch.interpolationSearch(arr, number, lowIndex, highIndex);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindEmptyArr() {
		// should return only the first occurrence
		int[] arr = {};
		int lowIndex = 0;
		int highIndex = arr.length-1;
		int number = 1;
		int expected = -1;
		int result = interpolationSearch.interpolationSearch(arr, number, lowIndex, highIndex);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindNoOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 5, 9, 13, 17, 21, 25};
		int lowIndex = 0;
		int highIndex = arr.length-1;
		int number = 3;
		int expected = -1;
		int result = interpolationSearch.interpolationSearch(arr, number, lowIndex, highIndex);
		
		assertEquals(expected, result);
	}



}
