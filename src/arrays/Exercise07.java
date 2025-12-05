package arrays;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tabla[] = new double[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Pedimos temperaturas
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Temperatura media de " + meses[i] + ": ");
            tabla[i] = sc.nextDouble();
        }

        System.out.println("\nDiagrama de temperaturas:");
        
        // Dibujamos barras
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%-12s: ", meses[i]);
            int cantidadAsteriscos = (int) Math.round(tabla[i]); // Convertimos a int para dibujar
            for (int j = 0; j < cantidadAsteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
