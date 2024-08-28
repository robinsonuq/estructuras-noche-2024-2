package generics;

public class Par<N> {
	private N a, b;
	public Par(N a, N b){
		this.a = a;
		this.b = b;
	}
	public Par<T> N (){
		return new Par<N>(b, a);
	}	
	
	public <N> max(){
		return ((a>b) ? a : b);
	}

}
