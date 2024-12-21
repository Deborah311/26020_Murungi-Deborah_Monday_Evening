package monday;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        System.out.println("Attempting to connect to a database (for SQLException test)...");

        try {
            // Attempting to connect to a non-existent database
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/invalidDB", "user", "password");
            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            // Handling SQLException when database connection fails
            System.out.println("SQLException: Unable to connect to the database.");
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}
