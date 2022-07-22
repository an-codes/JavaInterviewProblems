package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.FirstNonRepeatedChar;

class FirstNonRepeatedCharTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	FirstNonRepeatedChar firstNonRepeatedChar;

	@BeforeEach
	void setUp() throws Exception {
		firstNonRepeatedChar = new FirstNonRepeatedChar();
	}

	@Test
	void testEclipseWorkspace() {
		char expected = 'l';
		char result = firstNonRepeatedChar.findFirstNonRepeatedChar("eclipse workspace");
	
		assertEquals(expected, result);
	}
	
	@Test
	void testStress() {
		char expected = 't';
		char result = firstNonRepeatedChar.findFirstNonRepeatedChar("stress");
	
		assertEquals(expected, result);
	}
	
	@Test
	void testStressStress() {
		char expected = 0;
		char result = firstNonRepeatedChar.findFirstNonRepeatedChar("stress STRess");
	
		assertEquals(expected, result);
	}
	
	

}
