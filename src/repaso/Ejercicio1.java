package repaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos un nuevo Scanner 
		Scanner sc = new Scanner(System.in);
		
		int longitudMinima = 5;
		
		//Pedimos al usuario una frase completa
		System.out.println("Introduce una frase completa: ");
		String frase = sc.nextLine();
		
		String fraseSeparada[] = obtenerPalabras(frase);
		
		//Mostramos la cadena
		for(String f : fraseSeparada) {
			System.out.print(f + " ");
		}
		
		System.out.println();
		
		//Mostramos el número de palabras
		System.out.println("Número de palabras: " + fraseSeparada.length);
		
		//Llamamos a la función contarPalabrasLargas para ver cuantas palabras tienen más de 5 letras
		int palabrasLargas = contarPalabrasLargas(fraseSeparada, longitudMinima);
		
		//Mostramos el número de palabras largas
		System.out.println("Número de palabras largas: " + palabrasLargas);
		
		String palabraMasLarga = palabraMasLarga(fraseSeparada);
		
		//Mostramos la palabra más larga
		System.out.println("Palabra más larga: " + palabraMasLarga);
		
		//Cerramos el Scanner
		sc.close();
	}
	
	//Creamos una función que: 
	//		--Elimine los espacios iniciales y finales,
	//		--Convierta la frase a minúsculas,
	//		--Devuelva un array de String con todas las palabras de la frase (separadas por espacios).
	static String[] obtenerPalabras(String frase) {
		//Primero vamos a eliminar los espacios iniciales y finales
		String fraseEditada = frase.trim().toLowerCase(); //Eliminamos los espacios finales e iniciales y convertimos la cadena a minúsculas
		
		//Creamos una cadena nueva y separamos todas las palabras de la frase con espacios
		String[] palabras = fraseEditada.split(" ");
		
		//Devolvemos la cadena
		return palabras;
	}
	
	//Creamos una función que devuelva cuántas palabras tienen una longitud mayor o igual que longitudMinima.
	static int contarPalabrasLargas(String[] palabras, int longitudMinima) {
		int palabrasLargas = 0;
		
		//Recorremos la cadena
		for(String a : palabras) {
			
			int numLetras = a.length();
			
			if (numLetras >= longitudMinima) { //Si la palabra tiene más letras que el valor dado por el usuario, sumamos una palabra
				palabrasLargas ++;
			}
		}
		//Devolvemos el numero de palabras largas
		return palabrasLargas;
	}
	
	//Función que devuelve la palabra más larga encontrada
	static String palabraMasLarga(String[] palabras) {
		int numPalabraMasLarga = 0;
		String palabraMasLarga = "";
		
		//Recorremos la cadena
		for(String a : palabras) {
			//Contamos las letras que tiene cada palabra
			if(a.length() > numPalabraMasLarga) {
				numPalabraMasLarga = a.length();
				palabraMasLarga = a;
			}
		}
		
		//Devolvemos la palabra más larga
		return palabraMasLarga;
	}

}