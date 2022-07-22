import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseAnArrayInPlaceTest {
	
	ReverseAnArrayInPlace reverseInstance;

	@BeforeEach
	void setUp() throws Exception {
		
		reverseInstance =  new ReverseAnArrayInPlace();
	}

	@Test
	void testCostaCoffee() {

		String str = "CostaCoffee";
		String expected = "eeffoCatsoC";

		boolean result = reverseInstance.reverseInPlace(str).equals(expected);
		
		assertEquals(true, result);
		
	}
	
	@Test
	void testLoveMyLife() {

		String str = "I love my life";
		String expected = "efil ym evol I";

		boolean result = reverseInstance.reverseInPlace(str).equals(expected);
		
		assertEquals(true, result);
		
	}
	
	@Test
	void testHappyHippo() {

		String str = "Happy Hippo";
		String expected = "oppiH yppaH";

		boolean result = reverseInstance.reverseInPlace(str).equals(expected);
		
		assertEquals(true, result);
		
	}

}
