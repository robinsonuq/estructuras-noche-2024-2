package generics;

import java.util.Iterator;

public class ArrayList<C> implements Iterable<C>{

	java.util.ArrayList<C> cosas = new java.util.ArrayList<>();
	
	public void add(C c) {
		cosas.add(c);
	}
	public void remove(C c) {
		cosas.remove(c);
	}
	public void remove(int i) {
		cosas.remove(i);
	}
	public C get(int i) {
		return cosas.get(i);
	}
	@Override
	public Iterator<C> iterator() {
		return new IteradorMio<C>(1,cosas);
	}
	

}
