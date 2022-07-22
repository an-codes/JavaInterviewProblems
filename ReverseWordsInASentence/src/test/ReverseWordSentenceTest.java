package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ReverseWordSentence;

class ReverseWordSentenceTest {
	
	ReverseWordSentence reverseWordSentence; 

	@BeforeEach
	void setUp() throws Exception {
		reverseWordSentence = new ReverseWordSentence();
	}

	@Test
	void testMyHeadHurts() {
		
		String result = reverseWordSentence.reverseWords("my head hurts");
		String expected = "hurts head my";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	void testLetsPlayGolfTomorrow() {
		
		String result = reverseWordSentence.reverseWords("Let's play golf tomorrow");
		String expected = "tomorrow golf play Let's";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	void testCuppa() {
		
		String result = reverseWordSentence.reverseWords("I'd like a cup of tea please");
		String expected = "please tea of cup a like I'd";
		
		assertEquals(expected, result);
		
	}

}
