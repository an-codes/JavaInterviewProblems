package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.DuplicateCharactersInString;

class DuplicateCharactersInStringTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void canFindDuplicates() {
		HashMap<Character, Integer> charsCount = new HashMap<Character, Integer>();	
		HashMap<Character, Integer> temp = new HashMap<Character, Integer>();	

		
		DuplicateCharactersInString example = new DuplicateCharactersInString();
		temp = example.findDuplicates("ttiiisss");
		
		charsCount.put('s', 3);
		charsCount.put('t', 2);
		charsCount.put('i', 3);
		System.out.println(charsCount);
		System.out.println(temp);

		boolean result = charsCount.equals(temp); 

		
		assertEquals(true, result);
		
	}
	
	
	@Test
	void canFindDuplicatesMixedCase() {
		HashMap<Character, Integer> charsCount = new HashMap<Character, Integer>();	
		HashMap<Character, Integer> temp = new HashMap<Character, Integer>();	

		
		DuplicateCharactersInString example = new DuplicateCharactersInString();
		temp = example.findDuplicates("TtiIisSs");
		
		charsCount.put('s', 3);
		charsCount.put('t', 2);
		charsCount.put('i', 3);
		System.out.println(charsCount);
		System.out.println(temp);

		boolean result = charsCount.equals(temp); 

		
		assertEquals(true, result);
		
	}

}
