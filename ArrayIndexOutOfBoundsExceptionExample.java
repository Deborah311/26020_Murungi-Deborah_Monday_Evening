package monday;




import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};  // Example array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an index to access in an array (for ArrayIndexOutOfBoundsException test):");
        int index = scanner.nextInt();

        try {
            // Trying to access an invalid index will trigger ArrayIndexOutOfBoundsException
            System.out.println("The number at index " + index + " is " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception when the index is out of bounds
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index. Please enter a valid index.");
        }
    }
}
