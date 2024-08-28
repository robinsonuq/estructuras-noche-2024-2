package generics;

public class ArrayList<C> {

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
	

}
