package monday;




import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to test division by zero (for ArithmeticException test):");
        int num = scanner.nextInt();

        try {
            // Dividing by zero to intentionally cause ArithmeticException
            int result = num / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling ArithmeticException when dividing by zero
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }
    }
}
