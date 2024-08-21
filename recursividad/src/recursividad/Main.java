package recursividad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Estudiante> arreglo = new ArrayList<>();
		
		arreglo.add(new Estudiante("Juan"));
		arreglo.add(new Estudiante("pedro"));
		arreglo.add(new Estudiante("luis"));
		arreglo.add(new Estudiante("robin"));
		
		Collections.sort(arreglo);
		
		
	}
}
