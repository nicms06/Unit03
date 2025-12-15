/*
 * Realiza una función que reciba una tabla de dos dimensiones. A continuación, 
 * debe devolver un array de dos posiciones que contenga el mínimo en la posición 
 * 0 y el máximo en la posición 1. Define un método main que rellene un array de 6 
 * filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 
 * (ambos incluidos). A continuación, debe llamar a la función con este array y 
 * mostrar por consola los valores mínimo y máximo de la tabla.
 */

package funcionestablasbidimendionales;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//Create the 3x3 table
		int [][] table = new int [6][10];
		
		//Fill the table
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				table[i][j] = rand.nextInt(0, 1001);
			}
		}
		
		//Show the table
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Call the function
		int solution[] = minMax(table);
		
		System.out.println("\nSolution: ");
		
		//Print the solution
		System.out.print(Arrays.toString(solution));
		
		//Close the Scanner
		sc.close();
	
	}
	
	static int[] minMax(int t[][]) {
		int min = t[0][0];
		int max = t[0][0];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if (min > t[i][j]) {
					min = t[i][j];
				}
				if (max < t[i][j]) {
					max = t[i][j];
				}
			}
		}
		
		int solution[] = {min, max};
		return solution;
	}

}
