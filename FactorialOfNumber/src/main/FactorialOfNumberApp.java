package main;

public class FactorialOfNumberApp {

	public int createFactorial(int number) {
		int factorial=1;
		
		for(int i = 1; i <= number; i++) {
			factorial = factorial*i;
		}
		
		return factorial;
	}
	
}
