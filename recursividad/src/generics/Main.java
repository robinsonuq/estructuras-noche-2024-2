package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		generics.ArrayList<String> lista = new generics.ArrayList<>();
		lista.add("R");
		lista.add("L");
		lista.add("M");
		lista.add("N");
		lista.add("O");
		
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			String aux = (String) iterator.next();
			System.out.println(aux);
		}
	}
}
