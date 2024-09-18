package ejmplogenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Main<T extends Persona> {

	public static void main(String[] args) {


		TreeSet<Persona> lista = new TreeSet<>();
		
		lista.add(new Persona());
		
		
		
		System.out.println("Personas ordenadas por nombre: " + lista);

	}

	public void recorrer(List<? extends Persona> lista) {
		
	}

}
