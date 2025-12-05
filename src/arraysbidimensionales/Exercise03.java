/*
 * Escribe un programa que pida las dimensiones de una tabla bidimensional al usuario (número de filas y número de columnas). 
 * A continuación, crea dicha tabla bidimensional y rellénala de la siguiente forma: el elemento de la posición [i][j] debe 
 * contener el valor 10 * i + j. A continuación, muestra la tabla por consola.
 */

package arraysbidimensionales;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int filas;
		int columnas;
		
		//Le preguntamos al usuario las filas y las columnas del array
		System.out.print("Introdcuce el número de filas de la tabla: ");
		filas = sc.nextInt();
		
		//Le preguntamos por las columnas
		System.out.print("Introduce el número de columnas de la tabla: ");
		columnas = sc.nextInt();
		
		//Creamos el array con el número de filas y de columnas
		int array [][] = new int[filas][columnas];
		
		//Llenamos el array
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				array[i][j] = 10 * i + j;
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
