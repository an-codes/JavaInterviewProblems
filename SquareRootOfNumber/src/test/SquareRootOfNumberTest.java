package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.SquareRootOfNumber;

class SquareRootOfNumberTest {
	
	SquareRootOfNumber test;

	@BeforeEach
	void setUp() throws Exception {
		test = new SquareRootOfNumber();
	}

	@Test
	void canFindSimpleSqrt() {
		double testResult = test.findSquareRoot(25, 0.00001);
		double expectedResult = Math.sqrt(25);
		
		assertEquals(expectedResult, testResult);
	}
	
	
	@Test
	void canFindRandomSqrt() {
		double testResult = test.findSquareRoot(497, 0.00001);
		testResult = Math.round(testResult*100.0)/100.0;
		double expectedResult = Math.sqrt(497);
		expectedResult = Math.round(expectedResult*100.0)/100.0;

		
		assertEquals(expectedResult, testResult);
	}
	
	
	@Test
	void canFindLargeSqrt() {
		double testResult = test.findSquareRoot(4971, 0.00001);
		testResult = Math.round(testResult*100.0)/100.0;
		double expectedResult = Math.sqrt(4971);
		expectedResult = Math.round(expectedResult*100.0)/100.0;

		
		assertEquals(expectedResult, testResult);
	}

}
