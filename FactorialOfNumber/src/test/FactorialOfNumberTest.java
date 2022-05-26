package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.FactorialOfNumberApp;

class FactorialOfNumberTest {
	
	FactorialOfNumberApp factorial;

	@BeforeEach
	void setUp() throws Exception {
		factorial = new FactorialOfNumberApp();
	}

	@Test
	void factorialOf3() {
		int result = factorial.createFactorial(3);
		
		assertEquals(6, result);
	}
	
	@Test
	void factorialOf13() {
		int result = factorial.createFactorial(9);
		
		assertEquals(362880, result);
	}
	
	@Test
	void factorialOf5() {
		int result = factorial.createFactorial(5);
		
		assertEquals(120, result);
	}

}
