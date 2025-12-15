/*
 * Escribe la función: int buscar(int t[], int clave), que busca de forma secuencial en la tabla t el valor clave. 
 * En caso de encontrarlo, devuelve en qué posición lo encuentra; y en caso contrario, devolverá -1
 */

package funciones;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int length;
		int clave;
		
		//Ask the user how many numbers in the array
		System.out.print("Length of the array: ");
		length = sc.nextInt();
		
		//Create the array
		int array[] = new int[length];
		
		//Fill the array
		for (int i = 0; i < length; i++) {
			System.out.print("Number " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
		
		//Ask for the key
		System.out.println("Input the key: ");
		clave = sc.nextInt();
		
		//Call the function
		int pos = buscar(array, clave);
		
		if (pos != -1) {
			System.out.println("Number found in position " + (pos+1));
		}else {
			System.out.println("Number not found");
		}
		
		//Close the Scanner
		sc.close();
	}
	
	static int buscar(int t[], int clave) {
		for (int i = 0 ; i < t.length; i++) {
			if (t[i] == clave) {
				return i;
			}
		}
		return -1;
	}

}

