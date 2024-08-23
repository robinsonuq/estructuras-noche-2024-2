package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example {

	public static void main(String[] args) {
		
		ArrayList<String>lista = new ArrayList<>();
		lista.add("Robinson");
		lista.add("Raul");
		lista.add("Luis");
		lista.add("Mario");
		
		
		ListIterator<String> listIterator = lista.listIterator();
		
		while(listIterator.hasPrevious()) {
			String next = listIterator.previous();
			if(next.equals("Robinson")) {
				listIterator.remove();
			}
			System.out.println(next);
		}
		
		
	}
}
