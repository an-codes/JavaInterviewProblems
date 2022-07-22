package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ReverseANumber;

class ReverseANumberTest {
	
	ReverseANumber reverseANumber;

	@BeforeEach
	void setUp() throws Exception {
		reverseANumber = new ReverseANumber();
		
	}
	
	
	@Test
	void testIterative123() {
		int expected = 321;
		int result = reverseANumber.reverseNumberIterative(123);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testIterative76589() {
		int expected = 98567;
		int result = reverseANumber.reverseNumberIterative(76589);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testIterative0() {
		int expected = 0;
		int result = reverseANumber.reverseNumberIterative(0);
		
		assertEquals(expected, result);
	}

	
	@Test
	void testIterativeString123() {
		int expected = 321;
		int result = reverseANumber.reverseNumberIterativeString(123);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testIterativeString76589() {
		int expected = 98567;
		int result = reverseANumber.reverseNumberIterativeString(76589);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testIterativeString0() {
		int expected = 0;
		int result = reverseANumber.reverseNumberIterativeString(0);
		
		assertEquals(expected, result);
	}

	@Test
	void testRecursion123() {
		int expected = 321;
		int result = reverseANumber.reverseNumberRecursion(123);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testRecursion76589() {
		int expected = 98567;
		int result = reverseANumber.reverseNumberRecursion(76589);
		
		assertEquals(expected, result);
	}
	
	@Test
	void testRecursion0() {
		int expected = 0;
		int result = reverseANumber.reverseNumberRecursion(0);
		
		assertEquals(expected, result);
	}

}
