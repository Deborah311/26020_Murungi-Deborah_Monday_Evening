package monday;




import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class ExceptionHandlingExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an exception to demonstrate:");
        System.out.println("1. IOException\n2. FileNotFoundException\n3. EOFException\n4. SQLException\n" +
                "5. ClassNotFoundException\n6. ArithmeticException\n7. NullPointerException\n" +
                "8. ArrayIndexOutOfBoundsException\n9. ClassCastException\n10. IllegalArgumentException\n" +
                "11. NumberFormatException");
        int choice = scanner.nextInt();

        // Switch case to choose and demonstrate exceptions
        switch (choice) {
            case 1 -> demonstrateIOException();
            case 2 -> demonstrateFileNotFoundException();
            case 3 -> demonstrateEOFException();
            case 4 -> demonstrateSQLException();
            case 5 -> demonstrateClassNotFoundException();
            case 6 -> demonstrateArithmeticException();
            case 7 -> demonstrateNullPointerException();
            case 8 -> demonstrateArrayIndexOutOfBoundsException();
            case 9 -> demonstrateClassCastException();
            case 10 -> demonstrateIllegalArgumentException();
            case 11 -> demonstrateNumberFormatException();
            default -> System.out.println("Invalid choice. Please select a number between 1 and 11.");
        }
    }

    public static void demonstrateIOException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path to read (IOException test):");
        String filePath = scanner.nextLine();
        try {
            FileReader reader = new FileReader(filePath);
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void demonstrateFileNotFoundException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path to open (FileNotFoundException test):");
        String filePath = scanner.nextLine();
        try {
            FileInputStream file = new FileInputStream(filePath);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }

    public static void demonstrateEOFException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path to read as binary data (EOFException test):");
        String filePath = scanner.nextLine();
        try (DataInputStream input = new DataInputStream(new FileInputStream(filePath))) {
            while (true) {
                System.out.println("Read byte: " + input.readByte());
            }
        } catch (EOFException e) {
            System.out.println("Caught EOFException: End of file reached.");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void demonstrateSQLException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a database URL (SQLException test):");
        String dbUrl = scanner.nextLine();
        try {
            Connection connection = DriverManager.getConnection(dbUrl, "user", "password");
            System.out.println("Connected to database successfully.");
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }

    public static void demonstrateClassNotFoundException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a class name to load (ClassNotFoundException test):");
        String className = scanner.nextLine();
        try {
            Class.forName(className);
            System.out.println("Class loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }

    public static void demonstrateArithmeticException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numerator and denominator (ArithmeticException test):");
        try {
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            System.out.println("Result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        }
    }

    public static void demonstrateNullPointerException() {
        System.out.println("Attempting to access a null object (NullPointerException test).");
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void demonstrateArrayIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index to access in an array of size 3 (ArrayIndexOutOfBoundsException test):");
        int[] arr = {1, 2, 3};
        try {
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void demonstrateClassCastException() {
        System.out.println("Attempting to cast an object incorrectly (ClassCastException test).");
        try {
            Object obj = 42;
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    public static void demonstrateIllegalArgumentException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a negative number (IllegalArgumentException test):");
        int number = scanner.nextInt();
        try {
            if (number < 0) throw new IllegalArgumentException("Negative numbers are not allowed.");
            System.out.println("Number is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void demonstrateNumberFormatException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-numeric string to parse as a number (NumberFormatException test):");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
