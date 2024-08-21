package recursividad;

import java.util.Arrays;

public class Divide {

	public static void main(String[] args) {
		
		int arreglo[] = {4,3,2,3,2,1};
		
		Arrays.sort(arreglo);
		Arrays.binarySearch(arreglo, 3);
		
		
		
		int suma = divideYVenceras(arreglo);
		System.out.println(suma);
	}

	private static int divideYVenceras(int[] arreglo) {
		
		return divideYVenceras(arreglo, 0,  arreglo.length-1);
	}

	private static int divideYVenceras(int[] arreglo, int inicio, int fin) {

		if(inicio == fin) {
			return arreglo[inicio];
		}
		int mitad = (inicio + fin)/2;
		int sumaIzq = divideYVenceras(arreglo, inicio, mitad);
		int sumadere = divideYVenceras(arreglo, mitad + 1, fin);
		return sumaIzq + sumadere;
	}

	private static int divideYVencerasMayor(int[] arreglo, int inicio, int fin) {

		if(inicio == fin) {
			return arreglo[inicio];
		}
		int mitad = (inicio + fin)/2;
		int sumaIzq = divideYVenceras(arreglo, inicio, mitad);
		int sumadere = divideYVenceras(arreglo, mitad + 1, fin);
		
		if(sumaIzq > sumadere) {
			return sumaIzq;
		}else {
			return sumadere;
		}
	}

	
}
