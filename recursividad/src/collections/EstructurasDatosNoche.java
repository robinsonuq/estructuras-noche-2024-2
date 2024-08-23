package collections;

import java.util.ArrayList;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Predicate;

public class EstructurasDatosNoche {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante("Juan");
		Estudiante estudiante2 = new Estudiante("Pedro");
		Estudiante estudiante3 = new Estudiante("Robinson");
		
		JugadorFutbol cris7 = new JugadorFutbol() {
			@Override
			public void hacerGoles() {
				System.out.println("hacer goles de tiro libre");
			}
		};
		
		ArrayList<Estudiante> lista = new ArrayList<>();
		lista.add(estudiante);
		lista.add(estudiante2);
		lista.add(estudiante3);
		Predicate<Estudiante> predicate = j -> j.getNombre().equals("Robinson");
		
		Optional<Estudiante> optional = lista.stream().
				   filter(predicate).
				   findFirst();
		
		if(optional.isPresent()) {
			Estudiante estudiante4 = optional.get();
		}
				
		for (JugadorFutbol jugadorFutbol : lista) {
			jugadorFutbol.hacerGoles();
		}
		
		Integer numero = 0;
		Boolean flag = false;
		
	}
}
