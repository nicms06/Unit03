/*
 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego cree un array del 
 * tamaño dado y que almacene valor en todas sus posiciones. Luego muestra el array por pantalla.
 */

package clasearrays;

import java.util.Scanner;
import java.util.Arrays;

public class exercise01 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int tamaño;
		int valor;
		
		//Pedimos dos valores al usuario
		System.out.print("Introduce el tamaño: ");
		tamaño = sc.nextInt();
		
		System.out.print("Introduce el valor: ");
		valor = sc.nextInt();
		
		//Creamos el array
		int array[] = new int[tamaño];
		
		//Llenamos el array
		for (int i = 0; i < tamaño; i++) {
			array[i] = valor;
		}
		
		//Mostramos el array relleno
		System.out.println("Array resultante: " + Arrays.toString(array));
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
