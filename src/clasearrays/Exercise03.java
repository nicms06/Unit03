/*
 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9. 
 * Luego ordena los valores del array y los mostrará por pantalla.
 */

package clasearrays;

import java.util.Arrays;
import java.util.Random;

public class Exercise03 {

	public static void main(String[] args) {

		//LLamamos a la clase Random
		Random rand = new Random();
		
		//Creamos el array
		int array[] = new int[30];
		
		//Llenamos el array con número aleatorios entre 0 y 9
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(0, 10);
		}
		
		//Ordenamos los valores del array 
		Arrays.sort(array);
		
		//Mostramos el array
		System.out.println(Arrays.toString(array));
		
	}

}
