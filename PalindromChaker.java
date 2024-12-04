import java.util.Scanner;

    public class PalindromChaker {

    
    public static String cleanInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a word or phrase:");
        String input = scanner.nextLine();

        // Clean and check for palindrome
        String cleanedInput = cleanInput(input);
        if (isPalindrome(cleanedInput)) {
            System.out.println("The input is a palindrome!");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        scanner.close();
    }
}
