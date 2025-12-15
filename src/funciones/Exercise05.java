/*
 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y devuelve una tabla con todos los 
 * índices de los elementos donde se encuentra el valor de búsqueda. En el caso de que el valor no se encuentre 
 * en la tabla t, la función devolverá una tabla vacía.
 */

package funciones;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise05 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int length;
		int value;
		
		//Ask the user for the length of the array
		System.out.print("Input the length of the array: ");
		length = sc.nextInt();
		
		//Create the array
		int []array = new int[length];
		
		//Fill the array
		for (int i = 0; i < length; i++) {
			System.out.print("Number " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
		
		//Ask the user for the value
		System.out.print("Input the value: ");
		value = sc.nextInt();
		
		int array2[] = buscarTodos(array, value);
		
		System.out.println(Arrays.toString(array2));
		
		//Close the Scanner
		sc.close();

	}
	static int[] buscarTodos(int t[], int valor) {
		
		//Create a new Array
		int count = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				count ++;
			}
		}
		
		int result[] = new int[count];
		int index = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				result[index] = (i+1);
				index ++;
			}
		}
		return result;
	}

}
