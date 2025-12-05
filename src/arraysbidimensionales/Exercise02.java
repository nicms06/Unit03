/*
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. 
 * El usuario introducirá las notas por teclado y luego el programa mostrará la tabla con las notas. A continuación, mostrará 
 * la nota mínima, máxima y media de cada alumno.
 */

package arraysbidimensionales;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la tabla
		int notas[][] = new int[4][5];
		
		//Declaramos variables
		int suma = 0;
		int media = 0;
		int max = notas[0][0];
		int min = notas[0][0];
		
		//Vamos llenando la tabla con las notas
		for (int i = 0; i < 4; i++) {
			System.out.println("----------ALUMNO " + (i+1) + "----------");
			
			for (int j = 0; j < 5; j++) {
				
				System.out.print("Nota " + (j+1) + ": ");
				notas[i][j] = sc.nextInt();
				
				//Las notas deben de ir entre 0 y 10, si no es así, error
				while(notas[i][j] < 0 || notas[i][j] > 10) {
					System.out.print("Las notas van de 0 a 10, inténtelo de nuevo: ");
					notas[i][j] = sc.nextInt();
				}
			}
		}
		
		for (int i = 0; i < 4; i++) {
			
			suma = 0;
			max = notas[i][0];
			min = notas[i][0];
			
			for (int j = 0; j <5; j++) {
				//Sumamos la nota
				suma += notas[i][j];
				media = suma / 5;
				
				if (max < notas[i][j]) {
					max = notas[i][j];
				}
				if (min > notas[i][j]) {
					min = notas[i][j];
				}
			}
			System.out.println("----------Alumno " + (i+1) + "----------");
			System.out.println("Media = " + media);
			System.out.println("Nota mínima: " + min);
			System.out.println("Nota máxima: " + max);
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
