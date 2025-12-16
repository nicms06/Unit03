/*
 * Define una función que reciba una tabla bidimensional y devuelva un booleano para indicar si la matriz es o no simétrica. 
 * Una matriz se dice que es simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la matriz. Delfine un método 
 * main que llame a la función y muestre por pantalla el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
 */

package funcionestablasbidimendionales;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int rows_columns;

		
		//Ask for the rows
		System.out.print("Input the rows and columns: ");
		rows_columns = sc.nextInt();
		
		//Create the array
		int [][]array = new int[rows_columns][rows_columns];
		
		//Fill the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Position " + (i+1) + " | " + (j+1) + ": ");
				array[i][j] = sc.nextInt();
			}
		}
		
		//Call symmetric()
		if (symmetric(array) == true) {
			System.out.println("The array is symmetric");
		}
		else {
			System.out.println("The array is not symmetric");
		}
		
		//Close the Scanner
		sc.close();
		
		
	}
	
	static boolean symmetric(int t[][]){
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if (t[i][j] != t[j][i]) {
					return false;
				}
			}
		}
		return true;
		
		
	}

}
