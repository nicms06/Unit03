/*
 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores. 
 * Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores 
 * (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en orden descendente 
 * (de la más alta a la más baja).
 */

package clasearrays;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise04 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos el array que contendrá las puntuaciones
		int puntuaciones[] = new int[8];
		
		//Le pedimos al usuario que introduzca las puntuaciones y se irán almacenando en el array
		for (int i = 0; i < puntuaciones.length; i ++) {
			//Le pedimos al usuario el valor i
			System.out.print("Introduce el valor del jugador " + (i+1) + ": ");
			puntuaciones[i] = sc.nextInt();
			
			//Si el valor introducido no está entre 1000 y 2800, dará error hasta que se introduzca un valor correcto
			while (puntuaciones[i] < 1000 || puntuaciones[i] > 2800) {
				System.out.print("Error. el valor debe de estar entre 1000 y 2800, inténtelo de nuevo: ");
				puntuaciones[i] = sc.nextInt();
			}
		}
		
		//Ahora ordenaremos el array de mayor a menor. Para ello usaremos el método sort
		System.out.println("PUNTUACIONES ORDENADAS DE FORMA DESCENDENTE: ");
		
		Arrays.sort(puntuaciones);
		
		//Bucle for para invertir el array
		for (int i = puntuaciones.length - 1; i >= 0; i--) {
			System.out.println(puntuaciones[i]);
		}
		
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
