package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ReverseStringApp;

class ReverseStringTest {
	
	ReverseStringApp app;

	@BeforeEach
	void setUp() throws Exception {
		app = new ReverseStringApp();
	}

	@Test
	void buletReverse() {
		
		String result = app.reverseString("bulet");
		
		assertEquals("telub", result);
	}
	
	
	@Test
	void horseReverse() {
		
		String result = app.reverseString("horse");
		
		assertEquals("esroh", result);
	}
	
	
	@Test
	void pancakeReverse() {
		
		String result = app.reverseString("pancake");
		
		assertEquals("ekacnap", result);
	}

}
