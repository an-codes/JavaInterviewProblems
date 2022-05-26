package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.ArmstrongNumberCheck;

class ArmstrongNumberTest {

	private ArmstrongNumberCheck checkNo;

	@BeforeEach
	void setUp() throws Exception {
		checkNo = new ArmstrongNumberCheck();
	}

	@Test
	void is153Armstrong() {
		boolean result = checkNo.isItArmstrongNumber(153);
		assertEquals(true, result);

	}

	@Test
	void is243Armstrong() {
		boolean result = checkNo.isItArmstrongNumber(243);
		assertEquals(false, result);
	}
	
	@Test
	void is54748Armstrong() {
		boolean result = checkNo.isItArmstrongNumber(54748);
		assertEquals(true, result);
	}
	
	@Test
	void is9474Armstrong() {
		boolean result = checkNo.isItArmstrongNumber(9474);
		assertEquals(true, result);
	}
	
	@Test
	void is22Armstrong() {
		boolean result = checkNo.isItArmstrongNumber(22);
		assertEquals(false, result);
	}

}
