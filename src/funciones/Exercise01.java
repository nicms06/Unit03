/*
 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva la suma de todos los valores 
 * almacenados en la tabla. Prueba el comportamiento de la función en un método main.
 */

package funciones;

public class Exercise01 {

	public static void main(String[] args) {

		//Creamos un array que contenga n valores
		int array[] = {1, 6, 10, 36, 12, 5};
		
		//LLamamos a la función con los valores de la tabla y la mostramos
		System.out.println("La suma es: " + suma(array));
		
	}
	
	static int suma(int tabla[]) {
		
		//Sumamos los valores de la tabla
		int suma = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}
		
		//Devolvemos el valor de la suma
		return suma;
	}

}
