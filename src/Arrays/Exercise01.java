/*
 * Crea una tabla de enteros de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100. 
 */

package Arrays;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int[] table = new int[10];
		
		for (int i = 0; i < table.length; i++) {
			table[i] = (int)(Math.random() * 100) + 1;
			System.out.println("Element " + (i+1) + ": " + table[i] + " ");
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
