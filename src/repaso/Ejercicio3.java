package repaso;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaración de un texto
		String texto = "En un pequeño pueblo costero, donde las olas rompían suavemente sobre la arena y los "
				+ "barcos de pesca regresaban al amanecer, vivía un joven llamado Martín. Desde niño, había "
				+ "sentido una curiosidad insaciable por los misterios del mar. Cada tarde, después de la escuela, "
				+ "caminaba por la playa recogiendo conchas, observando las gaviotas y anotando en su cuaderno los "
				+ "nombres de los peces que encontraba en los mercados locales.";
		
		//Declaración de un array con 5 palabras clave
		String[] palabrasClave = {"exploración", "olas", "aventura", "misterio", "playa"};
		
		
	}
	
	//Función que devuelve True si el texto contiene la palabra clave
	static boolean contienePalabra(String texto, String palabra) {
		String textoSeparado[] = texto.split(" "); //Creación de un string que separa el texto por palabras
		for (String palabraTexto: textoSeparado) { //Recorremos el texto
			if (palabraTexto.equalsIgnoreCase(palabra)) { //Si encontramos la palabra devolvemos true
				return true;
			}
		}
		return false; //Si no hemos encontrado la palabra devolvemos false
	}
	
	//Función que devuelve un nuevo array con solo las palabras clave que aparecen en el texto.
	static String[] palabrasEncontradas(String texto, String[] claves) {
		int longitud = 0;
		for (String palabra : claves) { //recorremos el texto 
			if (contienePalabra(texto, palabra)) { //
				longitud ++;
			}
		}
		
		
	}

}
