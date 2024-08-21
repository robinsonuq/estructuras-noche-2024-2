package recursividad;

public class Recursividad {

	public static void main(String[] args) {

		int arreglo[] = {2,3,4,5};
		int suma = 0;
		sumar(arreglo,0,suma);
		System.out.println(suma);
	}
	
	private static int sumar(int[] arreglo, int indice,int suma) {
		if(indice == arreglo.length - 1) {
			return arreglo[indice];
		}
		suma = arreglo[indice]+sumar(arreglo, indice + 1, suma);
		return suma;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	













	























































































	





































	private static void abrirMatriuska(int num) {

		System.out.println("Abrir matriuska "+ num);

		if(num == 0) {
			System.out.println("Termine\n");
			return;
		}

		abrirMatriuska(num-1);

		System.out.println("Cerrar matriuska "+ num);

	}
	private static void recorrerArreglo(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			int j = arreglo[i];
			if(j == 4) {
				return;
			}
			System.out.println(j);
		}
	}

}
