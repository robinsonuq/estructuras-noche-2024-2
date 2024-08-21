package recursividad;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante>{

	private String nombre;
	private int edad;

	public Estudiante(String nombre,int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		 final int prime = 31;
	        int result = 1;
	        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	        return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Estudiante estudiante) {
		return edad - estudiante.getEdad();
	}
	
	
	
}
