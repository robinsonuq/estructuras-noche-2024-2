package mipila;

import java.util.ArrayList;
import java.util.Queue;

public class MiCola<E> {

	ArrayList<E> lista = new ArrayList<>();
	Queue<String> queue = null;
	
	
	public void encolar(E e) {
		lista.add(e);
		queue.offer(null);
	}
	
	public E desencolar() {
		
		E e = lista.get(0);
		lista.remove(0);
		return e;
	}

	
	
}
