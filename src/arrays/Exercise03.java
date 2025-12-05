/*
 * Escribe un programa que lea 10 números por teclado, los almacene en una tabla, y que luego 
 * los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse.
 */

package arrays;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int table[] = new int[10];
		
		//Ask for the numbers
		for (int i = 0; i < table.length; i++) {
			System.out.println("Input the element " + (i+1) + ": ");
			table[i] = sc.nextInt();
		}
		
		//Show the numbers in inverted order
		for (int i = table.length - 1; i >= 0; i--) {
			System.out.println("Value " + (i+1) + ": " + table[i]);
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
