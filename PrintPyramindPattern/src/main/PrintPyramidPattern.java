package main;

public class PrintPyramidPattern {
	
	
	public static void printPyramid(int levels) {
	
	for(int i=0; i < levels; i++) {
		
		for(int j=0; j<=i; j++) {
			
			System.out.print(" <3 ");
		}
		
		System.out.println(" ");
	}
}


	public static void main(String[] args) {

		int levels = 10;
		
		printPyramid(levels);
		
	}

}
