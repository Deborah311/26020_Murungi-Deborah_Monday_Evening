package monday;




import java.util.Scanner;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompting the user to enter a number for the test
        System.out.println("Enter a negative number (for IllegalArgumentException test):");
        int number = scanner.nextInt();

        try {
            // Checking for an invalid value
            if (number < 0) {
                throw new IllegalArgumentException("The number cannot be negative.");
            }
            System.out.println("The number is valid: " + number);
        } catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
