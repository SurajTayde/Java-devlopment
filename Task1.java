import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Prompt the user to enter the temperature value
        System.out.print("Enter the temperature value: ");

        Scanner sc = new Scanner(System.in); // Create Scaner For Input From User

        double temperature = sc.nextDouble();

        // promt the user to enter the unit (C for Celsius, F for Fahrenheit)
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");

        // change charactor inpur case lower to upper and only first caractor consider
        // for compilation
        char unit = sc.next().toUpperCase().charAt(0);

        // Perform conversion based on the unit
        if (unit == 'C') {
            // Convert Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32; // Formula
            System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, fahrenheit);
        } else if (unit == 'F') {
            // Convert Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9; // Formula
            System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, celsius);
        } else {
            // Invalid unit input
            System.out.println("Invalid unit entered. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
        sc.close();// Close the scanner
    }
}
