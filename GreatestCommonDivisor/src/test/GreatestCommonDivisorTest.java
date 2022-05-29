package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.GreatestCommonDivisor;

class GreatestCommonDivisorTest {

	GreatestCommonDivisor testGCD;
	
	@BeforeEach
	void setUp() throws Exception {
		testGCD = new GreatestCommonDivisor();
	}

	@Test
	void findGCDSubtraction() {
		
		int result = testGCD.findGreatesCommonDivisorSubtraction(5, 10);
		System.out.println(result);
		
		assertEquals(5, result);
	}
	
	
	@Test
	void findBigDifferenceGCDSubtraction() {
		
		int result = testGCD.findGreatesCommonDivisorSubtraction(20, 2);
		System.out.println(result);
		
		assertEquals(2, result);
	}
	
	
	@Test
	void findLargeGCDSubtraction() {
		
		int result = testGCD.findGreatesCommonDivisorSubtraction(456, 1266);
		System.out.println(result);
		
		assertEquals(6, result);
	}
	
	
	@Test
	void findVeryLargeGCDSubtraction() {
		
		int result = testGCD.findGreatesCommonDivisorSubtraction(4540, 1896);
		System.out.println(result);
		
		assertEquals(4, result);
	}
	
	
	@Test
	void findGCDDivision() {
		
		int result = testGCD.findGreatesCommonDivisorDivision(5, 10);
		System.out.println(result);
		
		assertEquals(5, result);
	}
	
	
	@Test
	void findBigDifferenceGCDDivision() {
		
		int result = testGCD.findGreatesCommonDivisorDivision(20, 2);
		System.out.println(result);
		
		assertEquals(2, result);
	}
	
	
	@Test
	void findLargeGCDDivision() {
		
		int result = testGCD.findGreatesCommonDivisorDivision(456, 1266);
		System.out.println(result);
		
		assertEquals(6, result);
	}
	
	
	@Test
	void findVeryLargeGCDDivision() {
		
		int result = testGCD.findGreatesCommonDivisorDivision(4540, 1896);
		System.out.println(result);
		
		assertEquals(4, result);
	}

}
