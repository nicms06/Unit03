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

        //Creación de un array donde llamamos a la función palabrasEncontradas para guardar los valores de las palabras que fueron encontradas
        String [] encontradas = palabrasEncontradas(texto, palabrasClave);

        //Llamamos a la función mostrarResultado
        System.out.println("Las palabras encontradas fueron: ");
        mostrarResultado(encontradas);
	}

    /**
     * Función que devuelve True si el texto contiene la palabra clave
     * @param texto texto completo
     * @param palabra palabra que queremos comprobar si está dentro del texto
     * @return devolvemos true o false dependiendo de si coincude alguna plabra o no
     */
    static boolean contienePalabra(String texto, String palabra){
        String []textoSeparado = texto.split(" "); //Separamos cada una de las palabas del texto y las guardamos en un array

        for(String palabrasSeparadas: textoSeparado){ //Recorremos el array creado
            if (palabra.trim().equalsIgnoreCase(palabrasSeparadas)){ //Si alguna palabra coincide con alguna de las plabras claves devolvemos true
                return true;
            }
        }
        return false; //Si ninguna palabra coincide, devolvemos false
    }

    /**
     * Función que devuelve un nuevo array con solo las palabras clave que aparecen en el texto.
     * @param texto texto completo
     * @param claves array con las palabras clabes
     * @return devolvemos las palabras que aparecen en el texto
     */
    static String[] palabrasEncontradas(String texto, String[] claves){
        int longitud = 0;

        for (String c : claves){
            //Llamamos a la función contienePalabra
            if (contienePalabra(texto, c)){ //Si contiene la palabra sumamos 1 al contador de longitud
                longitud ++;
            }
        }

        //Creamos el array del tamaño de las palabras que aparecen
        String[] palabrasEnTexto = new String[longitud];

        //Añadimos las palabras
        int indice = 0;
        for (String c : claves){
            //Llamamos a la función contienePalabra
            if (contienePalabra(texto, c)){ //Si contiene la palabra sumamos 1 al contador de longitud
                palabrasEnTexto[indice] = c;
                indice++;
            }
        }

        return palabrasEnTexto; //Devolvemos las palabras que aparecen en el texto
    }

    /**
     * Función que muestra el resultado del ejercicio
     * @param encontradas array que contiene las palabras encontradas
     */
    static void mostrarResultado(String[] encontradas){

        if(encontradas.length == 0){ //Si el array tiene longitud 0 mostramos un mensaje de que no se ha encontrado ninguna palabra
            System.out.println("No se ha encontrado ninguna palabra.");
        } else { //Si la longitud es mayor a 0 mostramos
            String palabras = String.join(", ", encontradas);
            System.out.println(palabras);
        }
    }


}