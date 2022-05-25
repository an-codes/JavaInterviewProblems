package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.StringPalindrome;

class StringPalindromeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void isAbbaPalindrome() {
		StringPalindrome strPal = new StringPalindrome();
		boolean result = strPal.isStringAPalindrome("abba");
		
		assertEquals(true, result);
	}

	
	@Test
	void isBaloonPalindrome() {
		StringPalindrome strPal = new StringPalindrome();
		boolean result = strPal.isStringAPalindrome("baloon");
		
		assertEquals(false, result);
	}
	
	@Test
	void isAbBaPalindrome() {
		StringPalindrome strPal = new StringPalindrome();
		boolean result = strPal.isStringAPalindrome("AbBa");
		
		assertEquals(true, result); // should fail without str.toLowerCase()
	}
	
	@Test
	void whiteSpacesPalindrome() {
		StringPalindrome strPal = new StringPalindrome();
		boolean result = strPal.isStringAPalindrome("Able was I ere I saw Elba");
		
		assertEquals(true, result); // should fail without the white space replacement
	}
}
