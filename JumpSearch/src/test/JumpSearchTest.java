package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.JumpSearch;

class JumpSearchTest {
	JumpSearch jumpSearch;

	@BeforeEach
	void setUp() throws Exception {
		jumpSearch = new JumpSearch();
	}

	@Test
	void testFind6() {
		int[] arr = {1, 5, 9, 11, 4, 6, 2};
		int number = 6;
		int expected = 5;
		int result = jumpSearch.jumpSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFind1MultipleOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 1, 1, 1, 1, 1};
		int number = 1;
		int expected = 0;
		int result = jumpSearch.jumpSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindEmptyArr() {
		// should return only the first occurrence
		int[] arr = {};
		int number = 1;
		int expected = -1;
		int result = jumpSearch.jumpSearch(arr, number);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testFindNoOccurrence() {
		// should return only the first occurrence
		int[] arr = {1, 5, 9, 11, 4, 6, 2};
		int number = 3;
		int expected = -1;
		int result = jumpSearch.jumpSearch(arr, number);
		
		assertEquals(expected, result);
	}


}
