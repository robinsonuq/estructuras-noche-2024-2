package listaSimple;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		ListaSimple list = new ListaSimple();
		list.insertarPrimero(3);
		list.insertarPrimero(4);
		list.insertarPrimero(5);
		list.insertarPrimero(7);
		
		list.imprimirLista();
		
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		for (int i = 0; i < lista.size(); i++) {
			
		}
		imprimirLista(lista);
		
	}

	private static void imprimirLista(ArrayList<Integer> lista) {
		imprimirLista(lista,0);
	}

	private static void imprimirLista(ArrayList<Integer> lista, int i) {
		if(i == lista.size()) {
			System.out.println("termine");
		}else {
			System.out.println("Numero "+lista.get(i));
			imprimirLista(lista, i+1);
		}
	}
}
