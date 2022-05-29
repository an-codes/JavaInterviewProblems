package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ReverseAString;

class ReverseAStringTest {

	ReverseAString test;
	
	@BeforeEach
	void setUp() throws Exception {
		test = new ReverseAString();
	}

	@Test
	void reverseShortString() {
		String result = test.reverseAString("sleepy");
		String expected = "ypeels";
		
		assertEquals(expected, result);
	}
	
	
	@Test
	void reverseLongString() {
		String result = test.reverseAString("I am sleepy and hungry, please feed me spaghetti!");
		String expected = "!ittehgaps em deef esaelp ,yrgnuh dna ypeels ma I";
		
		assertEquals(expected, result);
	}

}
