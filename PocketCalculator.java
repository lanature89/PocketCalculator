/*	Author: Alexis Dionne
 * 	This program acts as a calculator
 * 	Taking 2 inputs from user and outputting
 * 	The results
 * 
 * 	Started: 07/05/2018
 * 	Updated: 07/05/2018
 */

import java.util.Scanner;

public class PocketCalculator {

	public static void main(String[] args) {
		// MY VARIABLES
		Scanner operand1 = new Scanner(System.in);
		Scanner operand2 = new Scanner(System.in);
		Scanner operand3 = new Scanner(System.in);
		Scanner operand4 = new Scanner(System.in);
		int inputOfOperand1, inputOfOperand2;
		double inputOfOperand3, inputOfOperand4;
		
		// Step 1, greet the user
		System.out.println("Hello, thanks for using Pocket Calculator!");
		
		// Step 2, ask the users for two operands and assign them to int
		System.out.print("Please enter operand 1: ");
		inputOfOperand1 = operand1.nextInt();
		System.out.print("Please enter operand 2: ");
		inputOfOperand2 = operand2.nextInt();
		
		// Step 3, calculates the results and print them for int
		// + , - , * , / , % in that order.
		System.out.println(inputOfOperand1 + "+" + inputOfOperand2 + "=" + (inputOfOperand1+inputOfOperand2));
		System.out.println(inputOfOperand1 + "-" + inputOfOperand2 + "=" + (inputOfOperand1-inputOfOperand2));
		System.out.println(inputOfOperand1 + "*" + inputOfOperand2 + "=" + (inputOfOperand1*inputOfOperand2));
		System.out.println(inputOfOperand1 + "/" + inputOfOperand2 + "=" + (inputOfOperand1/inputOfOperand2));
		System.out.println(inputOfOperand1 + "%" + inputOfOperand2 + "=" + (inputOfOperand1%inputOfOperand2));
		
		// Step 4 ask the user for two operands and assign them to double.
		System.out.println("Now let's try with doubles: ");
		System.out.print("Please enter operand 3: ");
		inputOfOperand3 = operand1.nextDouble();
		System.out.print("Please enter operand 4: ");
		inputOfOperand4 = operand2.nextDouble();
		
		// Step 5, calculates the results and print them for doubles.
		// + , - , * , / , % in that order.
		System.out.println(inputOfOperand3 + "+" + inputOfOperand4 + "=" + (inputOfOperand3+inputOfOperand4));
		System.out.println(inputOfOperand3 + "-" + inputOfOperand4 + "=" + (inputOfOperand3-inputOfOperand4));
		System.out.println(inputOfOperand3 + "*" + inputOfOperand4 + "=" + (inputOfOperand3*inputOfOperand4));
		System.out.println(inputOfOperand3 + "/" + inputOfOperand4 + "=" + (inputOfOperand3/inputOfOperand4));
		System.out.println(inputOfOperand3 + "%" + inputOfOperand4 + "=" + (inputOfOperand3%inputOfOperand4));
		
		
		// Step 6, close the scanner and say goodbye to user!
		operand1.close();
		operand2.close();
		operand3.close();
		operand4.close();
		System.out.println("Thank you for trusting PocketCalculator with your precious numbers.");
		
	}

}
