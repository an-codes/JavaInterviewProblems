package main;

public class FibNumbers {
	/*
	Iterative
	Time Complexity: O(N) 
	Auxiliary Space: O(1) 
	 */
	
	int index=2;
	int num1 = 0;
	int num2 = 1;
	int num3;
	private int finalNumber;
	
	public int fibSeq(int l) {
	while (index < l) {
		num3 = num1 + num2;
		num1=num2;
		num2=num3;
		index++;
		
		if (index == l) {
			finalNumber = num3;
		}
	}
	return finalNumber;
	}

}
