package main;

import java.util.ArrayList;

public class removeDuplicatesFromArrayList {
	
	public Character charToLower(Character element) {
		element = Character.toLowerCase(element);
		return element;
	}
		
	public <E> ArrayList<E> removeDuplicates(ArrayList<E> al) {

		ArrayList<E> newArr = new ArrayList<E>();
		
		for (E element : al) {
			
			if (element instanceof java.lang.Character && !((java.lang.Character) element).isDigit((char) element)) {
				element = (E) charToLower((java.lang.Character)element);
			} else if(element instanceof java.lang.String) {
				element = (E) ((String) element).toLowerCase();
			}
			


			
			if (!newArr.contains(element)) {
				newArr.add(element);
			}
		}
		return newArr;
	}

}
