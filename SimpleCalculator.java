import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Prompt the user for the first number
		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();

		// Prompt the user for the second number
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();

		// Prompt the user to choose an operation
		System.out.print("Enter your choice (1-4): ");
		System.out.println("Choose an operation:");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		
		int choice = sc.nextInt();

		// Perform the selected operation
		double result = 0;
		boolean validOperation = true;

		switch (choice) {
			case 1: // Addition
				result = num1 + num2;
				break;
			case 2: // Subtraction
				result = num1 - num2;
				break;
			case 3: // Multiplication
				result = num1 * num2;
				break;
			case 4: // Division
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("Error: Division by zero is not allowed.");
					validOperation = false;
				}
				break;
			default:
				System.out.println("Error: Invalid operation selected.");
				validOperation = false;
		}

		// Display the result
		if (validO444peration) {
			System.out.println("The result is: " + result);
		}

		sc.close();
	}
}
