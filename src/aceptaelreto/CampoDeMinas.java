//Ejercicio Campo de Minas de acepta el reto: https://aceptaelreto.com/problem/statement.php?id=176&cat=14

package aceptaelreto;

import java.util.Scanner;

public class CampoDeMinas {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		
		
		//Cerramos el Scanner
		sc.close();
		
	}
	
	//Función que pide los datos al usuario
	//Tendrá como parámetro el Scanner
	static char[][] pedirTablero (Scanner sc) {
		
		//Pedimos al usuario el número de filas y de columnas
		System.out.print("Introduce el número de filas: ");
		int filas = sc.nextInt();
		//Llamamos a la función comprobarFilasColumnas para asegurarnos de que el valor es válido
		comprobarFilasColumnas(filas, sc);
		
		System.out.print("Introduce el número de columnas: ");
		int columnas = sc.nextInt();
		//Llamamos a la función comprobarFilasColumnas para asegurarnos de que el valor es válido
		comprobarFilasColumnas(columnas, sc);
		
		//Creamos una matriz con las dimensiones que nos ha dado el usuario
		char[][] tablero = new char[filas][columnas];
		
		//Pedimos al usuario que rellene la matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {	
				//Pedimos un valor al usuario
				System.out.print("Valor " + i + " | " + j + ": ");
				char valor = sc.nextLine().charAt(0);
				
				//Nos aseguramos de que el valor es correcto
				while (valor != '*' && valor != '_') {
					System.out.print("Error. valor inválido: ");
					valor = sc.nextLine().charAt(0);
				}
				
				//Una vez el valor sea correcto, lo añadimos a su posición dentro de la matriz
				tablero[i][j] = valor;
			}
		}
		
		//Devolvemos los valores del tablero
		return tablero;
		
	}
	
	//Función que asegura que las filas y las columnas son pusotivas y no mayores a 999
	//Tendra como parámetro un número que indica las colunas y las filas y tambíen tendrá un Scanner
	static int comprobarFilasColumnas (int num, Scanner sc) {
		//Mientras que la fila o la columna sea negativo o mayor a 999 dará un mensaje de error y seguirá pidiendo el valor hasta que sea correcto
		while (num < 0 || num > 999) {
			System.out.print("Error. valor inválido: ");
			num = sc.nextInt();
		}
		
		//Devolvemos el valor
		return num;
	}
	
	//Función que va a devolver el número de posiciones vacías que tienen al menos 6 minas alrededor
	//Tendrá como parámetro una matriz
	static int comprobarPosiciones (int[][] tablero) {
		
	}

}





































