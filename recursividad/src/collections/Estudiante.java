package collections;

public class Estudiante implements JugadorFutbol{

	private String nombre;

	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void hacerGoles() {
		
		System.out.println("Estudiante hacer goles a la izquierda");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
