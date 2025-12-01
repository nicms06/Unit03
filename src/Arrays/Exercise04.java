/*
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación.
 * Muestra el contenido de todos los elementos del array por consola. 
 * 
 * ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 */

package Arrays;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num[] = new int[12];
		
		//Input the values
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		//Show the array
		for (int i = 0; i < num.length; i++) {
			System.out.println("Element " + (i+1) + ": " + num[i]);
		}
		
		//A LOS VALORES VACÍOS SE LES ASIGNA EL 0 AUTOMÁTICAMENTE
		
		//Close the Scanner
		sc.close();
		
	}

}
