package main;

public class ArmstrongNumberCheck {

	public boolean isItArmstrongNumber(int number) {
	
		int powerCheck=number;
		boolean result = false;
		double n=0; //number of digits
		int originalNo = number; // copy the number to compare it to later on
		double power=0;
		
	    while (powerCheck > 0) {
	    	powerCheck = powerCheck / 10;
		       power++;
		    }

	 // calculate the sum of each digit separately, one by one
	    while (number > 0) {

	       double remainder = number % 10;
	       n = (n) + Math.pow(remainder, power);
	       number = number / 10;
	    }
	    
	    /* flow of the number 153
	     
	     * 1st round
	     * number is 153
	      153/10 = 15.3; remainder is 3
	      power=0+3*3*3
	      power=27
	      number = 153/10 = 15
	      
	     * 2nd round
	     * number is 15
	      15/10=1.5; remainder is 5
	      power=27 + 5*5*5
	      power=152
	      number = 15/10 = 1
	      
	     * 3rd round
	     * number is 1
	     1/10 = 0.1; remainder is 1
	     power=152 + 1*1*1
	     power=153
	     number=0;
	     
	    */ 
	    
	// return the result
	    if (n == originalNo) {
	    	result = true;
	    } else if (n != originalNo) {
			result = false;

	    }
		return result;	
	}
}
