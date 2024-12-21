package monday;



import java.util.Scanner;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to attempt casting to String (for ClassCastException test):");
        int number = scanner.nextInt();

        try {
            // Attempting to cast an Integer to a String will cause ClassCastException
            Object obj = number; // Wrapping the integer in an Object
            String str = (String) obj; // Attempting invalid cast
        } catch (ClassCastException e) {
            // Handling ClassCastException
            System.out.println("ClassCastException: Invalid cast attempted. Cannot cast Integer to String.");
        }
    }
}
