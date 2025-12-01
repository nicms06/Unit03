/*
 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. 
 * A continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos números 
 * junto con la palabra “par” o “impar” según proceda.
 */

package Arrays;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int tabla[] = new int[8];
		
		//Pedimos los números y los almacenamos en la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce el valor " + (i+1) + ": ");
			tabla[i] = sc.nextInt();
		}
		
		for (int i = 0; i < tabla.length; i++) {
			
			String esPar = (tabla[i] % 2 == 0) ? "Par" : "Impar";
			
			System.out.println(tabla[i] + " : " + esPar);
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
