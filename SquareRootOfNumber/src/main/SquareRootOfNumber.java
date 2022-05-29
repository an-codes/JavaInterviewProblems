package main;

public class SquareRootOfNumber {
	/*
	 root = 0.5 * (X + (number / X))
	 
	 Follow the steps from geeksforgeeks (thank you geeks!):
	1. Assign X to the N itself.
	2. Now, start a loop and keep calculating the root which will surely move towards the correct square root of N.
	3. Check for the difference between the assumed X and calculated root, if not yet inside tolerance then update root and continue.
	4. If the calculated root comes inside the tolerance allowed then break out of the loop.
	5. Print the root.
	 */
	
	public double findSquareRoot(double number, double l) {
		double root = 0.00;
		
		double X = number;
		
		// while (true) (geekforgeeks)
		for(int i=0; i <= number; i++){
		
			root = 0.5 * (X + (number / X));
			
		    // Check for closeness (geekforgeeks)
            if (Math.abs(root - X) < l)
                break;
     
            // Update root (geekforgeeks)
            X = root;
			
		}
		return root;
	}

}
