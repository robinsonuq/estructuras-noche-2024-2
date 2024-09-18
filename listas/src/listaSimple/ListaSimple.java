package listaSimple;

import java.util.ArrayList;

public class ListaSimple {


	private int tamanio;
	private Nodo primero;
	
	
	public ListaSimple() {
		tamanio = 0;
		primero= null;
	}
	
	public void insertarPrimero(int data) {
		
		Nodo nuevoNodo = new Nodo(data);
		
		if(primero == null) {
			primero = nuevoNodo;
		}else {
			nuevoNodo.setSiguiente(primero);
			primero = nuevoNodo;
		}
		tamanio++;
	}
	public  void imprimirLista() {
		imprimirLista(primero);
	}

	private void imprimirLista( Nodo nodoAux) {
		if(nodoAux == null) {
			System.out.println("termine");
		}else {
			imprimirLista(nodoAux.getSiguiente());
			System.out.println("Numero "+nodoAux.getDato());
		}
	}

	
	
}
