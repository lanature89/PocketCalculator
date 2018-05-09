/*	Author: Alexis Dionne
 * 	This program acts as a pocket calculator
 * 	Started: 07/05/2018
 * 	Updated: 08/05/2018
 */

import java.util.Scanner;

public class PocketCalculator {

	public static void main(String[] args) {
		// MY VARIABLES
		Scanner userInput = new Scanner(System.in);
		int number1, number2;
		double double1, double2;	

		// Step 1, greet the user
		System.out.println("Hello, thanks for using Pocket Calculator!");
				
		// Step 2, ask the users for two int and assign them to variables
		System.out.print("Please enter operand 1: ");
		number1 = userInput.nextInt();
		System.out.print("Please enter operand 2: ");
		number2 = userInput.nextInt();
		
		// Step 3, calculates the results and print them for int
		// + , - , * , / , % in that order.
		System.out.println(number1 + "+" + number2 + "=" + (number1+number2));
		System.out.println(number1 + "-" + number2 + "=" + (number1-number2));
		System.out.println(number1 + "*" + number2 + "=" + (number1*number2));
		System.out.println(number1 + "/" + number2 + "=" + (number1/number2));
		System.out.println(number1 + "%" + number2 + "=" + (number1%number2));
		System.out.println("");
		
		// Step 4 ask the user for two operands and assign them to double.
		System.out.println("Now let's try with doubles: ");
		System.out.print("Please enter operand 3: ");
		double1 = userInput.nextDouble();
		System.out.print("Please enter operand 4: ");
		double2 = userInput.nextDouble();
		
		// Step 5, calculates the results and print them for doubles.
		// + , - , * , / , % in that order.
		System.out.println(double1 + "+" + double2 + "=" + (double1+double2));
		System.out.println(double1 + "-" + double2 + "=" + (double1-double2));
		System.out.println(double1 + "*" + double2 + "=" + (double1*double2));
		System.out.println(double1 + "/" + double2 + "=" + (double1/double2));
		System.out.println(double1 + "%" + double2 + "=" + (double1%double2));
		System.out.println("");
		
		
		// Step 6, close the scanner and say goodbye to user!
		userInput.close();
		System.out.println("Thank you for trusting PocketCalculator with your precious numbers.");
	}

}
