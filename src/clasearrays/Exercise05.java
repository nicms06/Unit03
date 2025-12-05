/*
 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99. 
 * Luego pedirá por teclado un valor y se mostrará por pantalla si ese valor existe en el array, además de cuántas veces. 
 */

package clasearrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exercise05 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner 
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//Creamos un array de tamaño 1000
		int numeros[] = new int[1000];
		
		//Declaramos la variable num y uncontador igualado a 0
		int num;
		int contador= 0;
		
		//Llenamos el array con números aleatorios entre 0 y 99
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(0, 100);
		}
		
		//Pedimos un valor al usuario entre 0 y 99
		System.out.print("Introduce un valor entre 0 y 99: ");
		num = sc.nextInt();
		
		//Si el número no está entre 0 y 99 dará un mensaje de error
		while (num > 99 || num < 0) {
			System.out.print("Error, inténtalo de nuevo: ");
			num = sc.nextInt();
		}
		
		//Ahora tenemos que buscar si el valor se encuentra dentro del array
		
		//Primero ordenamos el array
		Arrays.sort(numeros);
		
		//Buscamos si el valor está en el array
		int indice = Arrays.binarySearch(numeros, num);
		
		if (indice >= 0) {
			//Ahora contamos los números en el array 
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] == num) {
					contador++;
				}
			}
			System.out.println("El número " + num + " aparece " + contador + " veces");
		}
		else {
			System.out.println("El número no está en la lista");
		}
		
		//Imprimimos el resultado
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
