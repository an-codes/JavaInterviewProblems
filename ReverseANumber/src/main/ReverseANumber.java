package main;

public class ReverseANumber {

	int reversedNumber = 0;
	String solution = "";
	
	// ITERATIVE METHOD MATH APPROACH
	public int reverseNumberIterative (int number) {
		int intEl;
		int newNumber = number;
		
		while(newNumber > 0) {
			intEl = newNumber%10;		
			reversedNumber = (reversedNumber*10) + intEl;
			
			newNumber = newNumber/10;
		}
		return reversedNumber;
	}
	
	// ITERATIVE METHOD STRING APPROACH
	public int reverseNumberIterativeString (int number) {
		
		String initialNumberInString = Integer.toString(number);
		int stringLength = initialNumberInString.length();
		
		String reversedString = "";
		int solution;
		
		for(int i = stringLength-1 ; i >= 0; i--) {
			reversedString += initialNumberInString.charAt(i);
		}
		
		solution = Integer.parseInt(reversedString);
		
		return solution;
	}
	
	// RECURSIVE METHOD MATH APPROACH
	public int reverseNumberRecursion (int number) {
		int intArrayEl;
		
		if(number != 0) {
			intArrayEl = number%10;			
			String element = Integer.toString(intArrayEl);
			solution += element;
			reversedNumber = Integer.parseInt(solution);
			
			int newNumber = number/10;
			reverseNumberRecursion(newNumber);
		}

		return reversedNumber;		
	}
}
