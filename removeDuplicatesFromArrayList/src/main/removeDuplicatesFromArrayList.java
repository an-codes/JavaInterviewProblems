package main;

import java.util.ArrayList;

public class removeDuplicatesFromArrayList {
		
	public ArrayList<String> removeDuplicates(ArrayList<String> al) {

		ArrayList<String> newArr = new ArrayList<String>();
		
		for (String element : al) {
			
			element = element.toLowerCase();

			
			if (!newArr.contains(element)) {
				newArr.add(element);
			}
		}
		return newArr;
	}

}
