import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Random Password Generator!");
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        String password = generatePassword(length, includeLowercase, includeUppercase, includeNumbers, includeSpecialChars, random);
        
        if (password != null) {
            System.out.println("Your generated password is: " + password);
        } else {
            System.out.println("Error: At least one character type must be selected.");
        }
        
        scanner.close();
    }

    private static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase,
                                           boolean includeNumbers, boolean includeSpecialChars, Random random) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{};:,.<>?";
        StringBuilder charPool = new StringBuilder();

        if (includeLowercase) charPool.append(lowercase);
        if (includeUppercase) charPool.append(uppercase);
        if (includeNumbers) charPool.append(numbers);
        if (includeSpecialChars) charPool.append(specialChars);

        if (charPool.length() == 0) {
            return null; // No character types selected
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charPool.length());
            password.append(charPool.charAt(randomIndex));
        }

        return password.toString();
    }
}
