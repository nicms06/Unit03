/*
 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de las tablas de multiplicar del 1 al 10 
 * (cada tabla de multiplicar en una fila). Muestra la tabla por pantalla.
 */

package arraysbidimensionales;

public class Exercise04 {
	

	public static void main(String[] args) {
		
		//Declasramos el array bidimensional
		int tablas[][] = new int [10][10];
		
		//Llenamos el array
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tablas[i][j] = (i+1) * (j+1);
			}
		}
		
		//Mostramos el array
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(tablas[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
