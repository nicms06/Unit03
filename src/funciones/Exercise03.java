/*
 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada 
 * de la longitud especificada, que se encuentra rellena con números pares aleatorios comprendidos entre 
 * 2 hasta fin inclusive.
 */

package funciones;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int longitud;
		int fin;
		
		//Pedimos la longitud
		System.out.print("Introduce la longitud de la tabla: ");
		longitud = sc.nextInt();
		
		//Pedimos el número máximo
		System.out.print("Introduce el número máximo: ");
		fin = sc.nextInt();
		
		//Llamamos a la función y la mostramos
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		
		//Cerramos el Scanner
		sc.close();
		
	}
	
	static int[] rellenaPares(int longitud, int fin) {
		
		Random rand = new Random();
		
		//Creamos la tabla
		int tabla[] = new int [longitud];
		
		//Rellenamos la tabla
		for (int i = 0; i < longitud; i++) {
			//Generamos un número random
			int random = rand.nextInt(2, (fin+1));
			
			//El número debe de ser par
			while (random % 2 != 0) {
				random = rand.nextInt(2, (fin+1));
			}
			
			//Metemos el número en la tabla
			tabla[i] = random;
		}
		
		//Ordenamos la tabla
		Arrays.sort(tabla);
		
		//Devolvemos la tabla
		return tabla;

	}

}
