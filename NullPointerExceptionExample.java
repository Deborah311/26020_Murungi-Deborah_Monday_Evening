package monday;


import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (or type 'null' to simulate a NullPointerException):");
        String input = scanner.nextLine();

        // Simulating a null value based on user input
        String str = input.equalsIgnoreCase("null") ? null : input;

        try {
            // Accessing method length() on a potentially null object
            System.out.println("The length of the entered string is: " + str.length());
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("NullPointerException: Cannot access methods on a null reference.");
        }
    }
}
