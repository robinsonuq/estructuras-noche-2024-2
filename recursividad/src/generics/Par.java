package generics;

import java.util.Iterator;

public class Par<N> implements Iterable<N> {
	private N a, b;
	public Par(N a, N b){
		this.a = a;
		this.b = b;
	}
	public Par<T> N (){
		return new Par<N>(b, a);
	}	
	
	public T max(){
		return ((a>b) ? a : b);
	}
	@Override
	public Iterator<N> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
