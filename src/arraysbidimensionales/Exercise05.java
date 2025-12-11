/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999. 
 * Estos números se deben introducir en un array de 4 filas por 5 columnas. 
 * Seguidamente, muestra el array por pantalla junto con las sumas parciales de filas y columnas, 
 * igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 */

package arraysbidimensionales;

import java.util.Random;

public class Exercise05 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		//Creamos un nuevo Array
		int array [][] = new int [4][5];
		
		int columnas = 5;
		
		int suma_parcial_filas= 0;
		int suma_parcial_columnas[]= new int [columnas];
		int suma_total = 0;
		
		//Llenamos el array
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				int random = rand.nextInt(100, 1000);
				array [i][j] = random;
			}
		}
		
		//Mostramos el array
		for (int i = 0; i < 4; i++) {
			suma_parcial_filas = 0;
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + "\t");
				suma_total += array[i][j];
				suma_parcial_filas += array[i][j];
				suma_parcial_columnas [j] += array[i][j];
			}
			System.out.println("F"+ (i+1) + ": " + suma_parcial_filas);
			System.out.println();
		}
		
		//Mostramos la suma de las columnas:
		for (int j = 0; j < 5; j++) {
			System.out.print("C" + (j+1) + ": " + suma_parcial_columnas[j] + " ");
		}
		
		System.out.println("Suma total: " + suma_total);
	}

}
