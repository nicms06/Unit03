/*
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10. 
 * Luego pedirá un valor N y mostrará en qué posiciones del array aparece N. 
 */

package arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		//Declaramos el array de 100 números
		int array[] = new int [100];
		
		//Declaramos la variable num y el booleano encontrado
		int num;
		boolean encontrado = false;
		
		//Rellenamos el array
		for (int i = 0; i <array.length; i++) {
			array[i] = rand.nextInt(1, 11);
		}
		
		//Pedimos un valor num
		System.out.print("Introduce un valor entre 1 y 10: ");
		num = sc.nextInt();
		
		while (num < 1 ||num > 10) {
			System.out.print("Error, inténtelo de nuevo: ");
			num = sc.nextInt();
		}
		
		//Ahora vemos las posiciones del número
		for (int i = 0; i <array.length; i++) {
			if (array[i] == num) {
				encontrado = true;
				System.out.println("Encontrado en: " + i);
			}
		}
		
		//Si el boleano buscar es falso, , no se ha encontrado el número
		if(!encontrado) {
			System.out.println("Elemento no encontrado");
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
