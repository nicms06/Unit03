/*
 * Diseñar un programa que solicite al usuario 5 números decimales y los almacene en una tabla. 
 * Utiliza el mismo bucle tanto para solicitar los 5 números como para almacenarlos en la tabla. 
 * A continuación, en un bucle distinto, mostrar por consola los números en el mismo orden en el que se han introducido.
 */

package Arrays;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		double table[] = new double[5];
		
		//Ask the user for the numbers
		for (int i = 0; i < table.length; i++) {
			System.out.print("Introduce el valor " + (i+1) + ": ");
			table[i] = sc.nextDouble();
		}
		
		//Show the array
		for (int i = 0; i < table.length; i++) {
			System.out.println("Element " + i + ": " + table[i]);
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
