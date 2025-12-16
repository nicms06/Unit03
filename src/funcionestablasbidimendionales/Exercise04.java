/*
 * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe una tabla bidimensional. 
 * La función devolverá true si la matriz introducida corresponde a una matriz mágica, que es aquella donde 
 * la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo. En caso contrario devolverá false.
 */

package funcionestablasbidimendionales;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
				
		//Declare the variables
		int rows;
		int columns;
				
		//Ask for the rows
		System.out.print("Input the rows: ");
		rows = sc.nextInt();
				
		//Ask for the columns
		System.out.print("Input the columns: ");
		columns = sc.nextInt();
				
		//Create an empty array
		int array[][] = new int[rows][columns];
		
		//Fill the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Position " + (i+1) + " | " + (j+1) + ": ");
				array[i][j] = sc.nextInt();
			}
		}
		
		
		
		//Close the Scanner
		sc.close();
		
	}
	
	static boolean esMagica(int tabla[][]) {
		
		int suma_fila;
		
		for (int i = 0; i < tabla.length; i++) {	
			suma_fila = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				suma_fila += tabla[i][j];
				int aux = suma_fila;
			}
		}
		
		
	}

}
