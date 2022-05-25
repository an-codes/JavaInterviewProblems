package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.IntegerPalindrome;
import main.StringPalindrome;

class PalindromeTest {

	StringPalindrome strPal;
	boolean result;

	@BeforeEach
	void setUp() throws Exception {
		strPal = new StringPalindrome();

	}

	@Test
	void isAbbaPalindrome() {
		result = strPal.isStringAPalindrome("abba");
		
		assertEquals(true, result);
	}

	
	@Test
	void isBaloonPalindrome() {
		result = strPal.isStringAPalindrome("baloon");
		
		assertEquals(false, result);
	}
	
	@Test
	void isAbBaPalindrome() {
		result = strPal.isStringAPalindrome("AbBa");
		
		assertEquals(true, result); // should fail without str.toLowerCase()
	}
	
	@Test
	void whiteSpacesPalindrome() {
		result = strPal.isStringAPalindrome("Able was I ere I saw Elba");
		
		assertEquals(true, result); // should fail without the white space replacement
	}
	
	@Test
	void longestEverydayUsePalindrome() {
		result = strPal.isStringAPalindrome("saippuakivikauppias");
		
		assertEquals(true, result);
	}
	
	@Test
	void integerNotPalindrome() {
		IntegerPalindrome intPal = new IntegerPalindrome ();
		result = intPal.isIntegerPalindrome(1234);
		
		assertEquals(false, result);
	}
	
	@Test
	void isIntegerPalindrome() {
		IntegerPalindrome intPal = new IntegerPalindrome ();
		result = intPal.isIntegerPalindrome(5005);
		
		assertEquals(true, result);
	}
}
