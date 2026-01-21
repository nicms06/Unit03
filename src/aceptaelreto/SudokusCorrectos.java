//Problema Sudokus Correctos de "Acepta el Reto": https://aceptaelreto.com/problem/statement.php?id=345&cat=14
package aceptaelreto;

import java.util.Scanner;

public class SudokusCorrectos {
     static void main(String[] args) {
        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario el número de matrices a validar
        System.out.print("Introduce el número de Sudokus que desea realizar: ");
        int numSudokus = sc.nextInt();

        //Bucle para validar las matrices que desee el usuario
        for (int i = 0; i < numSudokus; i++){
            //Llamamos a la función con la que rellenamos el sudoku y guardamos los valores dentro de la variable sudoku
            int[][] sudoku = pedirMatriz(sc);

            //Llamamos la función que comprueba si el sudoku es correcto y le pasamos como parámetro la variable sudoku
            String esCorrecto = comprobarSudokuCorrecta(sudoku) ? "SI" : "NO";

            //Mostramos el resultado
            System.out.println(esCorrecto);
        }

        //Cerramos el Scanner
        sc.close();
    }

    //Función que pide al usuario que introduzca una un sudoku (matriz 9x9)
    static int[][] pedirMatriz(Scanner sc){

        //Creamos la matriz vacía
        int[][] sudoku = new int[9][9];

        //Le pedimos al usuario los valores de la matriz
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print("Valor " + i + " | " + j + ": ");
                sudoku[i][j] = sc.nextInt();

                //Nos aseguramos de que el valor está entre 1 y 9
                while (sudoku[i][j] < 1 || sudoku[i][j] > 9 ){
                    System.out.print("ERROR. Valor no permitido: ");
                    sudoku[i][j] = sc.nextInt();
                }
            }
        }

        //Devolvemos el sudoku
        return sudoku;
    }

    //Función que va a comprobar si la matriz es correcta o no
    static boolean comprobarSudokuCorrecta(int[][] sudoku){
        //Primero validamos que no se repita ningún número en cada fila ni en cada columna
        for (int i = 0; i < sudoku.length; i++){
            for (int j = 0; j < sudoku.length; j++){
                for (int k = j + 1; k < sudoku.length; k++){
                    //Validamos las filas
                    if (sudoku[i][j] == sudoku[i][k]) return false;
                    //Validamos las columnas
                    if (sudoku[j][i] == sudoku[k][i]) return false;
                }
            }
        }
        //Ahora validamos que no se repita ningún número en ninguna de las celdas
        for (int filaCelda = 0; filaCelda < 9; filaCelda += 3){
            for (int columnaCelda = 0; columnaCelda < 9; columnaCelda += 3){
                //Creamos un array para meter todos los valores de la celda
                boolean[] vistos = new boolean[9];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int valor = sudoku[filaCelda + i][columnaCelda +j];
                        if(vistos[valor - 1]) return false;
                        vistos[valor - 1] = true;
                    }
                }

            }

        }

        //Devolvemos true
        return true;
    }
}
