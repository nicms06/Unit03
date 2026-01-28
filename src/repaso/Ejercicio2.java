package repaso;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creamos un array de double con las notas de una clase (Entre 0 y 10)
        double[] notas= {5.7, 6.3, 9.35, 2.8, 3.9, 4.7, 10, 6.2};

        //Mostramos el array inicial
        System.out.print("Notas iniciales: ");
        System.out.println(Arrays.toString(notas));

        //mostramos la media, nota maxima y número de aprobados
        System.out.println("Media: " + calcularMedia(notas));
        System.out.println("Nota máxima: " + notaMaxima(notas));
        System.out.println("Aprobados: " + contarAprobados(notas));

        System.out.print("Incrementamos 0.5 las notas: ");
        double incremento = 0.5;

        //Lamamos a la función para incrementar las notas
        subirNotas(notas, incremento);

        //Mostramos las notas incrementadas
        System.out.println(Arrays.toString(notas));

        //Cerramos el scanner
        sc.close();
    }

    //Función para calcular la media
    static double calcularMedia(double[] notas){
        double suma = 0;

        for (double a : notas){ //Recorremos la matriz sumando los números
            suma += a;
        }
        //Calculamos la media y la devolvemos
        return (double) suma / notas.length;
    }

    //Función para calcular la nota máxima
    static double notaMaxima(double[] notas){
        double notaMax = notas[0]; //Inicializamos la nota en el primer valor del array
        for (int i = 0; i < notas.length; i++){ //Recorremos el array
            if(notaMax < notas[i]){ //Si el valor maximo es más pequeño que el valor de esta interacción, lo actualizamos
                notaMax = notas[i];
            }
        }
        //Devolvemos la nota máxima
        return notaMax;
    }

    //Función que devuelve cuantas notas son mayores o iguales que 5
    static int contarAprobados(double[] notas){
        int numAprobados = 0; //Inicializamos el número de aprobados en 0

        //Recorremos el array para ir sumando el número de aprobados
        for (int i = 0; i < notas.length; i++){
            if (notas[i] >= 5){ //Si la nota es mayor o igual a 5 sumamos 1 a numAprobados
                numAprobados ++;
            }
        }

        //Devolvemos el número de aprobados
        return numAprobados;
    }

    //Función para incrementar un valor a las notas
    static void subirNotas(double[] notas, double incremento){
        for (int i = 0; i < notas.length; i++){ // Recorrer con índice
            notas[i] += incremento;
            if(notas[i] > 10){
                notas[i] = 10;
            }
        }
    }
}
