package main;

public class FibonacciNumbers {
	/*
	Dynamic Programming
	Time Complexity: O(N) 
	Auxiliary Space: O(N) 
	 */
	
	int seriesLength;
	
	public FibonacciNumbers() {
		
	}
	
	// method that creates the series and prints the last number
	public int FibonacciSeriesCreate(int seriesLength) {
		this.seriesLength = seriesLength;
		int[] fibSeries = new int[seriesLength];
		
		fibSeries[0] = 0;
		fibSeries[1] = 1;

		for(int i = 2; i < fibSeries.length; i++) {
			fibSeries[i] = fibSeries[i-2] + fibSeries[i-1];
		}
		
		return fibSeries[seriesLength-1];
	}
	

}
