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
	void willRemoveStringDuplicate() {
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
	void mixedStringCaseTest() {
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
	
	@Test
	void integerDuplicateTest() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();

		ar.add(1);
		ar.add(3);
		ar.add(3);
		ar.add(7);
		ar.add(0);
		ar.add(3);
		ar.add(345);
		ar.add(23);
		ar.add(7);
		
		ar = example.removeDuplicates(ar);

		temp.add(1);
		temp.add(3);
		temp.add(7);
		temp.add(0);
		temp.add(345);
		temp.add(23);


		
		boolean result = ar.equals(temp);
		
		System.out.println(temp);
		System.out.println(ar);

		
		assertEquals(true, result);
	}
	
	@Test
	void characterDuplicateTest() {
		ArrayList<Character> ar = new ArrayList<Character>();
		ArrayList<Character> temp = new ArrayList<Character>();

		ar.add('a');
		ar.add('a');
		ar.add('b');
		ar.add('b');
		ar.add('b');
		ar.add('c');
		ar.add('d');
		ar.add('e');
		ar.add('f');
		
		ar = example.removeDuplicates(ar);

		temp.add('a');
		temp.add('b');
		temp.add('c');
		temp.add('d');
		temp.add('e');
		temp.add('f');


		
		boolean result = ar.equals(temp);
		
		System.out.println(temp);
		System.out.println(ar);

		
		assertEquals(true, result);
	}
	
	@Test
	void characterMixCaseTest() {
		ArrayList<Character> ar = new ArrayList<Character>();
		ArrayList<Character> temp = new ArrayList<Character>();

		ar.add('a');
		ar.add('A');
		ar.add('B');
		ar.add('b');
		ar.add('b');
		ar.add('c');
		ar.add('d');
		ar.add('e');
		ar.add('f');
		
		ar = example.removeDuplicates(ar);

		temp.add('a');
		temp.add('b');
		temp.add('c');
		temp.add('d');
		temp.add('e');
		temp.add('f');


		
		boolean result = ar.equals(temp);
		
		System.out.println(temp);
		System.out.println(ar);

		
		assertEquals(true, result);
	}

}
