package mipila;

import java.util.ArrayList;

public class MiPila<E> {

	ArrayList<E> lista = new ArrayList<>();
	
	public void push(E e) {
		lista.add(e);
	}
	
	public E pop() {
		
		E e = lista.get(lista.size()-1);
		lista.remove(e);
		return e;
	}
	
	public E peek() {
		E e = lista.get(lista.size()-1);
		return e;
	}

}
