package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class DB {
    private static final String URL = "jdbc:mysql://localhost:3306/cafe";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Method to insert user data into the database
    public static boolean insertUser(String username, String password) {
        String query = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Set parameters for the query
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute the insert query
            int rowsInserted = statement.executeUpdate();

            // Check if the insertion was successful
            if (rowsInserted > 0) {
                System.out.println("User inserted successfully.");
                return true;
            } else {
                System.out.println("Failed to insert user.");
                return false;
            }
        } catch (SQLException e) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, "SQL error occurred.", e);
            return false;
        }
    }
     public static boolean validateUser(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Set parameters for the query
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            // Check if any row is returned
            if (resultSet.next()) {
                System.out.println("Login successful.");
                return true; // User found in the database
            } else {
                System.out.println("Login failed. Invalid username or password.");
                return false; // No user found in the database
            }
        } catch (SQLException e) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, "SQL error occurred.", e);
            return false; // Error occurred during database query
        }
    }
}
