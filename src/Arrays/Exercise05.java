/*
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra 
 * para calcular la suma de todos los números y, además, averiguar el máximo y mínimo y mostrarlos por pantalla.
 */

package Arrays;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		double[] table = new double[10];
        double sum = 0;

        // Inicializamos max y min con el primer valor que se introduzca
        System.out.print("Introduzca el valor 1: ");
        table[0] = sc.nextDouble();
        sum += table[0];
        double max = table[0];
        double min = table[0];

        // Pedimos los otros 9 valores
        for (int i = 1; i < table.length; i++) {
            System.out.print("Introduzca el valor " + (i+1) + ": ");
            table[i] = sc.nextDouble();

            sum += table[i];

            if (table[i] > max) {
                max = table[i];
            }
            if (table[i] < min) {
                min = table[i];
            }
        }

        System.out.println("Suma = " + sum);
        System.out.println("Máximo = " + max);
        System.out.println("Mínimo = " + min);

		
		//Close the Scanner
		sc.close();
		
	}

}
