/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserManager {
public void addUserToDatabase(String username, String password, String role) {
        try (Connection connection = DBConnector.getConnection()) {
            String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, username);
                statement.setString(2, password);
                statement.setString(3, role);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("User added successfully.");
                } else {
                    System.out.println("Failed to add user.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to modify an existing user in the database
    public void modifyUserInDatabase(String username, String newPassword, String newRole) {
        try (Connection connection = DBConnector.getConnection()) {
            String query = "UPDATE users SET password = ?, role = ? WHERE username = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, newPassword);
                statement.setString(2, newRole);
                statement.setString(3, username);
                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("User modified successfully.");
                } else {
                    System.out.println("Failed to modify user.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete an existing user from the database
    public void deleteUserFromDatabase(String username) {
        try (Connection connection = DBConnector.getConnection()) {
            String query = "DELETE FROM users WHERE username = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, username);
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("User deleted successfully.");
                } else {
                    System.out.println("Failed to delete user. User not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
