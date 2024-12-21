package monday;




import java.util.Scanner;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fully qualified class name to load (for ClassNotFoundException test):");
        String className = scanner.nextLine();

        try {
            // Attempting to load a class dynamically using its name
            Class.forName(className);
            System.out.println("Class loaded successfully: " + className);
        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException
            System.out.println("ClassNotFoundException: The specified class '" + className + "' was not found.");
        }
    }
}
