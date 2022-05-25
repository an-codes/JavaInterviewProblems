package main;

public class StringPalindrome {

	int[] strArray;
	boolean result;
	
	public boolean isStringAPalindrome(String str) {
		str = str.toLowerCase();
		str = str.replaceAll(" ", "");
		int frontStart=0;
		int backStart=str.length()-1;
		System.out.println(backStart);
		
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(frontStart) != str.charAt(backStart)) {
				result = false;
			} else if (str.charAt(frontStart) == str.charAt(backStart)) {
				result = true;
				i++;
			}
			
		}
		return result;
	}
}
