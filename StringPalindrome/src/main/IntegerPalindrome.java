package main;

public class IntegerPalindrome {

	 int numberReverse = 0;
	 int remainder;
	    
	 public boolean isIntegerPalindrome(int num) {
	    // store the number to originalNum
	    int numberCopy = num;
	    
	    // reverse the number mathematically 
	    while (num > 0) {
	      remainder = num % 10;
	      numberReverse = numberReverse * 10 + remainder;
	      num /= 10;
	    }
	    
	    if (numberCopy == numberReverse) {
	    	return true;	    
	    }
	    else {
	    	return false;	    
	    }
	}
}
