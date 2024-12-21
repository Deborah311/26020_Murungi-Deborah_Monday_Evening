package monday;




import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to convert to an integer (for NumberFormatException test):");
        String input = scanner.nextLine();

        try {
            // Trying to parse the input string as an integer
            int number = Integer.parseInt(input);
            System.out.println("Conversion successful! Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException when input is not a valid integer
            System.out.println("NumberFormatException: The input '" + input + "' is not a valid integer.");
        }
    }
}
