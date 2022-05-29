package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ReverseAnArray;

class ReverseAnArrayTest {

	ReverseAnArray test;
	
	@BeforeEach
	void setUp() throws Exception {
		test = new ReverseAnArray();
	}

	@Test
	void reverseShortArray() {
		int[] intArray = new int[]{ 1,2,8,5 };
		int[] testResult = test.reverseAnArray(intArray);
		
		int[] result = new int[]{ 5,8,2,1 };
		
		boolean expected = Arrays.equals(result, testResult);
		
		assertEquals(true, expected);
	}
	
	@Test
	void reverseLongArray() {
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		int[] testResult = test.reverseAnArray(intArray);
		
		int[] result = new int[]{ 10,9,8,7,6,5,4,3,2,1 };
		
		boolean expected = Arrays.equals(result, testResult);
		
		assertEquals(true, expected);
	}
	
	@Test
	void reverseOneLengthArray() {
		int[] intArray = new int[]{ 27 };
		int[] testResult = test.reverseAnArray(intArray);
		
		int[] result = new int[]{ 27 };
		
		boolean expected = Arrays.equals(result, testResult);
		
		assertEquals(true, expected);
	}

}
