/*
 * Realiza una función que reciba una tabla bidimensional y devuelva en otro array distinto su transposición.
 * Define un método main que llame a esta función pasándole una tabla bidimensional y muestre por pantalla el resultado.
 */

package funcionestablasbidimendionales;

import java.util.Scanner;

public class Exercise02 {

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
		
		//Call the function
		int transposed[][] = transpose(array);
		
		//Print the new array
		for (int i = 0; i < transposed.length; i++) {
			for (int j = 0; j < transposed[i].length; j++) {
				System.out.print(transposed[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Close the Scanner
		sc.close();
	}
	
	static int[][] transpose(int t[][]) {
		
		int result[][] = new int[t[0].length][t.length];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				result[j][i] = t[i][j];
			}
		}
		return result;
	}
		
}
