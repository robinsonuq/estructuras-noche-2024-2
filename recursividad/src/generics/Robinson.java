package generics;

import java.util.ArrayList;

public class Robinson<O, D> {
	
	private ArrayList<O> pertenenciasMias = new ArrayList<>();
	private ArrayList<D> pertenenciasNovia = new ArrayList<>();
	
	public void comprar(O o) {
		pertenenciasMias.add(o);
	}
	public void comprarD(D d) {
		pertenenciasNovia.add(d);
	}
	
	public O usar(int index) {
		return pertenenciasMias.get(index);
	}
}
