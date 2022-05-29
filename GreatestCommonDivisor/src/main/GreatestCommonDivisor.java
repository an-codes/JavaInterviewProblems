package main;

public class GreatestCommonDivisor {

	
	/*
	 * EUCLIDEAN ALGORITHM
	 * SUBSTRACTION
	 */
	
	public int findGreatesCommonDivisorSubtraction(int a, int b) {
		int gcd=0;
		
		while(a!=b && a >= 0 && b >=0) {
			if(a>b) {
				a-=b;
				
				gcd=a;
			} else {
				b-=a;
				
				gcd=b;
			}
		}
		return gcd;
	}
	
	
	
	/*
	 * EUCLIDEAN ALGORITHM
	 * DIVISION
	 */
	
	public int findGreatesCommonDivisorDivision(int a, int b) {
		int gcd=0;

		int large = a > b ? a : b;
		int small = a > b ? b: a;
		
		gcd = large % small == 0 ? small : findGreatesCommonDivisorDivision(large%small, small);
				
		return gcd;
	}
}
