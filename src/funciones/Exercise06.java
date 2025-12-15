/*
 * Implementa la función: int[] suma(int t[], int numElementos), que crea y 
 * devuelve una tabla con las sumas de los numElementos elementos consecutivos de t. 
 * Veamos un ejemplo, sea t=[10, 1, 5, 8, 9, 2]. Si los elementos de t se agrupan de 3 en 3, se harán las sumas:
 * 
 * 10+1+5=16
 * 1+5+8=14
 * 5+8+9=22
 * 8+9+2=19
 * 
 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19].
 */

package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise06 {

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
				
		int resultado[] = suma(array, value);
				
		System.out.println(Arrays.toString(resultado));
				
		//Close the Scanner
		sc.close();

	}
	static int[] suma(int t[], int numElementos) {
		
		
		int array[] = new int[t.length - numElementos + 1];
		
		
		
		for(int i = 0; i <= t.length - numElementos; i++) {
			int suma = 0;
			for (int j = 0; j < numElementos; j++) {
				suma += t[i + j];
			}
		array[i] = suma;
		}
		
		return array;
		
	}

}
