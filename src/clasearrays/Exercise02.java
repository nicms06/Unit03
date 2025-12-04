/*
 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y 
 * los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
 */

package clasearrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise02 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num;
		
		//Creamos los dos arrays
		int array1[] = new int[10];
		int array2[] = new int[10];
		
		//Le pedimos al usuario 20 números
		for (int i = 0; i < 20; i++) {
			
			System.out.print("Introduzca el valor " + (i+1) + ": ");
			num = sc.nextInt();
			
			if (i <=9) {
				array1[i] = num;
			}
			else {
				
				array2[i-10] =num;
			}
		}
		
		//Comparamos los arrays
		System.out.println("Los arrays son iguales?: " + Arrays.equals(array1, array2));
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
