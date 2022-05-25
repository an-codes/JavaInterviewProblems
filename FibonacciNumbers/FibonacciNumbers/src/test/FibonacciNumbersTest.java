package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.FibonacciNumbers;

class FibonacciNumbersTest {


	@Test
	void returnThirdElement() {
		FibonacciNumbers series = new FibonacciNumbers();
		assertEquals(1, series.FibonacciSeriesCreate(3));
	}

	@Test
	void returnFifthElement() {
		FibonacciNumbers series = new FibonacciNumbers();
		assertEquals(3, series.FibonacciSeriesCreate(5));
	}
	
	@Test
	void returnTenthElement() {
		FibonacciNumbers series = new FibonacciNumbers();
		assertEquals(34, series.FibonacciSeriesCreate(10));
	}

/*
 * Tests for FibNumbers.java
	@Test
	void returnThirdElement() {
		FibonacciNumbers series = new FibonacciNumbers();
		assertEquals(1, series.fibSeq(3));
	}

	@Test
	void returnFifthElement() {
		FibonacciNumbers series = new FibonacciNumbers();
		assertEquals(3, series.fibSeq(5));
	}
	
	@Test
	void returnTenthElement() {
		FibonacciNumbers series = new FibonacciNumbers();
		assertEquals(34, series.fibSeq(10));
	}
	
*/
	
}
