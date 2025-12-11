/*
 * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.
 */

package funciones;

public class Exercise02 {

	public static void main(String[] args) {
		
		int tabla[] = {6, 100, 45, 678, 23, 123, 1};
		
		System.out.println("Máximo: " + maximo(tabla));
		
	}
	
	static int maximo(int t[]) {
		int max = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (max < t[i]) {
				max = t[i];
			}
		}
		return max;
	}

}
