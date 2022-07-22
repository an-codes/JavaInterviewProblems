package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.CheckIfAnagram;

class CheckIfAnagramTest {

	private static CheckIfAnagram ifAnagram;


	@BeforeEach
	void setUp() throws Exception {
		ifAnagram = new CheckIfAnagram();
	}

	@Test
	void testLowCaseNoSpaces() {
		String str1 = "god";
		String str2 = "dog";
		boolean result = ifAnagram.checkIfAnagram(str1, str2);
		
		assertTrue(result);
	}
	
	@Test
	void testUpperCaseWhiteSpaces() {
		String str1 = "g od";
		String str2 = "DOg";
		boolean result = ifAnagram.checkIfAnagram(str1, str2);
		
		assertTrue(result);
	}
	
	@Test
	void testMeatTeam() {
		String str1 = "meat";
		String str2 = "team";
		boolean result = ifAnagram.checkIfAnagram(str1, str2);
		
		assertTrue(result);
	}

	
	@Test
	void testMeatDog() {
		String str1 = "meat";
		String str2 = "dog";
		boolean result = ifAnagram.checkIfAnagram(str1, str2);
		
		assertFalse(result);
	}
	
	@Test
	void testSaoirseRonan() {
		String str1 = "Saoirse Ronan";
		String str2 = "rare as onions";
		boolean result = ifAnagram.checkIfAnagram(str1, str2);
		
		assertTrue(result);
	}
	
	@Test
	void testMadonnaLouiseCiccone() {
		String str1 = "Madonna Louise Ciccone";
		String str2 = "one cool dance musician";
		boolean result = ifAnagram.checkIfAnagram(str1, str2);
		
		assertTrue(result);
	}

}
