import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter a password to check its strength: ");
        String password = scanner.nextLine();

        // Analyze the password strength
        int strengthScore = evaluatePasswordStrength(password);

        // Provide feedback based on the strength score
        if (strengthScore <= 2) {
            System.out.println("Weak password. Consider adding more complexity.");
        } else if (strengthScore == 3) {
            System.out.println("Moderate password. You can make it stronger.");
        } else {
            System.out.println("Strong password. Well done!");
        }

        scanner.close();
    }

    /**
     * Evaluates the strength of the password based on defined criteria.
     *
     * @param password the password to evaluate
     * @return the strength score
     */
    public static int evaluatePasswordStrength(String password) {
        int score = 0;

        // Check for length of at least 8 characters
        if (password.length() >= 8) {
            score++;
        }

        // Check for presence of uppercase letters
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Check for presence of lowercase letters
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Check for presence of numbers
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Check for presence of special characters
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            score++;
        }

        return score;
    }
}

