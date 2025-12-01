/*
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y 
 * las almacene en una tabla (una posición por mes). A continuación, se debe mostrar un diagrama de barras 
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 */

package Arrays;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		double tabla[] = new double[12];
		
		//Pedimos los datos
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Temperatura del mes " + (i+1) + ": ");
			tabla[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Temperatura del mes " + (i+1) + ": ");
			
			for (int j = 0; j < tabla[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
