package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteradorMio<C> implements Iterator<C> {

	private int indice;
	private java.util.ArrayList<C> lista;
	
	public IteradorMio(int indice,ArrayList<C> lista){
		this.indice = indice;
		this.lista = lista; 
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return indice < lista.size();
	}

	@Override
	public C next() {
		C c = lista.get(indice);
		indice+=2;
		return c;
	}

	
}
