
public class ReverseAnArrayInPlace {


	public String reverseInPlace (String str) {
		
		String toStr = "";
		char[] charArray = new char [str.length()];

		
		for (int i = 0; i < str.length()/2+1; i++) {
			
			int smallerIndex = i;
			int largerIndex = str.length()-1 - i;
			
			charArray[smallerIndex] = str.charAt(largerIndex);
			charArray[largerIndex] = str.charAt(smallerIndex);
			
		}
		
		for (char j : charArray ) {
			toStr+=j;
		}
		
		
		
		return toStr;
		
	}
}
