/*
 * Sumar elementos de un array
 */

package practicar;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create the variables
		int length;
		
		//Ask the user for the length
		System.out.print("Please, input the length: ");
		length = sc.nextInt();
		
		//Create the array
		int array[] = new int[length];
		
		//Fill the array
		for (int i = 0; i < length; i++) {
			System.out.print("Número " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
		
		//Call the function and print it
		System.out.println("The sum is " + sum(array));
		
		//Close the Scanner
		sc.close();
		
	}
	
	//Function to sum the values of the array
	static int sum(int t[]) {
		
		//Create the variable sum = 0
		int sum = 0;
		
		//Iterate through the array
		for (int i = 0; i < t.length; i++) {
			sum += t[i];
		}
		
		//Return the sum
		return sum;
	}
		
}
