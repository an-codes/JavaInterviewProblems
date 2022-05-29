package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.removeDuplicatesFromArrayList;

class removeDuplicatesFromArrayListTest {

	removeDuplicatesFromArrayList example;
	
	@BeforeEach
	void setUp() throws Exception {
		example = new removeDuplicatesFromArrayList();
	}

	@Test
	void willRemoveDuplicate() {
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();

		ar.add("alex");
		ar.add("anna");
		ar.add("matt");
		ar.add("charles");
		ar.add("charles");
		ar.add("joanna");
		ar.add("anna");
		ar.add("charles");
		ar.add("charles");
		ar = example.removeDuplicates(ar);
		
		temp.add("alex");
		temp.add("anna");
		temp.add("matt");
		temp.add("charles");
		temp.add("joanna");
		
		boolean result = ar.equals(temp);
		
		System.out.println(temp);
		System.out.println(ar);

		
		assertEquals(true, result);
	}
	
	@Test
	void mixedCaseTest() {
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();

		ar.add("Alex");
		ar.add("anna");
		ar.add("matt");
		ar.add("charles");
		ar.add("charles");
		ar.add("joanna");
		ar.add("anna");
		ar.add("Charles");
		ar.add("charles");
		ar.add("Joanna");
		ar = example.removeDuplicates(ar);
		
		temp.add("alex");
		temp.add("anna");
		temp.add("matt");
		temp.add("charles");
		temp.add("joanna");
		
		boolean result = ar.equals(temp);
		
		System.out.println(temp);
		System.out.println(ar);

		
		assertEquals(true, result);
	}

}
